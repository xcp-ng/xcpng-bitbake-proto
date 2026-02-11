
PN = "gzip"
PE = "0"
PV = "1.13"
PR = "3.el10"
PACKAGES = "gzip"


URI_gzip = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/gzip-1.13-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gzip = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) coreutils ( ) /usr/bin/sh ( )"
RPROVIDES:gzip = "bundled(gnulib) ( ) /bin/gunzip ( ) /bin/gzip ( ) /bin/zcat ( ) gzip ( =  1.13-3.el10) gzip(x86-64) ( =  1.13-3.el10)"
