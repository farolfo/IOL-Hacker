IOL Hacker
==========

A simple Java program that sniffs the network and displays the DNIs and passwords that are exhibit in the plain text of a POST HTTP req.

This implementation uses the 'jpcap' lib, provided by SourceForce http://sourceforge.net/projects/jpcap/. 
Besides, 'jpcap' uses the 'libcap' library, that must be installed and well configured to work.

Execution
---------

Download the iolHacker.jar file and run

    java -jar iolHacker.jar [-i interface]

You can sepcify an interface in command line, it must be the name of the device you want to capture passwords from(i.e. eth0, eth1).
If you don't specify it, the program will choose one, AND THERE IS NO GUARANTEE THAT INTERFACE IS ACTIVATED.


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



