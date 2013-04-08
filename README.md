IOL Hacker
==========

A simple Java program that sniffs the network and displays the DNIs and passwords that are exhibit in the plain text of a POST HTTP req.

It uses tcpdump for sniffing so it must be installed on the machine.

Another possible aproach it's using the jpcap lib, provided by SourceForce http://sourceforge.net/projects/jpcap/. It uses the libcap library, that must be installed to work.

Why did I do this?
------------------

To show why it is so important to CHANGE PERIODICALLY your passwords in your accounts. There are many leaks and bugs in the secutiry systems, such as passing passwords as plain text, and you'll have a better result if you have some conciderations each both.

Further reading about this development
-----------------------------------------

http://recursos.aldabaknocking.com/libpcapHakin9LuisMartinGarcia.pdf

http://jnetpcap.com/

http://httppp.g76r.eu/

http://www.tcpdump.org/

http://eecs.wsu.edu/~sshaikot/docs/lbpcap/libpcap-tutorial.pdf

http://sourceforge.net/projects/jpcap/



