
PN = "geocode-glib"
PE = "0"
PV = "3.26.4"
PR = "14.el10"
PACKAGES = "geocode-glib geocode-glib-devel"


URI_geocode-glib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/geocode-glib-3.26.4-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:geocode-glib = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libjson-glib-1.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) ( ) libsoup-3.0.so.0()(64bit) ( ) json-glib(x86-64) ( >=  0.99.2)"
RPROVIDES:geocode-glib = "libgeocode-glib-2.so.0()(64bit) ( ) geocode-glib ( =  3.26.4-14.el10) geocode-glib(x86-64) ( =  3.26.4-14.el10) geocode-glib2 ( =  3.26.4-14.el10) geocode-glib2(x86-64) ( =  3.26.4-14.el10)"

URI_geocode-glib-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/geocode-glib-devel-3.26.4-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:geocode-glib-devel = "/usr/bin/pkg-config ( ) pkgconfig(gio-2.0) ( ) libgeocode-glib-2.so.0()(64bit) ( ) geocode-glib(x86-64) ( =  3.26.4-14.el10)"
RPROVIDES:geocode-glib-devel = "geocode-glib-devel ( =  3.26.4-14.el10) geocode-glib-devel(x86-64) ( =  3.26.4-14.el10) geocode-glib2-devel ( =  3.26.4-14.el10) pkgconfig(geocode-glib-2.0) ( =  3.26.4)"
