package org.app;

import net.sourceforge.jpcap.capture.PacketCapture;
import net.sourceforge.jpcap.capture.RawPacketListener;
import net.sourceforge.jpcap.net.RawPacket;

/**
 * Hello world!
 * 
 */
public class App {
		private static final int INFINITE =-1;
		private static final int PACKET_COUNT = 10;

		private static final String FILTER = "";

		private PacketCapture m_pcap;
		private String m_device;

		public void Example() throws Exception{
			m_pcap = new PacketCapture();
			m_device = m_pcap.findDevice();
			m_pcap.open(m_device, true);
			m_pcap.setFilter(FILTER, true);
			m_pcap.addRawPacketListener(new RawPacketHandler());
			m_pcap.capture(PACKET_COUNT);
		}

		public static void main(String[] args){
			try{
				App app = new App();
				app.Example();
			} catch(Exception e){
				System.exit(1);
			}
		}

		class RawPacketHandler implements RawPacketListener{
			private int m_counter = 0;

			public void rawPacketArrived(RawPacket data){
				m_counter ++;
				System.out.println("Received packet (" + m_counter + ")");
			}
		}
}
