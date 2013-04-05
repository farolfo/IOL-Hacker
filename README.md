IOL Hacker
==========

A simple Java program that sniffs the network and displays the DNIs and passwords that are exhibit in the plain text of a POST HTTP req.

It uses tcpdump for sniffing so it must be installed on the machine.

Another possible implementations might use jpcap library, but it's not longer supported and needs andother software to be installed to work.
If you know about another similar library for sniffing please tell :)

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

