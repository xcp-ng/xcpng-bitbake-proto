
PN = "teckit"
PE = "0"
PV = "2.5.12"
PR = "4.el10"
PACKAGES = "teckit teckit-devel"


URI_teckit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/teckit-2.5.12-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:teckit = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libz.so.1()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libexpat.so.1()(64bit) ( ) libstdc++.so.6(CXXABI_1.3.1)(64bit) ( )"
RPROVIDES:teckit = "libTECkit.so.0()(64bit) ( ) bundels(graphite2) ( ) libTECkit_Compiler.so.0()(64bit) ( ) teckit ( =  2.5.12-4.el10) teckit(x86-64) ( =  2.5.12-4.el10)"

URI_teckit-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/teckit-devel-2.5.12-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:teckit-devel = "/usr/bin/pkg-config ( ) libTECkit.so.0()(64bit) ( ) libTECkit_Compiler.so.0()(64bit) ( ) teckit(x86-64) ( =  2.5.12-4.el10)"
RPROVIDES:teckit-devel = "pkgconfig(teckit) ( =  2.5.12) teckit-devel ( =  2.5.12-4.el10) teckit-devel(x86-64) ( =  2.5.12-4.el10)"
