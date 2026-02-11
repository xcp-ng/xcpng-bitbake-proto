
PN = "gtksourceview5"
PE = "0"
PV = "5.14.2"
PR = "1.el10"
PACKAGES = "gtksourceview5 gtksourceview5-devel gtksourceview5-tests"


URI_gtksourceview5 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gtksourceview5-5.14.2-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtksourceview5 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libxml2.so.2()(64bit) ( ) libcairo.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libpangocairo-1.0.so.0()(64bit) ( ) libfontconfig.so.1()(64bit) ( ) libgtk-4.so.1()(64bit) ( ) libpcre2-8.so.0()(64bit) ( ) hicolor-icon-theme ( ) libfribidi.so.0()(64bit) ( ) libpangoft2-1.0.so.0()(64bit) ( ) libxml2.so.2(LIBXML2_2.5.0)(64bit) ( ) libxml2.so.2(LIBXML2_2.5.7)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.6)(64bit) ( ) gtk4(x86-64) ( >=  4.6) glib2(x86-64) ( >=  2.72)"
RPROVIDES:gtksourceview5 = "libgtksourceview-5.so.0()(64bit) ( ) gtksourceview5 ( =  5.14.2-1.el10) gtksourceview5(x86-64) ( =  5.14.2-1.el10)"

URI_gtksourceview5-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gtksourceview5-devel-5.14.2-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtksourceview5-devel = "/usr/bin/pkg-config ( ) pkgconfig(fontconfig) ( ) pkgconfig(sysprof-capture-4) ( ) libgtksourceview-5.so.0()(64bit) ( ) pkgconfig(pangoft2) ( ) pkgconfig(gio-2.0) ( >=  2.72) pkgconfig(libxml-2.0) ( >=  2.6) pkgconfig(fribidi) ( >=  0.19.7) gtksourceview5(x86-64) ( =  5.14.2-1.el10) pkgconfig(glib-2.0) ( >=  2.72) pkgconfig(gobject-2.0) ( >=  2.72) pkgconfig(gtk4) ( >=  4.6) pkgconfig(libpcre2-8) ( >=  10.21)"
RPROVIDES:gtksourceview5-devel = "gtksourceview5-devel ( =  5.14.2-1.el10) gtksourceview5-devel(x86-64) ( =  5.14.2-1.el10) pkgconfig(gtksourceview-5) ( =  5.14.2)"

URI_gtksourceview5-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gtksourceview5-tests-5.14.2-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtksourceview5-tests = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libcairo.so.2()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libpangocairo-1.0.so.0()(64bit) ( ) libfontconfig.so.1()(64bit) ( ) libpcre2-8.so.0()(64bit) ( ) libxml2.so.2(LIBXML2_2.5.0)(64bit) ( ) libgtk-4.so.1()(64bit) ( ) libpangoft2-1.0.so.0()(64bit) ( ) libxml2.so.2(LIBXML2_2.5.7)(64bit) ( ) libfribidi.so.0()(64bit) ( ) libgtksourceview-5.so.0()(64bit) ( ) libxml2.so.2(LIBXML2_2.6.6)(64bit) ( ) gtksourceview5(x86-64) ( =  5.14.2-1.el10)"
RPROVIDES:gtksourceview5-tests = "gtksourceview5-tests ( =  5.14.2-1.el10) gtksourceview5-tests(x86-64) ( =  5.14.2-1.el10)"
