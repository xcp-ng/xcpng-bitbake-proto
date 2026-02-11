
PN = "mcstrans"
PE = "0"
PV = "3.8"
PR = "1.el10"
PACKAGES = "mcstrans"


URI_mcstrans = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/mcstrans-3.8-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mcstrans = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libcap.so.2()(64bit) ( ) libpcre2-8.so.0()(64bit) ( ) pcre2 ( )"
RPROVIDES:mcstrans = "setransd ( ) libsetrans ( ) mcstrans ( =  3.8-1.el10) mcstrans(x86-64) ( =  3.8-1.el10)"
