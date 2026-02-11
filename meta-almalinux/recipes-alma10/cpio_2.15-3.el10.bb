
PN = "cpio"
PE = "0"
PV = "2.15"
PR = "3.el10"
PACKAGES = "cpio"


URI_cpio = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cpio-2.15-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cpio = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:cpio = "bundled(gnulib) ( ) bundled(paxutils) ( ) /bin/cpio ( ) cpio ( =  2.15-3.el10) cpio(x86-64) ( =  2.15-3.el10)"
