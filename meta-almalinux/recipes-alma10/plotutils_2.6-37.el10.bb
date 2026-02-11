
PN = "plotutils"
PE = "0"
PV = "2.6"
PR = "37.el10"
PACKAGES = "plotutils plotutils-devel"


URI_plotutils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plotutils-2.6-37.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:plotutils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libz.so.1()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libX11.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libm.so.6(GLIBC_2.35)(64bit) ( ) libXext.so.6()(64bit) ( ) libpng16.so.16()(64bit) ( ) libpng16.so.16(PNG16_0)(64bit) ( ) libICE.so.6()(64bit) ( ) libXt.so.6()(64bit) ( ) libSM.so.6()(64bit) ( ) libm.so.6(GLIBC_2.23)(64bit) ( ) libXmu.so.6()(64bit) ( ) libXaw.so.7()(64bit) ( )"
RPROVIDES:plotutils = "libplot.so.2()(64bit) ( ) libplotter.so.2()(64bit) ( ) libxmi.so.0()(64bit) ( ) plotutils ( =  2.6-37.el10) plotutils(x86-64) ( =  2.6-37.el10)"

URI_plotutils-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plotutils-devel-2.6-37.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:plotutils-devel = "libplot.so.2()(64bit) ( ) libplotter.so.2()(64bit) ( ) libxmi.so.0()(64bit) ( ) plotutils ( =  2.6-37.el10)"
RPROVIDES:plotutils-devel = "plotutils-devel ( =  2.6-37.el10) plotutils-devel(x86-64) ( =  2.6-37.el10)"
