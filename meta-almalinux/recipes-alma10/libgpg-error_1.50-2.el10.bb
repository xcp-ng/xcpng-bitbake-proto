
PN = "libgpg-error"
PE = "0"
PV = "1.50"
PR = "2.el10"
PACKAGES = "libgpg-error libgpg-error-devel"


URI_libgpg-error = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libgpg-error-1.50-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgpg-error = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:libgpg-error = "libgpg-error.so.0()(64bit) ( ) libgpg-error.so.0(GPG_ERROR_1.0)(64bit) ( ) libgpg-error ( =  1.50-2.el10) libgpg-error(x86-64) ( =  1.50-2.el10)"

URI_libgpg-error-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgpg-error-devel-1.50-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgpg-error-devel = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) /usr/bin/pkg-config ( ) pkgconfig ( ) libgpg-error.so.0()(64bit) ( ) libgpg-error(x86-64) ( =  1.50-2.el10)"
RPROVIDES:libgpg-error-devel = "libgpg-error-devel ( =  1.50-2.el10) libgpg-error-devel(x86-64) ( =  1.50-2.el10) pkgconfig(gpg-error) ( =  1.50-unknown)"
