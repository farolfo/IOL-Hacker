IOL Hacker
==========

A simple Java program that [sniffs](http://en.wikipedia.org/wiki/Packet_analyzer) the network and displays the DNIs and passwords that are exhibit in the plain text of a POST HTTP req.

This implementation uses the [<code>jpcap</code>](http://sourceforge.net/projects/jpcap/) lib, provided by [SourceForce](http://sourceforge.net/). 
Besides, <code>jpcap</code> uses the [<code>libpcap</code>](http://www.tcpdump.org/) library, that must be installed and well configured to work.

Execution
---------

Download the iolHacker.jar file and run

    java -jar iolHacker.jar [-i interface]

You can sepcify an interface in command line, it must be the name of the device you want to capture passwords from(i.e. <code>eth0</code>, <code>eth1</code>).
If you don't specify it, the program will choose one, AND THERE IS NO GUARANTEE THAT INTERFACE IS ACTIVATED.

NOTE: As this application is still under development, we suggest that you provide an interface to sniff. You may now your interfaces with the commands <code>ipconfig</code> (Windows) or <code>ifconfig</code> (Unix).

###Example

Sniffing interface <code>en1</code>

    ~$ java -jar iolHacker.jar -i en1
    PacketCapture: loading native library jpcap.. ok
    
    _____________________       ______  __            ______              
     ____  _/_  __ \__  /       ___  / / /_____ _________  /______________
      __  / _  / / /_  /        __  /_/ /_  __ `/  ___/_  //_/  _ \_  ___/
    ___/ /  / /_/ /_  /___      _  __  / / /_/ // /__ _  ,<  /  __/  /    
     /___/  \____/ /_____/      /_/ /_/  \__,_/ \___/ /_/|_| \___//_/ v1.0
    -----------------------------------------------------------------------
    --       IOL Hacker v1.0 - the ITBA sniffer application !
    -----------------------------------------------------------------------
    ---
    --       Remember, this is not a malware application, my goal here
    --    is to show you why YOU MUST CHANGE YOUR PASS PERIODICALLY !!
    --    and DON'T REPEAT PASS BETWEEN YOUR ACCOUNTS  !!
    ---
    --       Also remember that this are ATTEMPTS that a user does 
    --    to IOL, so some of this passwords might be wrong if the user 
    --    that has typed it did it wrong.
    ---
    ---
    --     The results will be displaied as 
    --			 'dni' | 'password' 
    --
    -----------------------------------------------------------------------
     '36985142' | 'mypass'
     '15427896' | '123456'
     '35856142' | '14257863165413'
     '35214569' | 'chukNorrisWasHere'
    

    
Why did I do this?
------------------

My main goal here is to highlight two things:

* CHANGE PERIODICALLY your passwords in your accounts.
* DON'T REPEAT your passwords between your accounts.
 
There are many leaks and bugs in the secutiry systems of many applications, such as passing passwords as plain text, and you'll have a better result if you have some conciderations each both.

Further reading about this development
-----------------------------------------

The <code>libcap</code> site (you can also find the <code>tcpdump</code>, powerful command-line packet analyzer)
>http://www.tcpdump.org/

The <code>jpcap</code> project
>http://sourceforge.net/projects/jpcap/

>https://github.com/jpcap/jpcap

Some tutorials about <code>jpcap</code> and <code>libcap</code>
>http://recursos.aldabaknocking.com/libpcapHakin9LuisMartinGarcia.pdf

>http://eecs.wsu.edu/~sshaikot/docs/lbpcap/libpcap-tutorial.pdf

Another library similar to <code>jpcap</code>
>http://jnetpcap.com/

An HTTP analyzer
>http://httppp.g76r.eu/

THE sniffer
>http://www.wireshark.org/


------------------------------------------------------------------------------------------
Happy hackin' !



