
PN = "libtiff"
PE = "0"
PV = "4.6.0"
PR = "6.el10_0.1"
PACKAGES = "libtiff libtiff-devel libtiff-tools libtiff-static"


URI_libtiff = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libtiff-4.6.0-6.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtiff = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libz.so.1()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libzstd.so.1()(64bit) ( ) libjpeg.so.62()(64bit) ( ) libjpeg.so.62(LIBJPEG_6.2)(64bit) ( ) libc.so.6(GLIBC_2.33)(64bit) ( ) libwebp.so.7()(64bit) ( ) libjbig.so.2.1()(64bit) ( ) libLerc.so.4()(64bit) ( )"
RPROVIDES:libtiff = "libtiff.so.6()(64bit) ( ) libtiff.so.6(LIBTIFF_4.0)(64bit) ( ) libtiffxx.so.6()(64bit) ( ) libtiff.so.6(LIBTIFF_4.1)(64bit) ( ) libtiffxx.so.6(LIBTIFFXX_4.0)(64bit) ( ) libtiff.so.6(LIBTIFF_4.5)(64bit) ( ) libtiff.so.6(LIBTIFF_4.2)(64bit) ( ) libtiff.so.6(LIBTIFF_4.3)(64bit) ( ) libtiff.so.6(LIBTIFF_4.4)(64bit) ( ) libtiff(x86-64) ( =  4.6.0-6.el10_0.1) libtiff ( =  4.6.0-6.el10_0.1)"

URI_libtiff-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libtiff-devel-4.6.0-6.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtiff-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) pkgconfig(zlib) ( ) libtiff.so.6()(64bit) ( ) pkgconfig(libjpeg) ( ) pkgconfig(libzstd) ( ) libtiffxx.so.6()(64bit) ( ) pkgconfig(libwebp) ( ) libtiff(x86-64) ( =  4.6.0-6.el10_0.1)"
RPROVIDES:libtiff-devel = "pkgconfig(libtiff-4) ( =  4.6.0) libtiff-devel ( =  4.6.0-6.el10_0.1) libtiff-devel(x86-64) ( =  4.6.0-6.el10_0.1)"

URI_libtiff-tools = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libtiff-tools-4.6.0-6.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtiff-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libtiff.so.6()(64bit) ( ) libtiff.so.6(LIBTIFF_4.0)(64bit) ( ) libtiff.so.6(LIBTIFF_4.1)(64bit) ( ) libtiff.so.6(LIBTIFF_4.2)(64bit) ( ) libtiff.so.6(LIBTIFF_4.5)(64bit) ( ) libtiff(x86-64) ( =  4.6.0-6.el10_0.1)"
RPROVIDES:libtiff-tools = "libtiff-tools ( =  4.6.0-6.el10_0.1) libtiff-tools(x86-64) ( =  4.6.0-6.el10_0.1)"

URI_libtiff-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libtiff-static-4.6.0-6.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtiff-static = "libtiff-devel(x86-64) ( =  4.6.0-6.el10_0.1)"
RPROVIDES:libtiff-static = "libtiff-static ( =  4.6.0-6.el10_0.1) libtiff-static(x86-64) ( =  4.6.0-6.el10_0.1)"
