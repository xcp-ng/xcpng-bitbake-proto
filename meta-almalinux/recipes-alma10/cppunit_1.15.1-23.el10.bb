
PN = "cppunit"
PE = "0"
PV = "1.15.1"
PR = "23.el10"
PACKAGES = "cppunit cppunit-devel cppunit-doc"


URI_cppunit = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/cppunit-1.15.1-23.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cppunit = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libm.so.6()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( )"
RPROVIDES:cppunit = "libcppunit-1.15.so.1()(64bit) ( ) cppunit(x86-64) ( =  1.15.1-23.el10) cppunit ( =  1.15.1-23.el10)"

URI_cppunit-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/cppunit-devel-1.15.1-23.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cppunit-devel = "/usr/bin/pkg-config ( ) libcppunit-1.15.so.1()(64bit) ( ) cppunit(x86-64) ( =  1.15.1-23.el10)"
RPROVIDES:cppunit-devel = "cppunit-devel ( =  1.15.1-23.el10) cppunit-devel(x86-64) ( =  1.15.1-23.el10) pkgconfig(cppunit) ( =  1.15.1)"

URI_cppunit-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/cppunit-doc-1.15.1-23.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cppunit-doc = ""
RPROVIDES:cppunit-doc = "cppunit-doc ( =  1.15.1-23.el10) cppunit-doc(x86-64) ( =  1.15.1-23.el10)"
