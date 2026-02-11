
PN = "libdbusmenu"
PE = "0"
PV = "16.04.0"
PR = "32.el10"
PACKAGES = "libdbusmenu libdbusmenu-devel libdbusmenu-gtk3 libdbusmenu-gtk3-devel libdbusmenu-doc libdbusmenu-gtk3-tests libdbusmenu-jsonloader libdbusmenu-jsonloader-devel libdbusmenu-tools"


URI_libdbusmenu = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libdbusmenu-16.04.0-32.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdbusmenu = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( )"
RPROVIDES:libdbusmenu = "libdbusmenu-glib.so.4()(64bit) ( ) libdbusmenu(x86-64) ( =  16.04.0-32.el10) libdbusmenu ( =  16.04.0-32.el10)"

URI_libdbusmenu-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libdbusmenu-devel-16.04.0-32.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdbusmenu-devel = "/usr/bin/pkg-config ( ) libdbusmenu-glib.so.4()(64bit) ( ) libdbusmenu(x86-64) ( =  16.04.0-32.el10)"
RPROVIDES:libdbusmenu-devel = "libdbusmenu-devel ( =  16.04.0-32.el10) libdbusmenu-devel(x86-64) ( =  16.04.0-32.el10) pkgconfig(dbusmenu-glib-0.4) ( =  16.04.0)"

URI_libdbusmenu-gtk3 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libdbusmenu-gtk3-16.04.0-32.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdbusmenu-gtk3 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libcairo.so.2()(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libgdk-3.so.0()(64bit) ( ) libpangocairo-1.0.so.0()(64bit) ( ) libdbusmenu-glib.so.4()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libcairo-gobject.so.2()(64bit) ( ) libharfbuzz.so.0()(64bit) ( ) libatk-1.0.so.0()(64bit) ( ) libdbusmenu(x86-64) ( =  16.04.0-32.el10)"
RPROVIDES:libdbusmenu-gtk3 = "libdbusmenu-gtk3.so.4()(64bit) ( ) libdbusmenu-gtk3(x86-64) ( =  16.04.0-32.el10) libdbusmenu-gtk3 ( =  16.04.0-32.el10)"

URI_libdbusmenu-gtk3-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libdbusmenu-gtk3-devel-16.04.0-32.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdbusmenu-gtk3-devel = "/usr/bin/pkg-config ( ) pkgconfig(gtk+-3.0) ( ) pkgconfig(gdk-pixbuf-2.0) ( ) libdbusmenu-gtk3.so.4()(64bit) ( ) gtk3-devel ( ) pkgconfig(dbusmenu-glib-0.4) ( ) libdbusmenu(x86-64) ( =  16.04.0-32.el10) libdbusmenu-gtk3(x86-64) ( =  16.04.0-32.el10)"
RPROVIDES:libdbusmenu-gtk3-devel = "libdbusmenu-gtk3-devel ( =  16.04.0-32.el10) libdbusmenu-gtk3-devel(x86-64) ( =  16.04.0-32.el10) pkgconfig(dbusmenu-gtk3-0.4) ( =  16.04.0)"

URI_libdbusmenu-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdbusmenu-doc-16.04.0-32.el10.noarch.rpm;unpack=0"
RDEPENDS:libdbusmenu-doc = ""
RPROVIDES:libdbusmenu-doc = "libdbusmenu-doc ( =  16.04.0-32.el10)"

URI_libdbusmenu-gtk3-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdbusmenu-gtk3-tests-16.04.0-32.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdbusmenu-gtk3-tests = "rtld(GNU_HASH) ( ) /usr/bin/sh ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libdbusmenu-glib.so.4()(64bit) ( ) libdbusmenu(x86-64) ( =  16.04.0-32.el10) libdbusmenu-gtk3(x86-64) ( =  16.04.0-32.el10)"
RPROVIDES:libdbusmenu-gtk3-tests = "libdbusmenu-gtk3-tests ( =  16.04.0-32.el10) libdbusmenu-gtk3-tests(x86-64) ( =  16.04.0-32.el10)"

URI_libdbusmenu-jsonloader = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdbusmenu-jsonloader-16.04.0-32.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdbusmenu-jsonloader = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libjson-glib-1.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) ( ) libdbusmenu-glib.so.4()(64bit) ( ) libdbusmenu ( =  16.04.0-32.el10) libdbusmenu-devel(x86-64) ( =  16.04.0-32.el10)"
RPROVIDES:libdbusmenu-jsonloader = "libdbusmenu-jsonloader.so.4()(64bit) ( ) libdbusmenu-jsonloader(x86-64) ( =  16.04.0-32.el10) libdbusmenu-jsonloader ( =  16.04.0-32.el10)"

URI_libdbusmenu-jsonloader-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdbusmenu-jsonloader-devel-16.04.0-32.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdbusmenu-jsonloader-devel = "/usr/bin/pkg-config ( ) libdbusmenu-jsonloader.so.4()(64bit) ( ) pkgconfig(dbusmenu-glib-0.4) ( ) pkgconfig(json-glib-1.0) ( ) libdbusmenu(x86-64) ( =  16.04.0-32.el10) libdbusmenu-jsonloader(x86-64) ( =  16.04.0-32.el10)"
RPROVIDES:libdbusmenu-jsonloader-devel = "libdbusmenu-jsonloader-devel ( =  16.04.0-32.el10) libdbusmenu-jsonloader-devel(x86-64) ( =  16.04.0-32.el10) pkgconfig(dbusmenu-jsonloader-0.4) ( =  16.04.0)"

URI_libdbusmenu-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdbusmenu-tools-16.04.0-32.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdbusmenu-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) ( ) libdbusmenu-glib.so.4()(64bit) ( ) libdbusmenu(x86-64) ( =  16.04.0-32.el10)"
RPROVIDES:libdbusmenu-tools = "libdbusmenu-tools ( =  16.04.0-32.el10) libdbusmenu-tools(x86-64) ( =  16.04.0-32.el10)"
