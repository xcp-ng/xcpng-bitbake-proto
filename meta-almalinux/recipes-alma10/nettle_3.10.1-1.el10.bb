
PN = "nettle"
PE = "0"
PV = "3.10.1"
PR = "1.el10"
PACKAGES = "nettle nettle-devel"


URI_nettle = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/nettle-3.10.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:nettle = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.25)(64bit) ( )"
RPROVIDES:nettle = "libhogweed.so.6()(64bit) ( ) libhogweed.so.6(HOGWEED_6)(64bit) ( ) libhogweed.so.6(HOGWEED_INTERNAL_6_10)(64bit) ( ) libnettle.so.8()(64bit) ( ) libnettle.so.8(NETTLE_8)(64bit) ( ) libnettle.so.8(NETTLE_INTERNAL_8_10)(64bit) ( ) nettle ( =  3.10.1-1.el10) nettle(x86-64) ( =  3.10.1-1.el10)"

URI_nettle-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nettle-devel-3.10.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:nettle-devel = "/usr/bin/pkg-config ( ) gmp-devel(x86-64) ( ) libhogweed.so.6()(64bit) ( ) libnettle.so.8()(64bit) ( ) pkgconfig(nettle) ( ) nettle ( =  3.10.1-1.el10)"
RPROVIDES:nettle-devel = "nettle-devel ( =  3.10.1-1.el10) nettle-devel(x86-64) ( =  3.10.1-1.el10) pkgconfig(hogweed) ( =  3.10.1) pkgconfig(nettle) ( =  3.10.1)"
