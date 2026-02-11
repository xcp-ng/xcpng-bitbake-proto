
PN = "taglib"
PE = "0"
PV = "1.12"
PR = "12.el10"
PACKAGES = "taglib taglib-devel"


URI_taglib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/taglib-1.12-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:taglib = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libz.so.1()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( )"
RPROVIDES:taglib = "libtag.so.1()(64bit) ( ) libtag_c.so.0()(64bit) ( ) taglib ( =  1.12-12.el10) taglib(x86-64) ( =  1.12-12.el10)"

URI_taglib-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/taglib-devel-1.12-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:taglib-devel = "/usr/bin/pkg-config ( ) /usr/bin/sh ( ) pkgconfig(taglib) ( ) libtag.so.1()(64bit) ( ) libtag_c.so.0()(64bit) ( ) taglib(x86-64) ( =  1.12-12.el10)"
RPROVIDES:taglib-devel = "pkgconfig(taglib) ( =  1.12) pkgconfig(taglib_c) ( =  1.12) taglib-devel ( =  1.12-12.el10) taglib-devel(x86-64) ( =  1.12-12.el10)"
