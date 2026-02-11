
PN = "cairomm1.16"
PE = "0"
PV = "1.18.0"
PR = "6.el10"
PACKAGES = "cairomm1.16 cairomm1.16-devel cairomm1.16-doc"


URI_cairomm1.16 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cairomm1.16-1.18.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cairomm1.16 = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libcairo.so.2()(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libc.so.6(GLIBC_2.32)(64bit) ( ) libsigc-3.0.so.0()(64bit) ( )"
RPROVIDES:cairomm1.16 = "libcairomm-1.16.so.1()(64bit) ( ) cairomm1.16 ( =  1.18.0-6.el10) cairomm1.16(x86-64) ( =  1.18.0-6.el10)"

URI_cairomm1.16-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/cairomm1.16-devel-1.18.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cairomm1.16-devel = "/usr/bin/pkg-config ( ) pkgconfig(cairomm-1.16) ( ) pkgconfig(cairo-xlib) ( ) libcairomm-1.16.so.1()(64bit) ( ) pkgconfig(cairo-ft) ( ) pkgconfig(cairo-pdf) ( ) pkgconfig(cairo-png) ( ) pkgconfig(cairo-ps) ( ) pkgconfig(cairo-svg) ( ) pkgconfig(cairo-xlib-xrender) ( ) cairomm1.16(x86-64) ( =  1.18.0-6.el10) pkgconfig(cairo) ( >=  1.14.0) pkgconfig(sigc++-3.0) ( >=  3.0.0)"
RPROVIDES:cairomm1.16-devel = "cairomm1.16-devel ( =  1.18.0-6.el10) cairomm1.16-devel(x86-64) ( =  1.18.0-6.el10) pkgconfig(cairomm-1.16) ( =  1.18.0) pkgconfig(cairomm-ft-1.16) ( =  1.18.0) pkgconfig(cairomm-pdf-1.16) ( =  1.18.0) pkgconfig(cairomm-png-1.16) ( =  1.18.0) pkgconfig(cairomm-ps-1.16) ( =  1.18.0) pkgconfig(cairomm-svg-1.16) ( =  1.18.0) pkgconfig(cairomm-xlib-1.16) ( =  1.18.0) pkgconfig(cairomm-xlib-xrender-1.16) ( =  1.18.0)"

URI_cairomm1.16-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/cairomm1.16-doc-1.18.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:cairomm1.16-doc = ""
RPROVIDES:cairomm1.16-doc = "cairomm1.16-doc ( =  1.18.0-6.el10)"
