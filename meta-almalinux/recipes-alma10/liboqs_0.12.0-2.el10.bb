
PN = "liboqs"
PE = "0"
PV = "0.12.0"
PR = "2.el10"
PACKAGES = "liboqs liboqs-devel"


URI_liboqs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/liboqs-0.12.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liboqs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:liboqs = "liboqs.so.7()(64bit) ( ) liboqs(x86-64) ( =  0.12.0-2.el10) liboqs ( =  0.12.0-2.el10)"

URI_liboqs-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/liboqs-devel-0.12.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liboqs-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) pkgconfig(openssl) ( ) liboqs.so.7()(64bit) ( ) liboqs(x86-64) ( =  0.12.0-2.el10)"
RPROVIDES:liboqs-devel = "cmake(liboqs) ( =  0.12.0) liboqs-devel ( =  0.12.0-2.el10) liboqs-devel(x86-64) ( =  0.12.0-2.el10) pkgconfig(liboqs) ( =  0.12.0)"
