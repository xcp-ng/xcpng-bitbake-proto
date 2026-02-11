
PN = "cairomm"
PE = "0"
PV = "1.14.5"
PR = "5.el10"
PACKAGES = "cairomm cairomm-devel cairomm-doc"


URI_cairomm = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/cairomm-1.14.5-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cairomm = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libcairo.so.2()(64bit) ( ) libsigc-2.0.so.0()(64bit) ( )"
RPROVIDES:cairomm = "libcairomm-1.0.so.1()(64bit) ( ) cairomm(x86-64) ( =  1.14.5-5.el10) cairomm ( =  1.14.5-5.el10) cairomm1.0(x86-64) ( =  1.14.5-5.el10)"

URI_cairomm-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/cairomm-devel-1.14.5-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cairomm-devel = "/usr/bin/pkg-config ( ) libcairomm-1.0.so.1()(64bit) ( ) pkgconfig(cairomm-1.0) ( ) pkgconfig(cairo-ft) ( ) pkgconfig(cairo-pdf) ( ) pkgconfig(cairo-png) ( ) pkgconfig(cairo-ps) ( ) pkgconfig(cairo-svg) ( ) pkgconfig(cairo-xlib) ( ) pkgconfig(cairo-xlib-xrender) ( ) cairomm(x86-64) ( =  1.14.5-5.el10) pkgconfig(cairo) ( >=  1.12.0) pkgconfig(sigc++-2.0) ( >=  2.6.0)"
RPROVIDES:cairomm-devel = "cairomm-devel ( =  1.14.5-5.el10) cairomm-devel(x86-64) ( =  1.14.5-5.el10) cairomm1.0-devel(x86-64) ( =  1.14.5-5.el10) pkgconfig(cairomm-1.0) ( =  1.14.5) pkgconfig(cairomm-ft-1.0) ( =  1.14.5) pkgconfig(cairomm-pdf-1.0) ( =  1.14.5) pkgconfig(cairomm-png-1.0) ( =  1.14.5) pkgconfig(cairomm-ps-1.0) ( =  1.14.5) pkgconfig(cairomm-svg-1.0) ( =  1.14.5) pkgconfig(cairomm-xlib-1.0) ( =  1.14.5) pkgconfig(cairomm-xlib-xrender-1.0) ( =  1.14.5)"

URI_cairomm-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/cairomm-doc-1.14.5-5.el10.noarch.rpm;unpack=0"
RDEPENDS:cairomm-doc = ""
RPROVIDES:cairomm-doc = "cairomm-doc ( =  1.14.5-5.el10) cairomm1.0-doc ( =  1.14.5-5.el10)"
