
PN = "flac"
PE = "0"
PV = "1.4.3"
PR = "6.el10"
PACKAGES = "flac-libs flac flac-devel"


URI_flac-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/flac-libs-1.4.3-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flac-libs = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libc.so.6(GLIBC_2.33)(64bit) ( ) libogg.so.0()(64bit) ( )"
RPROVIDES:flac-libs = "libFLAC.so.12()(64bit) ( ) libFLAC++.so.10()(64bit) ( ) flac-libs ( =  1.4.3-6.el10) flac-libs(x86-64) ( =  1.4.3-6.el10)"

URI_flac = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/flac-1.4.3-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flac = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libFLAC.so.12()(64bit) ( ) flac-libs(x86-64) ( =  1.4.3-6.el10)"
RPROVIDES:flac = "flac ( =  1.4.3-6.el10) flac(x86-64) ( =  1.4.3-6.el10)"

URI_flac-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/flac-devel-1.4.3-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flac-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) pkgconfig(ogg) ( ) pkgconfig(flac) ( ) libFLAC.so.12()(64bit) ( ) libFLAC++.so.10()(64bit) ( ) flac-libs(x86-64) ( =  1.4.3-6.el10)"
RPROVIDES:flac-devel = "flac-devel ( =  1.4.3-6.el10) flac-devel(x86-64) ( =  1.4.3-6.el10) pkgconfig(flac) ( =  1.4.3) pkgconfig(flac++) ( =  1.4.3)"
