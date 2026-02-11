
PN = "lsof"
PE = "0"
PV = "4.98.0"
PR = "7.el10"
PACKAGES = "lsof"


URI_lsof = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/lsof-4.98.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lsof = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libtirpc.so.3()(64bit) ( ) libtirpc.so.3(TIRPC_0.3.0)(64bit) ( )"
RPROVIDES:lsof = "lsof ( =  4.98.0-7.el10) lsof(x86-64) ( =  4.98.0-7.el10)"
