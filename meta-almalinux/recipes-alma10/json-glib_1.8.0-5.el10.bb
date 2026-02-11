
PN = "json-glib"
PE = "0"
PV = "1.8.0"
PR = "5.el10"
PACKAGES = "json-glib json-glib-devel json-glib-tests"


URI_json-glib = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/json-glib-1.8.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:json-glib = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) glib2(x86-64) ( >=  2.54.0)"
RPROVIDES:json-glib = "libjson-glib-1.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) ( ) json-glib ( =  1.8.0-5.el10) json-glib(x86-64) ( =  1.8.0-5.el10)"

URI_json-glib-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/json-glib-devel-1.8.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:json-glib-devel = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) /usr/bin/pkg-config ( ) libjson-glib-1.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) ( ) json-glib(x86-64) ( =  1.8.0-5.el10) pkgconfig(gio-2.0) ( >=  2.54.0)"
RPROVIDES:json-glib-devel = "json-glib-devel ( =  1.8.0-5.el10) json-glib-devel(x86-64) ( =  1.8.0-5.el10) pkgconfig(json-glib-1.0) ( =  1.8.0)"

URI_json-glib-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/json-glib-tests-1.8.0-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:json-glib-tests = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) ( ) json-glib(x86-64) ( =  1.8.0-5.el10)"
RPROVIDES:json-glib-tests = "json-glib-tests ( =  1.8.0-5.el10) json-glib-tests(x86-64) ( =  1.8.0-5.el10)"
