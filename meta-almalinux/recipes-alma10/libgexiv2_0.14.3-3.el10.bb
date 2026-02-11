
PN = "libgexiv2"
PE = "0"
PV = "0.14.3"
PR = "3.el10"
PACKAGES = "libgexiv2 libgexiv2-devel"


URI_libgexiv2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgexiv2-0.14.3-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgexiv2 = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libexiv2.so.28()(64bit) ( )"
RPROVIDES:libgexiv2 = "libgexiv2.so.2()(64bit) ( ) libgexiv2 ( =  0.14.3-3.el10) libgexiv2(x86-64) ( =  0.14.3-3.el10)"

URI_libgexiv2-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libgexiv2-devel-0.14.3-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgexiv2-devel = "/usr/bin/pkg-config ( ) pkgconfig(glib-2.0) ( ) libgexiv2.so.2()(64bit) ( ) libgexiv2(x86-64) ( =  0.14.3-3.el10) pkgconfig(exiv2) ( >=  0.26) pkgconfig(gio-2.0) ( >=  2.46.0) pkgconfig(gobject-2.0) ( >=  2.46.0)"
RPROVIDES:libgexiv2-devel = "libgexiv2-devel ( =  0.14.3-3.el10) libgexiv2-devel(x86-64) ( =  0.14.3-3.el10) pkgconfig(gexiv2) ( =  0.14.3)"
