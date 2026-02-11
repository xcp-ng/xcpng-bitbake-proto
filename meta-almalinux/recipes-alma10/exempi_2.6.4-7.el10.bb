
PN = "exempi"
PE = "0"
PV = "2.6.4"
PR = "7.el10"
PACKAGES = "exempi exempi-devel"


URI_exempi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/exempi-2.6.4-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:exempi = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libz.so.1()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libexpat.so.1()(64bit) ( ) libz.so.1(ZLIB_1.2.2)(64bit) ( )"
RPROVIDES:exempi = "libexempi.so.8()(64bit) ( ) bundled(md5-polstra) ( ) exempi ( =  2.6.4-7.el10) exempi(x86-64) ( =  2.6.4-7.el10)"

URI_exempi-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/exempi-devel-2.6.4-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:exempi-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libexempi.so.8()(64bit) ( ) exempi ( =  2.6.4-7.el10)"
RPROVIDES:exempi-devel = "exempi-devel ( =  2.6.4-7.el10) exempi-devel(x86-64) ( =  2.6.4-7.el10) pkgconfig(exempi-2.0) ( =  2.6.4)"
