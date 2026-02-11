
PN = "isns-utils"
PE = "0"
PV = "0.103"
PR = "1.el10"
PACKAGES = "isns-utils isns-utils-libs isns-utils-devel"


URI_isns-utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/isns-utils-0.103-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:isns-utils = "/bin/sh ( ) systemd-units ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libisns.so.0()(64bit) ( ) libisns.so.0(LIBISNS_0.96)(64bit) ( ) libisns.so.0(LIBISNS_PRIVATE)(64bit) ( ) isns-utils-libs(x86-64) ( =  0.103-1.el10)"
RPROVIDES:isns-utils = "config(isns-utils) ( =  0.103-1.el10) isns-utils ( =  0.103-1.el10) isns-utils(x86-64) ( =  0.103-1.el10)"

URI_isns-utils-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/isns-utils-libs-0.103-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:isns-utils-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:isns-utils-libs = "libisns.so.0()(64bit) ( ) libisns.so.0(LIBISNS_0.96)(64bit) ( ) libisns.so.0(LIBISNS_PRIVATE)(64bit) ( ) isns-utils-libs(x86-64) ( =  0.103-1.el10) isns-utils-libs ( =  0.103-1.el10)"

URI_isns-utils-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/isns-utils-devel-0.103-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:isns-utils-devel = "/usr/bin/pkg-config ( ) libisns.so.0()(64bit) ( ) isns-utils-libs(x86-64) ( =  0.103-1.el10)"
RPROVIDES:isns-utils-devel = "isns-utils-devel ( =  0.103-1.el10) isns-utils-devel(x86-64) ( =  0.103-1.el10) pkgconfig(libisns) ( =  0)"
