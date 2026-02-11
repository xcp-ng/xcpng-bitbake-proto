
PN = "tbb"
PE = "0"
PV = "2021.11.0"
PR = "7.el10"
PACKAGES = "python3-tbb tbb tbb-bind tbb-devel tbb-doc"


URI_python3-tbb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-tbb-2021.11.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-tbb = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libtbb.so.12()(64bit) ( ) python(abi) ( =  3.12) tbb(x86-64) ( =  2021.11.0-7.el10)"
RPROVIDES:python3-tbb = "python-tbb ( =  2021.11.0-7.el10) python3-tbb ( =  2021.11.0-7.el10) python3-tbb(x86-64) ( =  2021.11.0-7.el10) python3.12-tbb ( =  2021.11.0-7.el10) python3.12dist(tbb) ( =  0.2) python3dist(tbb) ( =  0.2)"

URI_tbb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tbb-2021.11.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tbb = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.13)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.3)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.11)(64bit) ( )"
RPROVIDES:tbb = "libtbb.so.12()(64bit) ( ) libtbbmalloc_proxy.so.2()(64bit) ( ) libirml.so.1()(64bit) ( ) libtbbmalloc.so.2()(64bit) ( ) tbb(x86-64) ( =  2021.11.0-7.el10) tbb ( =  2021.11.0-7.el10)"

URI_tbb-bind = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tbb-bind-2021.11.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tbb-bind = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libhwloc.so.15()(64bit) ( ) tbb(x86-64) ( =  2021.11.0-7.el10)"
RPROVIDES:tbb-bind = "libtbbbind_2_5.so.3()(64bit) ( ) tbb-bind(x86-64) ( =  2021.11.0-7.el10) tbb-bind ( =  2021.11.0-7.el10)"

URI_tbb-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tbb-devel-2021.11.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tbb-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) libtbb.so.12()(64bit) ( ) libtbbmalloc_proxy.so.2()(64bit) ( ) libirml.so.1()(64bit) ( ) libtbbbind_2_5.so.3()(64bit) ( ) libtbbmalloc.so.2()(64bit) ( ) tbb(x86-64) ( =  2021.11.0-7.el10) tbb-bind(x86-64) ( =  2021.11.0-7.el10)"
RPROVIDES:tbb-devel = "cmake(TBB) ( =  2021.11.0) cmake(tbb) ( =  2021.11.0) pkgconfig(tbb) ( =  2021.11.0) pkgconfig(tbbmalloc) ( =  2021.11.0) pkgconfig(tbbmalloc_proxy) ( =  2021.11.0) tbb-devel ( =  2021.11.0-7.el10) tbb-devel(x86-64) ( =  2021.11.0-7.el10)"

URI_tbb-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tbb-doc-2021.11.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tbb-doc = ""
RPROVIDES:tbb-doc = "tbb-doc ( =  2021.11.0-7.el10) tbb-doc(x86-64) ( =  2021.11.0-7.el10)"
