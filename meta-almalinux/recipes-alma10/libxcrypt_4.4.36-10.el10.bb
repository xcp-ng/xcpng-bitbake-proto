
PN = "libxcrypt"
PE = "0"
PV = "4.4.36"
PR = "10.el10"
PACKAGES = "libxcrypt libxcrypt-compat libxcrypt-devel libxcrypt-static"


URI_libxcrypt = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libxcrypt-4.4.36-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxcrypt = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:libxcrypt = "libcrypt.so.2()(64bit) ( ) libcrypt.so.2(XCRYPT_2.0)(64bit) ( ) libcrypt.so.2(XCRYPT_4.3)(64bit) ( ) libcrypt.so.2(XCRYPT_4.4)(64bit) ( ) libxcrypt ( =  4.4.36-10.el10) libxcrypt(x86-64) ( =  4.4.36-10.el10)"

URI_libxcrypt-compat = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libxcrypt-compat-4.4.36-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxcrypt-compat = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libxcrypt(x86-64) ( =  4.4.36-10.el10)"
RPROVIDES:libxcrypt-compat = "libcrypt.so.1()(64bit) ( ) libcrypt.so.1(GLIBC_2.2.5)(64bit) ( ) libcrypt.so.1(XCRYPT_2.0)(64bit) ( ) libcrypt.so.1(XCRYPT_4.3)(64bit) ( ) libcrypt.so.1(XCRYPT_4.4)(64bit) ( ) libxcrypt-compat ( =  4.4.36-10.el10) libxcrypt-compat(x86-64) ( =  4.4.36-10.el10)"

URI_libxcrypt-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libxcrypt-devel-4.4.36-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxcrypt-devel = "/usr/bin/pkg-config ( ) libcrypt.so.2()(64bit) ( ) glibc-devel(x86-64) ( ) libxcrypt(x86-64) ( =  4.4.36-10.el10)"
RPROVIDES:libxcrypt-devel = "libxcrypt-devel ( =  4.4.36-10.el10) libxcrypt-devel(x86-64) ( =  4.4.36-10.el10) pkgconfig(libcrypt) ( =  4.4.36) pkgconfig(libxcrypt) ( =  4.4.36)"

URI_libxcrypt-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libxcrypt-static-4.4.36-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libxcrypt-static = "glibc-static(x86-64) ( ) libxcrypt-devel(x86-64) ( =  4.4.36-10.el10)"
RPROVIDES:libxcrypt-static = "libxcrypt-static ( =  4.4.36-10.el10) libxcrypt-static(x86-64) ( =  4.4.36-10.el10)"
