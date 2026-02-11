
PN = "jsoncpp"
PE = "0"
PV = "1.9.5"
PR = "9.el10"
PACKAGES = "jsoncpp jsoncpp-devel jsoncpp-doc"


URI_jsoncpp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jsoncpp-1.9.5-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jsoncpp = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( )"
RPROVIDES:jsoncpp = "libjsoncpp.so.25()(64bit) ( ) jsoncpp ( =  1.9.5-9.el10) jsoncpp(x86-64) ( =  1.9.5-9.el10)"

URI_jsoncpp-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jsoncpp-devel-1.9.5-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:jsoncpp-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) libjsoncpp.so.25()(64bit) ( ) jsoncpp(x86-64) ( =  1.9.5-9.el10)"
RPROVIDES:jsoncpp-devel = "cmake(jsoncpp) ( =  1.9.5) jsoncpp-devel ( =  1.9.5-9.el10) jsoncpp-devel(x86-64) ( =  1.9.5-9.el10) pkgconfig(jsoncpp) ( =  1.9.5)"

URI_jsoncpp-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jsoncpp-doc-1.9.5-9.el10.noarch.rpm;unpack=0"
RDEPENDS:jsoncpp-doc = ""
RPROVIDES:jsoncpp-doc = "jsoncpp-doc ( =  1.9.5-9.el10)"
