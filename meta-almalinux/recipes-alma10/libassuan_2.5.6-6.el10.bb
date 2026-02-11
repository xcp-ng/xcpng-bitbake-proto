
PN = "libassuan"
PE = "0"
PV = "2.5.6"
PR = "6.el10"
PACKAGES = "libassuan libassuan-devel"


URI_libassuan = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libassuan-2.5.6-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libassuan = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgpg-error.so.0()(64bit) ( ) libgpg-error.so.0(GPG_ERROR_1.0)(64bit) ( )"
RPROVIDES:libassuan = "libassuan.so.0()(64bit) ( ) libassuan.so.0(LIBASSUAN_1.0)(64bit) ( ) libassuan ( =  2.5.6-6.el10) libassuan(x86-64) ( =  2.5.6-6.el10)"

URI_libassuan-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libassuan-devel-2.5.6-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libassuan-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) /usr/bin/sh ( ) pkgconfig(gpg-error) ( ) libassuan.so.0()(64bit) ( ) libassuan(x86-64) ( =  2.5.6-6.el10)"
RPROVIDES:libassuan-devel = "libassuan-devel ( =  2.5.6-6.el10) libassuan-devel(x86-64) ( =  2.5.6-6.el10) libassuan2-devel ( =  2.5.6-6.el10) libassuan2-devel(x86-64) ( =  2.5.6-6.el10) pkgconfig(libassuan) ( =  2.5.6)"
