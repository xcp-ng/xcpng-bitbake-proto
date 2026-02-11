
PN = "gtkmm4.0"
PE = "0"
PV = "4.13.2"
PR = "5.el10"
PACKAGES = "gtkmm4.0 gtkmm4.0-devel gtkmm4.0-doc"


URI_gtkmm4.0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gtkmm4.0-4.13.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtkmm4.0 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libgtk-4.so.1()(64bit) ( ) libcairo-gobject.so.2()(64bit) ( ) libgraphene-1.0.so.0()(64bit) ( ) libsigc-3.0.so.0()(64bit) ( ) libgiomm-2.68.so.1()(64bit) ( ) libglibmm-2.68.so.1()(64bit) ( ) libcairomm-1.16.so.1()(64bit) ( ) libpangomm-2.48.so.1()(64bit) ( ) glibmm2.68(x86-64) ( >=  2.68.0) cairomm1.16(x86-64) ( >=  1.15.4) gdk-pixbuf2(x86-64) ( >=  2.35.5) gtk4(x86-64) ( >=  4.13.3) pangomm2.48(x86-64) ( >=  2.50.0)"
RPROVIDES:gtkmm4.0 = "libgtkmm-4.0.so.0()(64bit) ( ) gtkmm4.0 ( =  4.13.2-5.el10) gtkmm4.0(x86-64) ( =  4.13.2-5.el10)"

URI_gtkmm4.0-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gtkmm4.0-devel-4.13.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtkmm4.0-devel = "/usr/bin/pkg-config ( ) libgtkmm-4.0.so.0()(64bit) ( ) pkgconfig(gtk4-unix-print) ( ) pkgconfig(giomm-2.68) ( >=  2.68.0) gtkmm4.0(x86-64) ( =  4.13.2-5.el10) pkgconfig(cairomm-1.16) ( >=  1.15.4) pkgconfig(gdk-pixbuf-2.0) ( >=  2.35.5) pkgconfig(gtk4) ( >=  4.13.3) pkgconfig(pangomm-2.48) ( >=  2.50.0)"
RPROVIDES:gtkmm4.0-devel = "gtkmm4.0-devel ( =  4.13.2-5.el10) gtkmm4.0-devel(x86-64) ( =  4.13.2-5.el10) pkgconfig(gtkmm-4.0) ( =  4.13.2)"

URI_gtkmm4.0-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gtkmm4.0-doc-4.13.2-5.el10.noarch.rpm;unpack=0"
RDEPENDS:gtkmm4.0-doc = "glibmm2.68-doc ( ) gtkmm4.0 ( =  4.13.2-5.el10)"
RPROVIDES:gtkmm4.0-doc = "gtkmm4.0-doc ( =  4.13.2-5.el10)"
