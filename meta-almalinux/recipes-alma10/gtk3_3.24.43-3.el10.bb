
PN = "gtk3"
PE = "0"
PV = "3.24.43"
PR = "3.el10"
PACKAGES = "gtk-update-icon-cache gtk3 gtk3-devel gtk3-immodule-xim gtk3-immodules gtk3-devel-docs gtk3-tests"


URI_gtk-update-icon-cache = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gtk-update-icon-cache-3.24.43-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtk-update-icon-cache = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( )"
RPROVIDES:gtk-update-icon-cache = "gtk-update-icon-cache ( =  3.24.43-3.el10) gtk-update-icon-cache(x86-64) ( =  3.24.43-3.el10)"

URI_gtk3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gtk3-3.24.43-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtk3 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) /bin/sh ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libX11.so.6()(64bit) ( ) libcairo.so.2()(64bit) ( ) libgmodule-2.0.so.0()(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libpangocairo-1.0.so.0()(64bit) ( ) libXext.so.6()(64bit) ( ) libfontconfig.so.1()(64bit) ( ) libharfbuzz.so.0()(64bit) ( ) libXfixes.so.3()(64bit) ( ) libXi.so.6()(64bit) ( ) libcups.so.2()(64bit) ( ) libatk-1.0.so.0()(64bit) ( ) libcairo-gobject.so.2()(64bit) ( ) libwayland-client.so.0()(64bit) ( ) libXrandr.so.2()(64bit) ( ) libXdamage.so.1()(64bit) ( ) hicolor-icon-theme ( ) libXcursor.so.1()(64bit) ( ) libXcomposite.so.1()(64bit) ( ) libxkbcommon.so.0()(64bit) ( ) libxkbcommon.so.0(V_0.5.0)(64bit) ( ) libepoxy.so.0()(64bit) ( ) libXinerama.so.1()(64bit) ( ) libfribidi.so.0()(64bit) ( ) libcolord.so.2()(64bit) ( ) libpangoft2-1.0.so.0()(64bit) ( ) libtracker-sparql-3.0.so.0()(64bit) ( ) libwayland-cursor.so.0()(64bit) ( ) libwayland-egl.so.1()(64bit) ( ) adwaita-icon-theme ( ) libatk-bridge-2.0.so.0()(64bit) ( ) gdk-pixbuf2-modules(x86-64) ( ) gtk-update-icon-cache ( ) libepoxy(x86-64) ( >=  1.4) atk(x86-64) ( >=  2.35.1) cairo(x86-64) ( >=  1.14.0) cairo-gobject(x86-64) ( >=  1.14.0) glib2(x86-64) ( >=  2.57.2) libXrandr(x86-64) ( >=  1.5.0) libwayland-client(x86-64) ( >=  1.14.91) libwayland-cursor(x86-64) ( >=  1.14.91) pango(x86-64) ( >=  1.41.0)"
RPROVIDES:gtk3 = "libgtk-3.so.0()(64bit) ( ) libgdk-3.so.0()(64bit) ( ) libgailutil-3.so.0()(64bit) ( ) gtk3(x86-64) ( =  3.24.43-3.el10) gtk3 ( =  3.24.43-3.el10)"

URI_gtk3-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gtk3-devel-3.24.43-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtk3-devel = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) /usr/bin/pkg-config ( ) libcairo.so.2()(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libgdk-3.so.0()(64bit) ( ) libpangocairo-1.0.so.0()(64bit) ( ) libharfbuzz.so.0()(64bit) ( ) libatk-1.0.so.0()(64bit) ( ) pkgconfig(x11) ( ) libepoxy.so.0()(64bit) ( ) pkgconfig(xext) ( ) pkgconfig(xfixes) ( ) pkgconfig(fontconfig) ( ) pkgconfig(gtk+-3.0) ( ) pkgconfig(xi) ( ) pkgconfig(gdk-3.0) ( ) pkgconfig(pangoft2) ( ) pkgconfig(wayland-egl) ( ) libgailutil-3.so.0()(64bit) ( ) pkgconfig(atk-bridge-2.0) ( ) pkgconfig(cairo-xlib) ( ) pkgconfig(xcomposite) ( ) pkgconfig(xcursor) ( ) pkgconfig(xdamage) ( ) pkgconfig(xinerama) ( ) pkgconfig(xrandr) ( ) gtk3(x86-64) ( =  3.24.43-3.el10) pkgconfig(gdk-pixbuf-2.0) ( >=  2.30.0) pkgconfig(atk) ( >=  2.35.1) pkgconfig(cairo) ( >=  1.14.0) pkgconfig(cairo-gobject) ( >=  1.14.0) pkgconfig(epoxy) ( >=  1.4) pkgconfig(fribidi) ( >=  0.19.7) pkgconfig(gio-2.0) ( >=  2.57.2) pkgconfig(gio-unix-2.0) ( >=  2.57.2) pkgconfig(pango) ( >=  1.41.0) pkgconfig(pangocairo) ( >=  1.41.0) pkgconfig(wayland-client) ( >=  1.14.91) pkgconfig(wayland-cursor) ( >=  1.14.91) pkgconfig(xkbcommon) ( >=  0.2.0)"
RPROVIDES:gtk3-devel = "application() ( ) application(gtk3-demo.desktop) ( ) application(gtk3-icon-browser.desktop) ( ) application(gtk3-widget-factory.desktop) ( ) gtk3-devel ( =  3.24.43-3.el10) gtk3-devel(x86-64) ( =  3.24.43-3.el10) pkgconfig(gail-3.0) ( =  3.24.43) pkgconfig(gdk-3.0) ( =  3.24.43) pkgconfig(gdk-wayland-3.0) ( =  3.24.43) pkgconfig(gdk-x11-3.0) ( =  3.24.43) pkgconfig(gtk+-3.0) ( =  3.24.43) pkgconfig(gtk+-unix-print-3.0) ( =  3.24.43) pkgconfig(gtk+-wayland-3.0) ( =  3.24.43) pkgconfig(gtk+-x11-3.0) ( =  3.24.43)"

URI_gtk3-immodule-xim = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gtk3-immodule-xim-3.24.43-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtk3-immodule-xim = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libX11.so.6()(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libgdk-3.so.0()(64bit) ( ) gtk3(x86-64) ( =  3.24.43-3.el10)"
RPROVIDES:gtk3-immodule-xim = "gtk3-immodule-xim ( =  3.24.43-3.el10) gtk3-immodule-xim(x86-64) ( =  3.24.43-3.el10)"

URI_gtk3-immodules = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gtk3-immodules-3.24.43-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtk3-immodules = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libgdk-3.so.0()(64bit) ( ) gtk3(x86-64) ( =  3.24.43-3.el10)"
RPROVIDES:gtk3-immodules = "config(gtk3-immodules) ( =  3.24.43-3.el10) gtk3-immodules ( =  3.24.43-3.el10) gtk3-immodules(x86-64) ( =  3.24.43-3.el10)"

URI_gtk3-devel-docs = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gtk3-devel-docs-3.24.43-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtk3-devel-docs = "gtk3 ( =  3.24.43-3.el10)"
RPROVIDES:gtk3-devel-docs = "gtk3-devel-docs ( =  3.24.43-3.el10) gtk3-devel-docs(x86-64) ( =  3.24.43-3.el10)"

URI_gtk3-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gtk3-tests-3.24.43-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtk3-tests = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/bash ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libX11.so.6()(64bit) ( ) libcairo.so.2()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libgdk-3.so.0()(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libatk-1.0.so.0()(64bit) ( ) gtk3(x86-64) ( =  3.24.43-3.el10)"
RPROVIDES:gtk3-tests = "gtk3-tests ( =  3.24.43-3.el10) gtk3-tests(x86-64) ( =  3.24.43-3.el10)"
