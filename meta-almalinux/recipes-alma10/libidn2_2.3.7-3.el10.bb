
PN = "libidn2"
PE = "0"
PV = "2.3.7"
PR = "3.el10"
PACKAGES = "libidn2 idn2 libidn2-devel"


URI_libidn2 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libidn2-2.3.7-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libidn2 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libunistring.so.5()(64bit) ( )"
RPROVIDES:libidn2 = "bundled(gnulib) ( ) libidn2.so.0()(64bit) ( ) libidn2.so.0(IDN2_0.0.0)(64bit) ( ) libidn2.so.0(IDN2_2.1.0)(64bit) ( ) libidn2.so.0(IDN2_2.3.5)(64bit) ( ) libidn2 ( =  2.3.7-3.el10) libidn2(x86-64) ( =  2.3.7-3.el10)"

URI_idn2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/idn2-2.3.7-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:idn2 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libidn2.so.0()(64bit) ( ) libidn2.so.0(IDN2_0.0.0)(64bit) ( ) libunistring.so.5()(64bit) ( ) libidn2(x86-64) ( =  2.3.7-3.el10)"
RPROVIDES:idn2 = "idn2 ( =  2.3.7-3.el10) idn2(x86-64) ( =  2.3.7-3.el10)"

URI_libidn2-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libidn2-devel-2.3.7-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libidn2-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libidn2.so.0()(64bit) ( ) libidn2(x86-64) ( =  2.3.7-3.el10)"
RPROVIDES:libidn2-devel = "libidn2-devel ( =  2.3.7-3.el10) libidn2-devel(x86-64) ( =  2.3.7-3.el10) pkgconfig(libidn2) ( =  2.3.7)"
