
PN = "gnome-menus"
PE = "0"
PV = "3.36.0"
PR = "16.el10"
PACKAGES = "gnome-menus gnome-menus-devel"


URI_gnome-menus = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-menus-3.36.0-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-menus = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:gnome-menus = "libgnome-menu-3.so.0()(64bit) ( ) gnome-menus ( =  3.36.0-16.el10) gnome-menus(x86-64) ( =  3.36.0-16.el10) redhat-menus ( =  12.0.2-24)"

URI_gnome-menus-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gnome-menus-devel-3.36.0-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-menus-devel = "/usr/bin/pkg-config ( ) pkgconfig(gio-unix-2.0) ( ) libgnome-menu-3.so.0()(64bit) ( ) gnome-menus(x86-64) ( =  3.36.0-16.el10)"
RPROVIDES:gnome-menus-devel = "gnome-menus-devel ( =  3.36.0-16.el10) gnome-menus-devel(x86-64) ( =  3.36.0-16.el10) pkgconfig(libgnome-menu-3.0) ( =  3.36.0)"
