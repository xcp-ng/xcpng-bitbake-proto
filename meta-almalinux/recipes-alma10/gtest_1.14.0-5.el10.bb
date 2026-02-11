
PN = "gtest"
PE = "0"
PV = "1.14.0"
PR = "5.el10"
PACKAGES = "gmock gmock-devel gtest gtest-devel"


URI_gmock = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gmock-1.14.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gmock = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libgtest.so.1.14.0()(64bit) ( ) gtest ( =  1.14.0-5.el10)"
RPROVIDES:gmock = "libgmock.so.1.14.0()(64bit) ( ) libgmock_main.so.1.14.0()(64bit) ( ) gmock ( =  1.14.0-5.el10) gmock(x86-64) ( =  1.14.0-5.el10)"

URI_gmock-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gmock-devel-1.14.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gmock-devel = "/usr/bin/pkg-config ( ) libgmock.so.1.14.0()(64bit) ( ) libgmock_main.so.1.14.0()(64bit) ( ) gmock ( =  1.14.0-5.el10) pkgconfig(gtest) ( =  1.14.0)"
RPROVIDES:gmock-devel = "gmock-devel ( =  1.14.0-5.el10) gmock-devel(x86-64) ( =  1.14.0-5.el10) pkgconfig(gmock) ( =  1.14.0) pkgconfig(gmock_main) ( =  1.14.0)"

URI_gtest = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gtest-1.14.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtest = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.5)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( )"
RPROVIDES:gtest = "libgtest.so.1.14.0()(64bit) ( ) libgtest_main.so.1.14.0()(64bit) ( ) gtest ( =  1.14.0-5.el10) gtest(x86-64) ( =  1.14.0-5.el10)"

URI_gtest-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gtest-devel-1.14.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtest-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) libgtest.so.1.14.0()(64bit) ( ) libgtest_main.so.1.14.0()(64bit) ( ) gmock ( =  1.14.0-5.el10) gtest ( =  1.14.0-5.el10)"
RPROVIDES:gtest-devel = "pkgconfig(gtest) ( =  1.14.0) cmake(GTest) ( =  1.14.0) cmake(gtest) ( =  1.14.0) gtest-devel ( =  1.14.0-5.el10) gtest-devel(x86-64) ( =  1.14.0-5.el10) pkgconfig(gtest_main) ( =  1.14.0)"
