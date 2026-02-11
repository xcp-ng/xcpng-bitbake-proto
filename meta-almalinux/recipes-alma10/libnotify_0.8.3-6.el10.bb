
PN = "libnotify"
PE = "0"
PV = "0.8.3"
PR = "6.el10"
PACKAGES = "libnotify libnotify-devel"


URI_libnotify = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libnotify-0.8.3-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnotify = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) glib2(x86-64) ( >=  2.38.0)"
RPROVIDES:libnotify = "libnotify.so.4()(64bit) ( ) libnotify(x86-64) ( =  0.8.3-6.el10) libnotify ( =  0.8.3-6.el10)"

URI_libnotify-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libnotify-devel-0.8.3-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnotify-devel = "/usr/bin/pkg-config ( ) libnotify.so.4()(64bit) ( ) pkgconfig(gdk-pixbuf-2.0) ( ) libnotify(x86-64) ( =  0.8.3-6.el10) pkgconfig(gio-2.0) ( >=  2.62.0) pkgconfig(glib-2.0) ( >=  2.62.0)"
RPROVIDES:libnotify-devel = "libnotify-devel ( =  0.8.3-6.el10) libnotify-devel(x86-64) ( =  0.8.3-6.el10) pkgconfig(libnotify) ( =  0.8.3)"
