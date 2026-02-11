
PN = "rest"
PE = "0"
PV = "0.9.1"
PR = "11.el10"
PACKAGES = "rest rest-devel rest-demo"


URI_rest = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rest-0.9.1-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rest = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libjson-glib-1.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) ( ) libsoup-3.0.so.0()(64bit) ( ) libxml2.so.2(LIBXML2_2.5.2)(64bit) ( ) libxml2.so.2(LIBXML2_2.5.0)(64bit) ( )"
RPROVIDES:rest = "librest-1.0.so.0()(64bit) ( ) librest-extras-1.0.so.0()(64bit) ( ) rest ( =  0.9.1-11.el10) rest(x86-64) ( =  0.9.1-11.el10)"

URI_rest-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/rest-devel-0.9.1-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rest-devel = "/usr/bin/pkg-config ( ) pkgconfig(libxml-2.0) ( ) pkgconfig(json-glib-1.0) ( ) pkgconfig(rest-1.0) ( ) librest-1.0.so.0()(64bit) ( ) librest-extras-1.0.so.0()(64bit) ( ) pkgconfig(glib-2.0) ( >=  2.44) pkgconfig(libsoup-3.0) ( >=  2.99.2) rest(x86-64) ( =  0.9.1-11.el10)"
RPROVIDES:rest-devel = "pkgconfig(rest-1.0) ( =  0.9.1) pkgconfig(rest-extras-1.0) ( =  0.9.1) rest-devel ( =  0.9.1-11.el10) rest-devel(x86-64) ( =  0.9.1-11.el10)"

URI_rest-demo = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rest-demo-0.9.1-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rest-demo = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) ( ) libsoup-3.0.so.0()(64bit) ( ) libgtk-4.so.1()(64bit) ( ) libgtksourceview-5.so.0()(64bit) ( ) libadwaita-1.so.0()(64bit) ( ) libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) ( ) librest-1.0.so.0()(64bit) ( ) rest(x86-64) ( =  0.9.1-11.el10)"
RPROVIDES:rest-demo = "application() ( ) application(org.gnome.RestDemo.desktop) ( ) rest-demo ( =  0.9.1-11.el10) rest-demo(x86-64) ( =  0.9.1-11.el10)"
