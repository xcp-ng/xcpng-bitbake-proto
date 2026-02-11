
PN = "libpanel"
PE = "0"
PV = "1.8.1"
PR = "1.el10"
PACKAGES = "libpanel libpanel-devel"


URI_libpanel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libpanel-1.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpanel = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libcairo.so.2()(64bit) ( ) libgtk-4.so.1()(64bit) ( ) libadwaita-1.so.0()(64bit) ( ) libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) ( ) libgraphene-1.0.so.0()(64bit) ( ) hicolor-icon-theme ( )"
RPROVIDES:libpanel = "libpanel-1.so.1()(64bit) ( ) libpanel ( =  1.8.1-1.el10) libpanel(x86-64) ( =  1.8.1-1.el10)"

URI_libpanel-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libpanel-devel-1.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpanel-devel = "/usr/bin/pkg-config ( ) libpanel-1.so.1()(64bit) ( ) libpanel(x86-64) ( =  1.8.1-1.el10) pkgconfig(libadwaita-1) ( >=  1.6) pkgconfig(gio-2.0) ( >=  2.80) pkgconfig(glib-2.0) ( >=  2.80) pkgconfig(gobject-2.0) ( >=  2.80) pkgconfig(gtk4) ( >=  4.15)"
RPROVIDES:libpanel-devel = "libpanel-devel ( =  1.8.1-1.el10) libpanel-devel(x86-64) ( =  1.8.1-1.el10) pkgconfig(libpanel-1) ( =  1.8.1)"
