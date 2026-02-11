
PN = "libpeas1"
PE = "0"
PV = "1.36.0"
PR = "8.el10"
PACKAGES = "libpeas1 libpeas1-gtk libpeas1-loader-python3 libpeas1-devel"


URI_libpeas1 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libpeas1-1.36.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpeas1 = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libgmodule-2.0.so.0()(64bit) ( ) libgirepository-1.0.so.1()(64bit) ( )"
RPROVIDES:libpeas1 = "libpeas-1.0.so.0()(64bit) ( ) libpeas1 ( =  1.36.0-8.el10) libpeas1(x86-64) ( =  1.36.0-8.el10)"

URI_libpeas1-gtk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libpeas1-gtk-1.36.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpeas1-gtk = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libgirepository-1.0.so.1()(64bit) ( ) libpeas-1.0.so.0()(64bit) ( ) libpeas1(x86-64) ( =  1.36.0-8.el10)"
RPROVIDES:libpeas1-gtk = "libpeas-gtk-1.0.so.0()(64bit) ( ) libpeas-gtk ( =  1.36.0-8.el10) libpeas-gtk(x86-64) ( =  1.36.0-8.el10) libpeas1-gtk ( =  1.36.0-8.el10) libpeas1-gtk(x86-64) ( =  1.36.0-8.el10)"

URI_libpeas1-loader-python3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libpeas1-loader-python3-1.36.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpeas1-loader-python3 = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libpython3.12.so.1.0()(64bit) ( ) python3-gobject ( ) libpeas-1.0.so.0()(64bit) ( ) libpeas1(x86-64) ( =  1.36.0-8.el10)"
RPROVIDES:libpeas1-loader-python3 = "libpython3loader.so()(64bit) ( ) libpeas-loader-python3 ( =  1.36.0-8.el10) libpeas-loader-python3(x86-64) ( =  1.36.0-8.el10) libpeas1-loader-python3 ( =  1.36.0-8.el10) libpeas1-loader-python3(x86-64) ( =  1.36.0-8.el10)"

URI_libpeas1-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libpeas1-devel-1.36.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpeas1-devel = "/usr/bin/pkg-config ( ) libpeas-1.0.so.0()(64bit) ( ) libpeas-gtk-1.0.so.0()(64bit) ( ) pkgconfig(gio-2.0) ( >=  2.44.0) libpeas1(x86-64) ( =  1.36.0-8.el10) libpeas1-gtk(x86-64) ( =  1.36.0-8.el10) pkgconfig(glib-2.0) ( >=  2.44.0) pkgconfig(gmodule-2.0) ( >=  2.44.0) pkgconfig(gobject-2.0) ( >=  2.44.0) pkgconfig(gobject-introspection-1.0) ( >=  1.39.0) pkgconfig(gtk+-3.0) ( >=  3.0.0) pkgconfig(libpeas-1.0) ( >=  1.36.0)"
RPROVIDES:libpeas1-devel = "libpeas1-devel ( =  1.36.0-8.el10) libpeas1-devel(x86-64) ( =  1.36.0-8.el10) pkgconfig(libpeas-1.0) ( =  1.36.0) pkgconfig(libpeas-gtk-1.0) ( =  1.36.0)"
