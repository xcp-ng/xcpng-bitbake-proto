
PN = "gtk-vnc"
PE = "0"
PV = "1.3.1"
PR = "7.el10"
PACKAGES = "gtk-vnc2 gvnc gvncpulse gtk-vnc2-devel gvnc-devel gvnc-tools gvncpulse-devel"


URI_gtk-vnc2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gtk-vnc2-1.3.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtk-vnc2 = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libX11.so.6()(64bit) ( ) libcairo.so.2()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libgdk-3.so.0()(64bit) ( ) libgvnc-1.0.so.0()(64bit) ( ) gvnc ( =  1.3.1-7.el10)"
RPROVIDES:gtk-vnc2 = "libgtk-vnc-2.0.so.0()(64bit) ( ) gtk-vnc2 ( =  1.3.1-7.el10) gtk-vnc2(x86-64) ( =  1.3.1-7.el10)"

URI_gvnc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gvnc-1.3.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gvnc = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libz.so.1()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libgnutls.so.30()(64bit) ( ) libgnutls.so.30(GNUTLS_3_4)(64bit) ( ) libc.so.6(GLIBC_2.33)(64bit) ( ) libsasl2.so.3()(64bit) ( ) libgcrypt.so.20()(64bit) ( ) libgcrypt.so.20(GCRYPT_1.6)(64bit) ( )"
RPROVIDES:gvnc = "libgvnc-1.0.so.0()(64bit) ( ) gvnc ( =  1.3.1-7.el10) gvnc(x86-64) ( =  1.3.1-7.el10)"

URI_gvncpulse = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gvncpulse-1.3.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gvncpulse = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libpulse.so.0()(64bit) ( ) libpulse.so.0(PULSE_0)(64bit) ( ) libpulse-simple.so.0()(64bit) ( ) libpulse-simple.so.0(PULSE_0)(64bit) ( ) libgvnc-1.0.so.0()(64bit) ( ) gvnc ( =  1.3.1-7.el10)"
RPROVIDES:gvncpulse = "libgvncpulse-1.0.so.0()(64bit) ( ) gvncpulse ( =  1.3.1-7.el10) gvncpulse(x86-64) ( =  1.3.1-7.el10)"

URI_gtk-vnc2-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gtk-vnc2-devel-1.3.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtk-vnc2-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) gtk3-devel ( ) pkgconfig(gvnc-1.0) ( ) libgtk-vnc-2.0.so.0()(64bit) ( ) pkgconfig(gnutls) ( >=  3.6.0) pkgconfig(gio-2.0) ( >=  2.56.0) pkgconfig(gobject-2.0) ( >=  2.56.0) pkgconfig(gdk-pixbuf-2.0) ( >=  2.36.0) pkgconfig(libgcrypt) ( >=  1.8.0) pkgconfig(libsasl2) ( >=  2.1.27) pkgconfig(zlib) ( >=  1.2.11) gtk-vnc2 ( =  1.3.1-7.el10) pkgconfig(gtk+-3.0) ( >=  3.22.0) pkgconfig(x11) ( >=  1.6.5)"
RPROVIDES:gtk-vnc2-devel = "gtk-vnc2-devel ( =  1.3.1-7.el10) gtk-vnc2-devel(x86-64) ( =  1.3.1-7.el10) pkgconfig(gtk-vnc-2.0) ( =  1.3.1)"

URI_gvnc-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gvnc-devel-1.3.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gvnc-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libgvnc-1.0.so.0()(64bit) ( ) pkgconfig(gnutls) ( >=  3.6.0) pkgconfig(gio-2.0) ( >=  2.56.0) pkgconfig(gobject-2.0) ( >=  2.56.0) pkgconfig(gdk-pixbuf-2.0) ( >=  2.36.0) pkgconfig(libgcrypt) ( >=  1.8.0) pkgconfig(libsasl2) ( >=  2.1.27) pkgconfig(zlib) ( >=  1.2.11) gvnc ( =  1.3.1-7.el10)"
RPROVIDES:gvnc-devel = "gvnc-devel ( =  1.3.1-7.el10) gvnc-devel(x86-64) ( =  1.3.1-7.el10) pkgconfig(gvnc-1.0) ( =  1.3.1)"

URI_gvnc-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gvnc-tools-1.3.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gvnc-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libgvnc-1.0.so.0()(64bit) ( ) gvnc ( =  1.3.1-7.el10)"
RPROVIDES:gvnc-tools = "gvnc-tools ( =  1.3.1-7.el10) gvnc-tools(x86-64) ( =  1.3.1-7.el10)"

URI_gvncpulse-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gvncpulse-devel-1.3.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gvncpulse-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libgvncpulse-1.0.so.0()(64bit) ( ) pkgconfig(gvnc-1.0) ( ) pkgconfig(gio-2.0) ( >=  2.56.0) pkgconfig(gobject-2.0) ( >=  2.56.0) gvncpulse ( =  1.3.1-7.el10) pkgconfig(gdk-pixbuf-2.0) ( >=  2.36.0) pkgconfig(gnutls) ( >=  3.6.0) pkgconfig(libgcrypt) ( >=  1.8.0) pkgconfig(libsasl2) ( >=  2.1.27) pkgconfig(zlib) ( >=  1.2.11) pkgconfig(libpulse-simple) ( >=  11.0)"
RPROVIDES:gvncpulse-devel = "gvncpulse-devel ( =  1.3.1-7.el10) gvncpulse-devel(x86-64) ( =  1.3.1-7.el10) pkgconfig(gvncpulse-1.0) ( =  1.3.1)"
