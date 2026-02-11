
PN = "sed"
PE = "0"
PV = "4.9"
PR = "3.el10"
PACKAGES = "sed"


URI_sed = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/sed-4.9-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sed = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libacl.so.1()(64bit) ( ) libacl.so.1(ACL_1.0)(64bit) ( )"
RPROVIDES:sed = "bundled(gnulib) ( ) /bin/sed ( ) sed ( =  4.9-3.el10) sed(x86-64) ( =  4.9-3.el10)"
