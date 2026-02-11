
PN = "libgcrypt"
PE = "0"
PV = "1.11.0"
PR = "5.el10"
PACKAGES = "libgcrypt libgcrypt-devel"


URI_libgcrypt = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libgcrypt-1.11.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgcrypt = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgpg-error.so.0()(64bit) ( ) libgpg-error.so.0(GPG_ERROR_1.0)(64bit) ( )"
RPROVIDES:libgcrypt = "libgcrypt.so.20()(64bit) ( ) libgcrypt.so.20(GCRYPT_1.6)(64bit) ( ) libgcrypt ( =  1.11.0-5.el10) libgcrypt(x86-64) ( =  1.11.0-5.el10)"

URI_libgcrypt-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgcrypt-devel-1.11.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgcrypt-devel = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) /usr/bin/pkg-config ( ) pkgconfig ( ) libgcrypt.so.20()(64bit) ( ) libgcrypt.so.20(GCRYPT_1.6)(64bit) ( ) libgpg-error.so.0()(64bit) ( ) libgpg-error.so.0(GPG_ERROR_1.0)(64bit) ( ) libgpg-error-devel ( ) pkgconfig(gpg-error) ( ) libgcrypt(x86-64) ( =  1.11.0-5.el10)"
RPROVIDES:libgcrypt-devel = "libgcrypt-devel ( =  1.11.0-5.el10) libgcrypt-devel(x86-64) ( =  1.11.0-5.el10) pkgconfig(libgcrypt) ( =  1.11.0-unknown)"
