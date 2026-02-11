
PN = "upower"
PE = "0"
PV = "1.90.6"
PR = "2.el10"
PACKAGES = "upower upower-libs upower-devel upower-devel-docs"


URI_upower = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/upower-1.90.6-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:upower = "/bin/sh ( ) rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) /usr/bin/python3 ( ) libgio-2.0.so.0()(64bit) ( ) libpolkit-gobject-1.so.0()(64bit) ( ) libgudev-1.0.so.0()(64bit) ( ) udev ( ) libupower-glib.so.3()(64bit) ( ) upower-libs(x86-64) ( =  1.90.6-2.el10)"
RPROVIDES:upower = "upower(x86-64) ( =  1.90.6-2.el10) config(upower) ( =  1.90.6-2.el10) upower ( =  1.90.6-2.el10)"

URI_upower-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/upower-libs-1.90.6-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:upower-libs = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) gobject-introspection ( )"
RPROVIDES:upower-libs = "libupower-glib.so.3()(64bit) ( ) upower-libs(x86-64) ( =  1.90.6-2.el10) upower-libs ( =  1.90.6-2.el10)"

URI_upower-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/upower-devel-1.90.6-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:upower-devel = "/usr/bin/pkg-config ( ) libupower-glib.so.3()(64bit) ( ) upower-libs(x86-64) ( =  1.90.6-2.el10) pkgconfig(glib-2.0) ( >=  2.66) pkgconfig(gobject-2.0) ( >=  2.66) pkgconfig(polkit-gobject-1) ( >=  0.103)"
RPROVIDES:upower-devel = "pkgconfig(upower-glib) ( =  1.90.6) upower-devel ( =  1.90.6-2.el10) upower-devel(x86-64) ( =  1.90.6-2.el10)"

URI_upower-devel-docs = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/upower-devel-docs-1.90.6-2.el10.noarch.rpm;unpack=0"
RDEPENDS:upower-devel-docs = "upower-libs ( =  1.90.6-2.el10)"
RPROVIDES:upower-devel-docs = "upower-devel-docs ( =  1.90.6-2.el10)"
