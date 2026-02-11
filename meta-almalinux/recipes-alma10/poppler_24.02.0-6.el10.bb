
PN = "poppler"
PE = "0"
PV = "24.02.0"
PR = "6.el10"
PACKAGES = "poppler poppler-cpp poppler-glib poppler-qt6 poppler-utils poppler-cpp-devel poppler-devel poppler-glib-devel poppler-glib-doc poppler-qt6-devel"


URI_poppler = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/poppler-24.02.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:poppler = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libz.so.1()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.5)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libnspr4.so()(64bit) ( ) libm.so.6(GLIBC_2.35)(64bit) ( ) libnss3.so()(64bit) ( ) libplc4.so()(64bit) ( ) libcurl.so.4()(64bit) ( ) libnss3.so(NSS_3.4)(64bit) ( ) libjpeg.so.62()(64bit) ( ) libnss3.so(NSS_3.2)(64bit) ( ) libjpeg.so.62(LIBJPEG_6.2)(64bit) ( ) libsmime3.so()(64bit) ( ) libfontconfig.so.1()(64bit) ( ) libfreetype.so.6()(64bit) ( ) libpng16.so.16()(64bit) ( ) libpng16.so.16(PNG16_0)(64bit) ( ) libnss3.so(NSS_3.9.2)(64bit) ( ) libnss3.so(NSS_3.12)(64bit) ( ) libnss3.so(NSS_3.3)(64bit) ( ) libsmime3.so(NSS_3.4)(64bit) ( ) libsmime3.so(NSS_3.2)(64bit) ( ) libnss3.so(NSS_3.8)(64bit) ( ) libtiff.so.6()(64bit) ( ) libnss3.so(NSS_3.9.3)(64bit) ( ) libtiff.so.6(LIBTIFF_4.0)(64bit) ( ) libsmime3.so(NSS_3.16)(64bit) ( ) liblcms2.so.2()(64bit) ( ) libjpeg.so.62(LIBJPEGTURBO_6.2)(64bit) ( ) libopenjp2.so.7()(64bit) ( ) poppler-data ( ) libgpgmepp.so.6()(64bit) ( )"
RPROVIDES:poppler = "libpoppler.so.134()(64bit) ( ) libpoppler.so.134(POPPLER_134)(64bit) ( ) poppler(x86-64) ( =  24.02.0-6.el10) poppler ( =  24.02.0-6.el10)"

URI_poppler-cpp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/poppler-cpp-24.02.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:poppler-cpp = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libpoppler.so.134()(64bit) ( ) libpoppler.so.134(POPPLER_134)(64bit) ( ) poppler(x86-64) ( =  24.02.0-6.el10)"
RPROVIDES:poppler-cpp = "libpoppler-cpp.so.0()(64bit) ( ) poppler-cpp ( =  24.02.0-6.el10) poppler-cpp(x86-64) ( =  24.02.0-6.el10)"

URI_poppler-glib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/poppler-glib-24.02.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:poppler-glib = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.5)(64bit) ( ) libcairo.so.2()(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libfreetype.so.6()(64bit) ( ) libpoppler.so.134()(64bit) ( ) libpoppler.so.134(POPPLER_134)(64bit) ( ) poppler(x86-64) ( =  24.02.0-6.el10)"
RPROVIDES:poppler-glib = "libpoppler-glib.so.8()(64bit) ( ) poppler-glib ( =  24.02.0-6.el10) poppler-glib(x86-64) ( =  24.02.0-6.el10)"

URI_poppler-qt6 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/poppler-qt6-24.02.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:poppler-qt6 = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libQt6Core.so.6()(64bit) ( ) libQt6Core.so.6(Qt_6)(64bit) ( ) libQt6Core.so.6(Qt_6.8)(64bit) ( ) libfreetype.so.6()(64bit) ( ) libQt6Gui.so.6()(64bit) ( ) libQt6Gui.so.6(Qt_6)(64bit) ( ) libc.so.6(GLIBC_2.32)(64bit) ( ) liblcms2.so.2()(64bit) ( ) libpoppler.so.134()(64bit) ( ) libpoppler.so.134(POPPLER_134)(64bit) ( ) poppler(x86-64) ( =  24.02.0-6.el10)"
RPROVIDES:poppler-qt6 = "libpoppler-qt6.so.3()(64bit) ( ) poppler-qt6 ( =  24.02.0-6.el10) poppler-qt6(x86-64) ( =  24.02.0-6.el10)"

URI_poppler-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/poppler-utils-24.02.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:poppler-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.5)(64bit) ( ) libcairo.so.2()(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libfreetype.so.6()(64bit) ( ) liblcms2.so.2()(64bit) ( ) libpoppler.so.134()(64bit) ( ) libpoppler.so.134(POPPLER_134)(64bit) ( ) poppler(x86-64) ( =  24.02.0-6.el10)"
RPROVIDES:poppler-utils = "poppler-utils ( =  24.02.0-6.el10) poppler-utils(x86-64) ( =  24.02.0-6.el10)"

URI_poppler-cpp-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/poppler-cpp-devel-24.02.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:poppler-cpp-devel = "/usr/bin/pkg-config ( ) libpoppler-cpp.so.0()(64bit) ( ) pkgconfig(poppler) ( =  24.02.0) poppler-devel(x86-64) ( =  24.02.0-6.el10) poppler-cpp(x86-64) ( =  24.02.0-6.el10)"
RPROVIDES:poppler-cpp-devel = "pkgconfig(poppler-cpp) ( =  24.02.0) poppler-cpp-devel ( =  24.02.0-6.el10) poppler-cpp-devel(x86-64) ( =  24.02.0-6.el10)"

URI_poppler-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/poppler-devel-24.02.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:poppler-devel = "/usr/bin/pkg-config ( ) libpoppler.so.134()(64bit) ( ) poppler(x86-64) ( =  24.02.0-6.el10)"
RPROVIDES:poppler-devel = "pkgconfig(poppler) ( =  24.02.0) poppler-devel(x86-64) ( =  24.02.0-6.el10) poppler-devel ( =  24.02.0-6.el10)"

URI_poppler-glib-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/poppler-glib-devel-24.02.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:poppler-glib-devel = "/usr/bin/pkg-config ( ) libpoppler-glib.so.8()(64bit) ( ) pkgconfig(poppler) ( =  24.02.0) poppler-devel(x86-64) ( =  24.02.0-6.el10) poppler-glib(x86-64) ( =  24.02.0-6.el10) pkgconfig(cairo) ( >=  1.16.0) pkgconfig(glib-2.0) ( >=  2.64) pkgconfig(gobject-2.0) ( >=  2.64)"
RPROVIDES:poppler-glib-devel = "pkgconfig(poppler-glib) ( =  24.02.0) poppler-glib-devel ( =  24.02.0-6.el10) poppler-glib-devel(x86-64) ( =  24.02.0-6.el10)"

URI_poppler-glib-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/poppler-glib-doc-24.02.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:poppler-glib-doc = ""
RPROVIDES:poppler-glib-doc = "poppler-glib-doc ( =  24.02.0-6.el10)"

URI_poppler-qt6-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/poppler-qt6-devel-24.02.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:poppler-qt6-devel = "/usr/bin/pkg-config ( ) libpoppler-qt6.so.3()(64bit) ( ) qt6-qtbase-devel ( ) pkgconfig(poppler) ( =  24.02.0) poppler-devel(x86-64) ( =  24.02.0-6.el10) poppler-qt6(x86-64) ( =  24.02.0-6.el10)"
RPROVIDES:poppler-qt6-devel = "pkgconfig(poppler-qt6) ( =  24.02.0) poppler-qt6-devel ( =  24.02.0-6.el10) poppler-qt6-devel(x86-64) ( =  24.02.0-6.el10)"
