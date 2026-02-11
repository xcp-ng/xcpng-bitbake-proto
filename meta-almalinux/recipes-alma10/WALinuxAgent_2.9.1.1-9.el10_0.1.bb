
PN = "WALinuxAgent"
PE = "0"
PV = "2.9.1.1"
PR = "9.el10_0.1"
PACKAGES = "WALinuxAgent WALinuxAgent-udev"


URI_WALinuxAgent = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/WALinuxAgent-2.9.1.1-9.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:WALinuxAgent = "/bin/sh ( ) systemd ( ) /usr/bin/python3 ( ) openssl ( ) python3-pyasn1 ( ) iptables ( ) openssh ( ) parted ( ) openssh-server ( ) python(abi) ( =  3.12) WALinuxAgent-udev ( =  2.9.1.1-9.el10_0.1)"
RPROVIDES:WALinuxAgent = "python3.12dist(walinuxagent) ( =  2.9.1.1) python3dist(walinuxagent) ( =  2.9.1.1) WALinuxAgent ( =  2.9.1.1-9.el10_0.1) config(WALinuxAgent) ( =  2.9.1.1-9.el10_0.1)"

URI_WALinuxAgent-udev = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/WALinuxAgent-udev-2.9.1.1-9.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:WALinuxAgent-udev = "/usr/bin/bash ( )"
RPROVIDES:WALinuxAgent-udev = "WALinuxAgent-udev ( =  2.9.1.1-9.el10_0.1)"
