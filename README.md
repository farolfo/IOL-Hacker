IOL Hacker
==========

A simple Java program that sniffs the network and displays the DNIs and passwords that are exhibit in the plain text of a POST HTTP req.

This implementation uses the <code>jpcap</code> lib, provided by SourceForce (http://sourceforge.net/projects/jpcap/). 
Besides, <code>jpcap</code> uses the <code>libcap</code> library, that must be installed and well configured to work.

Execution
---------

Download the iolHacker.jar file and run

    java -jar iolHacker.jar [-i interface]

You can sepcify an interface in command line, it must be the name of the device you want to capture passwords from(i.e. <code>eth0</code>, <code>eth1</code>).
If you don't specify it, the program will choose one, AND THERE IS NO GUARANTEE THAT INTERFACE IS ACTIVATED.

NOTE: As this application is still under development, we suggest that you provide an interface to sniff. You may now your interfaces with the commands <code>ipconfig</code> (Windows) or <code>ifconfig</code> (Unix).

###Example

Sniffing interface <code>en1</code>

    $> java -jar iolHacker.jar -i en1
    $> ...

    
Why did I do this?
------------------

To show why it is so important to CHANGE PERIODICALLY your passwords in your accounts. There are many leaks and bugs in the secutiry systems, such as passing passwords as plain text, and you'll have a better result if you have some conciderations each both.

Further reading about this development
-----------------------------------------

Some tutorials about jpcap and libcap
>http://recursos.aldabaknocking.com/libpcapHakin9LuisMartinGarcia.pdf

>http://eecs.wsu.edu/~sshaikot/docs/lbpcap/libpcap-tutorial.pdf

The jpcap project
>http://sourceforge.net/projects/jpcap/

>https://github.com/jpcap/jpcap

Another library similar to jpcap
>http://jnetpcap.com/

An HTTP analyzer
>http://httppp.g76r.eu/

THE sniffer
>http://www.wireshark.org/

Another popular sniffer
>http://www.tcpdump.org/


------------------------------------------------------------------------------------------
Happy hackin' !



