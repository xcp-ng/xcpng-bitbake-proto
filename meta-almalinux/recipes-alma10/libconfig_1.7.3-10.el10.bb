
PN = "libconfig"
PE = "0"
PV = "1.7.3"
PR = "10.el10"
PACKAGES = "libconfig libconfig-devel"


URI_libconfig = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libconfig-1.7.3-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libconfig = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( )"
RPROVIDES:libconfig = "libconfig.so.11()(64bit) ( ) libconfig++.so.11()(64bit) ( ) libconfig ( =  1.7.3-10.el10) libconfig(x86-64) ( =  1.7.3-10.el10)"

URI_libconfig-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libconfig-devel-1.7.3-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libconfig-devel = "/usr/bin/pkg-config ( ) libconfig++.so.11()(64bit) ( ) libconfig.so.11()(64bit) ( ) libconfig(x86-64) ( =  1.7.3-10.el10)"
RPROVIDES:libconfig-devel = "libconfig-devel ( =  1.7.3-10.el10) libconfig-devel(x86-64) ( =  1.7.3-10.el10) pkgconfig(libconfig) ( =  1.7.3) pkgconfig(libconfig++) ( =  1.7.3)"
