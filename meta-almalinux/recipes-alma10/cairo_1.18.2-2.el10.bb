
PN = "cairo"
PE = "0"
PV = "1.18.2"
PR = "2.el10"
PACKAGES = "cairo cairo-devel cairo-gobject cairo-gobject-devel cairo-tools"


URI_cairo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cairo-1.18.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cairo = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libz.so.1()(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libX11.so.6()(64bit) ( ) libm.so.6(GLIBC_2.35)(64bit) ( ) libXext.so.6()(64bit) ( ) libfontconfig.so.1()(64bit) ( ) libfreetype.so.6()(64bit) ( ) libxcb.so.1()(64bit) ( ) libpng16.so.16()(64bit) ( ) libpng16.so.16(PNG16_0)(64bit) ( ) libXrender.so.1()(64bit) ( ) libxcb-shm.so.0()(64bit) ( ) libpixman-1.so.0()(64bit) ( ) libxcb-render.so.0()(64bit) ( )"
RPROVIDES:cairo = "libcairo.so.2()(64bit) ( ) libcairo-script-interpreter.so.2()(64bit) ( ) cairo(x86-64) ( =  1.18.2-2.el10) cairo ( =  1.18.2-2.el10)"

URI_cairo-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cairo-devel-1.18.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cairo-devel = "/usr/bin/pkg-config ( ) libcairo.so.2()(64bit) ( ) pkgconfig(zlib) ( ) pkgconfig(x11) ( ) pkgconfig(xext) ( ) pkgconfig(cairo) ( ) pkgconfig(xcb-shm) ( ) libcairo-script-interpreter.so.2()(64bit) ( ) cairo(x86-64) ( =  1.18.2-2.el10) pkgconfig(fontconfig) ( >=  2.13.0) pkgconfig(freetype2) ( >=  23.0.17) pkgconfig(libpng) ( >=  1.4.0) pkgconfig(pixman-1) ( >=  0.40.0) pkgconfig(xcb) ( >=  1.6) pkgconfig(xcb-render) ( >=  1.6) pkgconfig(xrender) ( >=  0.6)"
RPROVIDES:cairo-devel = "cairo-devel(x86-64) ( =  1.18.2-2.el10) cairo-devel ( =  1.18.2-2.el10) pkgconfig(cairo) ( =  1.18.2) pkgconfig(cairo-fc) ( =  1.18.2) pkgconfig(cairo-ft) ( =  1.18.2) pkgconfig(cairo-pdf) ( =  1.18.2) pkgconfig(cairo-png) ( =  1.18.2) pkgconfig(cairo-ps) ( =  1.18.2) pkgconfig(cairo-script) ( =  1.18.2) pkgconfig(cairo-script-interpreter) ( =  1.18.2) pkgconfig(cairo-svg) ( =  1.18.2) pkgconfig(cairo-tee) ( =  1.18.2) pkgconfig(cairo-xcb) ( =  1.18.2) pkgconfig(cairo-xcb-shm) ( =  1.18.2) pkgconfig(cairo-xlib) ( =  1.18.2) pkgconfig(cairo-xlib-xrender) ( =  1.18.2)"

URI_cairo-gobject = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cairo-gobject-1.18.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cairo-gobject = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libcairo.so.2()(64bit) ( ) cairo(x86-64) ( =  1.18.2-2.el10)"
RPROVIDES:cairo-gobject = "libcairo-gobject.so.2()(64bit) ( ) cairo-gobject(x86-64) ( =  1.18.2-2.el10) cairo-gobject ( =  1.18.2-2.el10)"

URI_cairo-gobject-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cairo-gobject-devel-1.18.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cairo-gobject-devel = "/usr/bin/pkg-config ( ) libcairo-gobject.so.2()(64bit) ( ) pkgconfig(zlib) ( ) pkgconfig(x11) ( ) pkgconfig(gobject-2.0) ( ) pkgconfig(xext) ( ) pkgconfig(cairo) ( ) pkgconfig(xcb-shm) ( ) pkgconfig(fontconfig) ( >=  2.13.0) cairo-devel(x86-64) ( =  1.18.2-2.el10) pkgconfig(freetype2) ( >=  23.0.17) pkgconfig(libpng) ( >=  1.4.0) pkgconfig(pixman-1) ( >=  0.40.0) pkgconfig(xcb) ( >=  1.6) pkgconfig(xcb-render) ( >=  1.6) pkgconfig(xrender) ( >=  0.6) cairo-gobject(x86-64) ( =  1.18.2-2.el10) pkgconfig(glib-2.0) ( >=  2.14)"
RPROVIDES:cairo-gobject-devel = "cairo-gobject-devel ( =  1.18.2-2.el10) cairo-gobject-devel(x86-64) ( =  1.18.2-2.el10) pkgconfig(cairo-gobject) ( =  1.18.2)"

URI_cairo-tools = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/cairo-tools-1.18.2-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cairo-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) libz.so.1()(64bit) ( ) cairo(x86-64) ( =  1.18.2-2.el10)"
RPROVIDES:cairo-tools = "libcairo-fdr.so()(64bit) ( ) libcairo-trace.so()(64bit) ( ) cairo-tools ( =  1.18.2-2.el10) cairo-tools(x86-64) ( =  1.18.2-2.el10)"
