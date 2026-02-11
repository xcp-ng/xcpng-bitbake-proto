
PN = "tracker"
PE = "0"
PV = "3.7.3"
PR = "4.el10"
PACKAGES = "libtracker-sparql tracker tracker-devel tracker-doc"


URI_libtracker-sparql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libtracker-sparql-3.7.3-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libtracker-sparql = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) /usr/bin/sh ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libgmodule-2.0.so.0()(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libsqlite3.so.0()(64bit) ( ) libjson-glib-1.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) ( ) libicuuc.so.74()(64bit) ( ) libavahi-common.so.3()(64bit) ( ) libavahi-client.so.3()(64bit) ( ) libicui18n.so.74()(64bit) ( ) libsoup-3.0.so.0()(64bit) ( ) libxml2.so.2(LIBXML2_2.5.2)(64bit) ( ) libavahi-glib.so.1()(64bit) ( ) libxml2.so.2(LIBXML2_2.5.0)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.17)(64bit) ( )"
RPROVIDES:libtracker-sparql = "libtracker-sparql-3.0.so.0()(64bit) ( ) libtracker-http-soup3.so()(64bit) ( ) libtracker-parser-libicu.so()(64bit) ( ) libtracker-sparql(x86-64) ( =  3.7.3-4.el10) libtracker-sparql ( =  3.7.3-4.el10) libtracker-sparql3 ( =  3.7.3-4.el10) libtracker-sparql3(x86-64) ( =  3.7.3-4.el10)"

URI_tracker = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tracker-3.7.3-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tracker = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libgmodule-2.0.so.0()(64bit) ( ) libsqlite3.so.0()(64bit) ( ) libjson-glib-1.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) ( ) libavahi-common.so.3()(64bit) ( ) libavahi-client.so.3()(64bit) ( ) libavahi-glib.so.1()(64bit) ( ) libtracker-sparql-3.0.so.0()(64bit) ( ) libtracker-sparql(x86-64) ( =  3.7.3-4.el10)"
RPROVIDES:tracker = "tracker(x86-64) ( =  3.7.3-4.el10) tracker ( =  3.7.3-4.el10) tracker3 ( =  3.7.3-4.el10) tracker3(x86-64) ( =  3.7.3-4.el10)"

URI_tracker-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/tracker-devel-3.7.3-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tracker-devel = "/usr/bin/pkg-config ( ) /usr/bin/sh ( ) libtracker-sparql-3.0.so.0()(64bit) ( ) libtracker-sparql(x86-64) ( =  3.7.3-4.el10) pkgconfig(gio-2.0) ( >  2.52.0) pkgconfig(gio-unix-2.0) ( >  2.52.0) pkgconfig(glib-2.0) ( >  2.52.0) pkgconfig(gmodule-2.0) ( >  2.52.0) pkgconfig(gobject-2.0) ( >  2.52.0) pkgconfig(json-glib-1.0) ( >=  1.4) pkgconfig(libxml-2.0) ( >  2.6) pkgconfig(sqlite3) ( >  3.20.0)"
RPROVIDES:tracker-devel = "pkgconfig(tracker-sparql-3.0) ( =  3.7.3) pkgconfig(tracker-testutils-3.0) ( =  3.7.3) tracker-devel ( =  3.7.3-4.el10) tracker-devel(x86-64) ( =  3.7.3-4.el10) tracker3-devel ( =  3.7.3-4.el10) tracker3-devel(x86-64) ( =  3.7.3-4.el10)"

URI_tracker-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/tracker-doc-3.7.3-4.el10.noarch.rpm;unpack=0"
RDEPENDS:tracker-doc = ""
RPROVIDES:tracker-doc = "tracker-doc ( =  3.7.3-4.el10) tracker3-doc ( =  3.7.3-4.el10)"
