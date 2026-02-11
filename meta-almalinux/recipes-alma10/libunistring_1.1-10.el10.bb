
PN = "libunistring"
PE = "0"
PV = "1.1"
PR = "10.el10"
PACKAGES = "libunistring libunistring-devel"


URI_libunistring = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libunistring-1.1-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libunistring = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:libunistring = "libunistring.so.5()(64bit) ( ) bundled(gnulib) ( ) libunistring ( =  1.1-10.el10) libunistring(x86-64) ( =  1.1-10.el10)"

URI_libunistring-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libunistring-devel-1.1-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libunistring-devel = "libunistring.so.5()(64bit) ( ) libunistring(x86-64) ( =  1.1-10.el10)"
RPROVIDES:libunistring-devel = "libunistring-devel ( =  1.1-10.el10) libunistring-devel(x86-64) ( =  1.1-10.el10)"
