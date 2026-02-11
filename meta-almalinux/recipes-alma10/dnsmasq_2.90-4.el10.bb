
PN = "dnsmasq"
PE = "0"
PV = "2.90"
PR = "4.el10"
PACKAGES = "dnsmasq dnsmasq-utils dnsmasq-langpack"


URI_dnsmasq = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dnsmasq-2.90-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dnsmasq = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libdbus-1.so.3()(64bit) ( ) libdbus-1.so.3(LIBDBUS_1_3)(64bit) ( ) libgmp.so.10()(64bit) ( ) libidn2.so.0()(64bit) ( ) libidn2.so.0(IDN2_0.0.0)(64bit) ( ) nettle ( ) libhogweed.so.6()(64bit) ( ) libnetfilter_conntrack.so.3()(64bit) ( ) libnettle.so.8()(64bit) ( ) libhogweed.so.6(HOGWEED_6)(64bit) ( ) libnettle.so.8(NETTLE_8)(64bit) ( )"
RPROVIDES:dnsmasq = "group(dnsmasq) ( ) config(dnsmasq) ( =  2.90-4.el10) dnsmasq ( =  2.90-4.el10) dnsmasq(x86-64) ( =  2.90-4.el10) user(dnsmasq) ( =  dSBkbnNtYXNxIC0gIkRuc21hc3EgREhDUCBhbmQgRE5TIHNlcnZlciIgL3Zhci9saWIvZG5zbWFzcQAA)"

URI_dnsmasq-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dnsmasq-utils-2.90-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dnsmasq-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:dnsmasq-utils = "dnsmasq-utils ( =  2.90-4.el10) dnsmasq-utils(x86-64) ( =  2.90-4.el10)"

URI_dnsmasq-langpack = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/dnsmasq-langpack-2.90-4.el10.noarch.rpm;unpack=0"
RDEPENDS:dnsmasq-langpack = "dnsmasq ( =  2.90-4.el10)"
RPROVIDES:dnsmasq-langpack = "dnsmasq-langpack ( =  2.90-4.el10)"
