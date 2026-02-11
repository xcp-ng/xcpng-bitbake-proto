
PN = "blktrace"
PE = "0"
PV = "1.3.0"
PR = "13.el10"
PACKAGES = "blktrace iowatcher"


URI_blktrace = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/blktrace-1.3.0-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:blktrace = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/sh ( ) /usr/bin/python3 ( ) libaio.so.1()(64bit) ( ) libaio.so.1(LIBAIO_0.1)(64bit) ( ) libaio.so.1(LIBAIO_0.4)(64bit) ( ) librsvg2-tools ( )"
RPROVIDES:blktrace = "blktrace ( =  1.3.0-13.el10) blktrace(x86-64) ( =  1.3.0-13.el10)"

URI_iowatcher = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/iowatcher-1.3.0-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:iowatcher = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) blktrace ( ) sysstat ( ) theora-tools ( )"
RPROVIDES:iowatcher = "iowatcher ( =  1.3.0-13.el10) iowatcher(x86-64) ( =  1.3.0-13.el10)"
