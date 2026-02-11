
PN = "dhcpcd"
PE = "0"
PV = "10.0.6"
PR = "7.el10"
PACKAGES = "dhcpcd"


URI_dhcpcd = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dhcpcd-10.0.6-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dhcpcd = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/sh ( ) libudev.so.1()(64bit) ( ) libudev.so.1(LIBUDEV_183)(64bit) ( )"
RPROVIDES:dhcpcd = "config(dhcpcd) ( =  10.0.6-7.el10) dhcpcd ( =  10.0.6-7.el10) dhcpcd(x86-64) ( =  10.0.6-7.el10)"
