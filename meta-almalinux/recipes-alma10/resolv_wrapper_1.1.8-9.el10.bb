
PN = "resolv_wrapper"
PE = "0"
PV = "1.1.8"
PR = "9.el10"
PACKAGES = "resolv_wrapper"


URI_resolv_wrapper = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/resolv_wrapper-1.1.8-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:resolv_wrapper = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( )"
RPROVIDES:resolv_wrapper = "cmake(resolv_wrapper) ( ) libresolv_wrapper.so.0()(64bit) ( ) pkgconfig(resolv_wrapper) ( =  1.1.8) resolv_wrapper ( =  1.1.8-9.el10) resolv_wrapper(x86-64) ( =  1.1.8-9.el10)"
