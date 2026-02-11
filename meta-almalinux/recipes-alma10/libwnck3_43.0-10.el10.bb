
PN = "libwnck3"
PE = "0"
PV = "43.0"
PR = "10.el10"
PACKAGES = "libwnck3 libwnck3-devel"


URI_libwnck3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libwnck3-43.0-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libwnck3 = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libX11.so.6()(64bit) ( ) libcairo.so.2()(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libgdk-3.so.0()(64bit) ( ) libatk-1.0.so.0()(64bit) ( ) libXrender.so.1()(64bit) ( ) startup-notification ( ) libstartup-notification-1.so.0()(64bit) ( ) libXRes.so.1()(64bit) ( )"
RPROVIDES:libwnck3 = "libwnck-3.so.0()(64bit) ( ) libwnck3 ( =  43.0-10.el10) libwnck3(x86-64) ( =  43.0-10.el10)"

URI_libwnck3-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libwnck3-devel-43.0-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libwnck3-devel = "/usr/bin/pkg-config ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) pkgconfig(glib-2.0) ( ) pkgconfig(gobject-2.0) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) pkgconfig(gtk+-3.0) ( ) pkgconfig(x11) ( ) pkgconfig(cairo) ( ) libgdk-3.so.0()(64bit) ( ) libX11.so.6()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) pkgconfig(pango) ( ) pkgconfig(xres) ( ) libwnck-3.so.0()(64bit) ( ) pkgconfig(libstartup-notification-1.0) ( ) libwnck3(x86-64) ( =  43.0-10.el10)"
RPROVIDES:libwnck3-devel = "libwnck3-devel ( =  43.0-10.el10) libwnck3-devel(x86-64) ( =  43.0-10.el10) pkgconfig(libwnck-3.0) ( =  43.0)"
