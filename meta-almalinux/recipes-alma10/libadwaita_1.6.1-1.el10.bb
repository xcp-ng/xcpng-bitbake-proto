
PN = "libadwaita"
PE = "0"
PV = "1.6.1"
PR = "1.el10"
PACKAGES = "libadwaita libadwaita-devel libadwaita-doc libadwaita-demo"


URI_libadwaita = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libadwaita-1.6.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libadwaita = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libm.so.6(GLIBC_2.35)(64bit) ( ) libgtk-4.so.1()(64bit) ( ) libgraphene-1.0.so.0()(64bit) ( ) libfribidi.so.0()(64bit) ( ) libappstream.so.5()(64bit) ( ) gtk4(x86-64) ( >=  4.15.2)"
RPROVIDES:libadwaita = "libadwaita-1.so.0()(64bit) ( ) libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) ( ) libadwaita-1-internal.so.0()(64bit) ( ) libadwaita-1-internal.so.0(LIBADWAITA_1_0)(64bit) ( ) libadwaita ( =  1.6.1-1.el10) libadwaita(x86-64) ( =  1.6.1-1.el10)"

URI_libadwaita-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libadwaita-devel-1.6.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libadwaita-devel = "/usr/bin/pkg-config ( ) pkgconfig(glib-2.0) ( ) pkgconfig(gio-2.0) ( ) vala ( ) pkgconfig(appstream) ( ) pkgconfig(fribidi) ( ) libadwaita-1-internal.so.0()(64bit) ( ) libadwaita-1.so.0()(64bit) ( ) libadwaita(x86-64) ( =  1.6.1-1.el10) pkgconfig(gtk4) ( >=  4.15.2)"
RPROVIDES:libadwaita-devel = "libadwaita-devel ( =  1.6.1-1.el10) libadwaita-devel(x86-64) ( =  1.6.1-1.el10) pkgconfig(libadwaita-1) ( =  1.6.1)"

URI_libadwaita-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libadwaita-doc-1.6.1-1.el10.noarch.rpm;unpack=0"
RDEPENDS:libadwaita-doc = ""
RPROVIDES:libadwaita-doc = "libadwaita-doc ( =  1.6.1-1.el10)"

URI_libadwaita-demo = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libadwaita-demo-1.6.1-1.el10.noarch.rpm;unpack=0"
RDEPENDS:libadwaita-demo = "libadwaita ( =  1.6.1-1.el10)"
RPROVIDES:libadwaita-demo = "metainfo() ( ) application() ( ) application(org.gnome.Adwaita1.Demo.desktop) ( ) metainfo(org.gnome.Adwaita1.Demo.metainfo.xml) ( ) libadwaita-demo ( =  1.6.1-1.el10)"
