
PN = "opencsd"
PE = "0"
PV = "1.4.1"
PR = "4.el10"
PACKAGES = "opencsd opencsd-devel"


URI_opencsd = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/opencsd-1.4.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:opencsd = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( )"
RPROVIDES:opencsd = "libopencsd.so.1()(64bit) ( ) libopencsd_c_api.so.1()(64bit) ( ) opencsd(x86-64) ( =  1.4.1-4.el10) opencsd ( =  1.4.1-4.el10)"

URI_opencsd-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/opencsd-devel-1.4.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:opencsd-devel = "libopencsd.so.1()(64bit) ( ) libopencsd_c_api.so.1()(64bit) ( ) opencsd(x86-64) ( =  1.4.1-4.el10)"
RPROVIDES:opencsd-devel = "opencsd-devel ( =  1.4.1-4.el10) opencsd-devel(x86-64) ( =  1.4.1-4.el10)"
