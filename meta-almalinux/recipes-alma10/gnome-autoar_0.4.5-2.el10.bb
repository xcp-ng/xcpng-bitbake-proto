
PN = "gnome-autoar"
PE = "0"
PV = "0.4.5"
PR = "2.el10"
PACKAGES = "gnome-autoar gnome-autoar-devel"


URI_gnome-autoar = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-autoar-0.4.5-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-autoar = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libc.so.6(GLIBC_2.33)(64bit) ( ) libarchive.so.13()(64bit) ( )"
RPROVIDES:gnome-autoar = "libgnome-autoar-0.so.0()(64bit) ( ) libgnome-autoar-gtk-0.so.0()(64bit) ( ) gnome-autoar ( =  0.4.5-2.el10) gnome-autoar(x86-64) ( =  0.4.5-2.el10)"

URI_gnome-autoar-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gnome-autoar-devel-0.4.5-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-autoar-devel = "/usr/bin/pkg-config ( ) libgnome-autoar-0.so.0()(64bit) ( ) libgnome-autoar-gtk-0.so.0()(64bit) ( ) gnome-autoar(x86-64) ( =  0.4.5-2.el10) pkgconfig(gio-2.0) ( >=  2.35.6) pkgconfig(glib-2.0) ( >=  2.35.6) pkgconfig(gtk+-3.0) ( >=  3.2) pkgconfig(libarchive) ( >=  3.4.0)"
RPROVIDES:gnome-autoar-devel = "gnome-autoar-devel ( =  0.4.5-2.el10) gnome-autoar-devel(x86-64) ( =  0.4.5-2.el10) pkgconfig(gnome-autoar-0) ( =  0.4.5) pkgconfig(gnome-autoar-gtk-0) ( =  0.4.5)"
