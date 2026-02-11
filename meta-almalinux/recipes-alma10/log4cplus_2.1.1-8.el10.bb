
PN = "log4cplus"
PE = "0"
PV = "2.1.1"
PR = "8.el10"
PACKAGES = "log4cplus log4cplus-devel log4cplus-static"


URI_log4cplus = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/log4cplus-2.1.1-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:log4cplus = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.11)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.13)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.3)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.2)(64bit) ( )"
RPROVIDES:log4cplus = "liblog4cplus-2.1.so.9()(64bit) ( ) liblog4cplusU-2.1.so.9()(64bit) ( ) log4cplus ( =  2.1.1-8.el10) log4cplus(x86-64) ( =  2.1.1-8.el10)"

URI_log4cplus-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/log4cplus-devel-2.1.1-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:log4cplus-devel = "/usr/bin/pkg-config ( ) liblog4cplus-2.1.so.9()(64bit) ( ) liblog4cplusU-2.1.so.9()(64bit) ( ) log4cplus ( =  2.1.1-8.el10)"
RPROVIDES:log4cplus-devel = "log4cplus-devel ( =  2.1.1-8.el10) log4cplus-devel(x86-64) ( =  2.1.1-8.el10) pkgconfig(log4cplus) ( =  2.1.1)"

URI_log4cplus-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/log4cplus-static-2.1.1-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:log4cplus-static = "log4cplus-devel ( =  2.1.1-8.el10)"
RPROVIDES:log4cplus-static = "log4cplus-static ( =  2.1.1-8.el10) log4cplus-static(x86-64) ( =  2.1.1-8.el10)"
