
PN = "pango"
PE = "0"
PV = "1.54.0"
PR = "3.el10"
PACKAGES = "pango pango-devel pango-doc"


URI_pango = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pango-1.54.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pango = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libX11.so.6()(64bit) ( ) libcairo.so.2()(64bit) ( ) libfontconfig.so.1()(64bit) ( ) libfreetype.so.6()(64bit) ( ) libharfbuzz.so.0()(64bit) ( ) libXrender.so.1()(64bit) ( ) libfribidi.so.0()(64bit) ( ) libXft.so.2()(64bit) ( ) libthai.so.0()(64bit) ( ) libthai.so.0(LIBTHAI_0.1)(64bit) ( ) libthai.so.0(LIBTHAI_0.1.25)(64bit) ( ) cairo(x86-64) ( >=  1.12.10) fontconfig(x86-64) ( >=  2.13.0) freetype(x86-64) ( >=  2.1.5) fribidi(x86-64) ( >=  1.0.6) glib2(x86-64) ( >=  2.62) harfbuzz(x86-64) ( >=  2.6.0) libXft(x86-64) ( >=  2.0.0) libthai(x86-64) ( >=  0.1.9)"
RPROVIDES:pango = "libpango-1.0.so.0()(64bit) ( ) libpangocairo-1.0.so.0()(64bit) ( ) libpangoft2-1.0.so.0()(64bit) ( ) libpangoxft-1.0.so.0()(64bit) ( ) pango(x86-64) ( =  1.54.0-3.el10) pango ( =  1.54.0-3.el10) pango-tests ( =  1.54.0-3.el10)"

URI_pango-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pango-devel-1.54.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pango-devel = "/usr/bin/pkg-config ( ) libpango-1.0.so.0()(64bit) ( ) libpangocairo-1.0.so.0()(64bit) ( ) libpangoft2-1.0.so.0()(64bit) ( ) pkgconfig(freetype2) ( ) pkgconfig(xrender) ( ) pkgconfig(pango) ( ) pkgconfig(pangoft2) ( ) libpangoxft-1.0.so.0()(64bit) ( ) pkgconfig(fontconfig) ( >=  2.13.0) pango(x86-64) ( =  1.54.0-3.el10) cairo-devel(x86-64) ( >=  1.12.10) fontconfig-devel(x86-64) ( >=  2.13.0) freetype-devel(x86-64) ( >=  2.1.5) glib2-devel(x86-64) ( >=  2.62) pkgconfig(cairo) ( >=  1.12.10) pkgconfig(fribidi) ( >=  1.0.6) pkgconfig(gio-2.0) ( >=  2.62) pkgconfig(glib-2.0) ( >=  2.62) pkgconfig(gobject-2.0) ( >=  2.62) pkgconfig(harfbuzz) ( >=  2.6.0) pkgconfig(harfbuzz-gobject) ( >=  2.6.0) pkgconfig(libthai) ( >=  0.1.9) pkgconfig(xft) ( >=  2.0.0)"
RPROVIDES:pango-devel = "pango-devel ( =  1.54.0-3.el10) pango-devel(x86-64) ( =  1.54.0-3.el10) pkgconfig(pango) ( =  1.54.0) pkgconfig(pangocairo) ( =  1.54.0) pkgconfig(pangofc) ( =  1.54.0) pkgconfig(pangoft2) ( =  1.54.0) pkgconfig(pangoot) ( =  1.54.0) pkgconfig(pangoxft) ( =  1.54.0)"

URI_pango-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pango-doc-1.54.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pango-doc = "pango(x86-64) ( =  1.54.0-3.el10)"
RPROVIDES:pango-doc = "pango-doc ( =  1.54.0-3.el10) pango-doc(x86-64) ( =  1.54.0-3.el10)"
