
PN = "libecap"
PE = "0"
PV = "1.0.1"
PR = "19.el10"
PACKAGES = "libecap libecap-devel"


URI_libecap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libecap-1.0.1-19.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libecap = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libc.so.6(GLIBC_2.32)(64bit) ( )"
RPROVIDES:libecap = "libecap.so.3()(64bit) ( ) libecap(x86-64) ( =  1.0.1-19.el10) libecap ( =  1.0.1-19.el10)"

URI_libecap-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libecap-devel-1.0.1-19.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libecap-devel = "/usr/bin/pkg-config ( ) libecap.so.3()(64bit) ( ) libecap(x86-64) ( =  1.0.1-19.el10)"
RPROVIDES:libecap-devel = "libecap-devel ( =  1.0.1-19.el10) libecap-devel(x86-64) ( =  1.0.1-19.el10) pkgconfig(libecap) ( =  1.0.1)"
