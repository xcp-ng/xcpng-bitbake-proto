
PN = "libmad"
PE = "0"
PV = "0.16.4"
PR = "5.el10"
PACKAGES = "libmad libmad-devel"


URI_libmad = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libmad-0.16.4-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmad = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:libmad = "libmad.so.0()(64bit) ( ) libmad ( =  0.16.4-5.el10) libmad(x86-64) ( =  0.16.4-5.el10)"

URI_libmad-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libmad-devel-0.16.4-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libmad-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) libmad.so.0()(64bit) ( ) libmad(x86-64) ( =  0.16.4-5.el10)"
RPROVIDES:libmad-devel = "cmake(mad) ( =  0.16.4) libmad-devel ( =  0.16.4-5.el10) libmad-devel(x86-64) ( =  0.16.4-5.el10) pkgconfig(mad) ( =  0.16.4)"
