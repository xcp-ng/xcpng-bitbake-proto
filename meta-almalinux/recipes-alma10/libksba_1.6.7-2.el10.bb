
PN = "libksba"
PE = "0"
PV = "1.6.7"
PR = "2.el10"
PACKAGES = "libksba libksba-devel"


URI_libksba = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libksba-1.6.7-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libksba = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgpg-error.so.0()(64bit) ( ) libgpg-error.so.0(GPG_ERROR_1.0)(64bit) ( )"
RPROVIDES:libksba = "libksba.so.8()(64bit) ( ) libksba.so.8(KSBA_0.9)(64bit) ( ) libksba.so.8(KSBA_PRIVATE_TESTS)(64bit) ( ) libksba ( =  1.6.7-2.el10) libksba(x86-64) ( =  1.6.7-2.el10)"

URI_libksba-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libksba-devel-1.6.7-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libksba-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) /usr/bin/sh ( ) pkgconfig(gpg-error) ( ) libksba.so.8()(64bit) ( ) libksba(x86-64) ( =  1.6.7-2.el10)"
RPROVIDES:libksba-devel = "libksba-devel ( =  1.6.7-2.el10) libksba-devel(x86-64) ( =  1.6.7-2.el10) pkgconfig(ksba) ( =  1.6.7)"
