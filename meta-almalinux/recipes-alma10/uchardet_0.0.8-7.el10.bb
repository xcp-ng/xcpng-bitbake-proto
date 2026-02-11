
PN = "uchardet"
PE = "0"
PV = "0.0.8"
PR = "7.el10"
PACKAGES = "uchardet uchardet-devel"


URI_uchardet = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/uchardet-0.0.8-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:uchardet = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( )"
RPROVIDES:uchardet = "libuchardet.so.0()(64bit) ( ) uchardet(x86-64) ( =  0.0.8-7.el10) uchardet ( =  0.0.8-7.el10)"

URI_uchardet-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/uchardet-devel-0.0.8-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:uchardet-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) libuchardet.so.0()(64bit) ( ) uchardet(x86-64) ( =  0.0.8-7.el10)"
RPROVIDES:uchardet-devel = "cmake(uchardet) ( =  0.0.8) pkgconfig(uchardet) ( =  0.0.8) uchardet-devel ( =  0.0.8-7.el10) uchardet-devel(x86-64) ( =  0.0.8-7.el10)"
