
PN = "libcbor"
PE = "0"
PV = "0.11.0"
PR = "3.el10"
PACKAGES = "libcbor libcbor-devel"


URI_libcbor = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libcbor-0.11.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcbor = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:libcbor = "libcbor.so.0.11()(64bit) ( ) libcbor ( =  0.11.0-3.el10) libcbor(x86-64) ( =  0.11.0-3.el10)"

URI_libcbor-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libcbor-devel-0.11.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcbor-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) libcbor.so.0.11()(64bit) ( ) libcbor(x86-64) ( =  0.11.0-3.el10)"
RPROVIDES:libcbor-devel = "cmake(libcbor) ( =  0.11.0) libcbor-devel ( =  0.11.0-3.el10) libcbor-devel(x86-64) ( =  0.11.0-3.el10) pkgconfig(libcbor) ( =  0.11.0)"
