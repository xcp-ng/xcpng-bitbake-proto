
PN = "paps"
PE = "0"
PV = "0.8.0"
PR = "10.el10"
PACKAGES = "paps texttopaps"


URI_paps = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/paps-0.8.0-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:paps = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) /usr/bin/python3 ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libcairo.so.2()(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libpangocairo-1.0.so.0()(64bit) ( ) libpangoft2-1.0.so.0()(64bit) ( )"
RPROVIDES:paps = "paps ( =  0.8.0-10.el10) paps(x86-64) ( =  0.8.0-10.el10)"

URI_texttopaps = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/texttopaps-0.8.0-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:texttopaps = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) fontpackages-filesystem ( ) libpango-1.0.so.0()(64bit) ( ) libharfbuzz.so.0()(64bit) ( ) libfontconfig.so.1()(64bit) ( ) libfreetype.so.6()(64bit) ( ) libpangoft2-1.0.so.0()(64bit) ( ) cups-filesystem ( ) libcups.so.2()(64bit) ( )"
RPROVIDES:texttopaps = "libpaps.so.0()(64bit) ( ) texttopaps ( =  0.8.0-10.el10) texttopaps(x86-64) ( =  0.8.0-10.el10)"
