
PN = "c-ares"
PE = "0"
PV = "1.25.0"
PR = "6.el10"
PACKAGES = "c-ares c-ares-devel"


URI_c-ares = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/c-ares-1.25.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:c-ares = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:c-ares = "libcares.so.2()(64bit) ( ) c-ares ( =  1.25.0-6.el10) c-ares(x86-64) ( =  1.25.0-6.el10)"

URI_c-ares-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/c-ares-devel-1.25.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:c-ares-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) libcares.so.2()(64bit) ( ) c-ares(x86-64) ( =  1.25.0-6.el10)"
RPROVIDES:c-ares-devel = "c-ares-devel ( =  1.25.0-6.el10) c-ares-devel(x86-64) ( =  1.25.0-6.el10) cmake(c-ares) ( =  1.25.0) pkgconfig(libcares) ( =  1.25.0)"
