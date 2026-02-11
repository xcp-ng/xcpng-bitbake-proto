
PN = "libtasn1"
PE = "0"
PV = "4.20.0"
PR = "1.el10"
PACKAGES = "libtasn1 libtasn1-devel libtasn1-tools"


URI_libtasn1 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libtasn1-4.20.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtasn1 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:libtasn1 = "libtasn1.so.6()(64bit) ( ) libtasn1.so.6(LIBTASN1_0_3)(64bit) ( ) libtasn1.so.6(LIBTASN1_4_16_0)(64bit) ( ) bundled(gnulib) ( =  20130324) libtasn1 ( =  4.20.0-1.el10) libtasn1(x86-64) ( =  4.20.0-1.el10)"

URI_libtasn1-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libtasn1-devel-4.20.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtasn1-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libtasn1.so.6()(64bit) ( ) libtasn1(x86-64) ( =  4.20.0-1.el10) libtasn1-tools ( =  4.20.0-1.el10) libtasn1 ( =  4.20.0-1.el10)"
RPROVIDES:libtasn1-devel = "libtasn1-devel ( =  4.20.0-1.el10) libtasn1-devel(x86-64) ( =  4.20.0-1.el10) pkgconfig(libtasn1) ( =  4.20.0)"

URI_libtasn1-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libtasn1-tools-4.20.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtasn1-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libtasn1.so.6()(64bit) ( ) libtasn1.so.6(LIBTASN1_0_3)(64bit) ( ) libtasn1(x86-64) ( =  4.20.0-1.el10)"
RPROVIDES:libtasn1-tools = "libtasn1-tools ( =  4.20.0-1.el10) libtasn1-tools(x86-64) ( =  4.20.0-1.el10)"
