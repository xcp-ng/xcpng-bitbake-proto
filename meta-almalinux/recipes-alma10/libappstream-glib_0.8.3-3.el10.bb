
PN = "libappstream-glib"
PE = "0"
PV = "0.8.3"
PR = "3.el10"
PACKAGES = "libappstream-glib libappstream-glib-devel libappstream-glib-builder"


URI_libappstream-glib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libappstream-glib-0.8.3-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libappstream-glib = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libcurl.so.4()(64bit) ( ) libuuid.so.1()(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( ) libarchive.so.13()(64bit) ( ) librpmio.so.10()(64bit) ( ) glib2(x86-64) ( >=  2.45.8) gdk-pixbuf2(x86-64) ( >=  2.31.5) json-glib(x86-64) ( >=  1.1.2)"
RPROVIDES:libappstream-glib = "appdata-tools ( ) libappstream-glib.so.8()(64bit) ( ) libappstream-glib ( =  0.8.3-3.el10) libappstream-glib(x86-64) ( =  0.8.3-3.el10)"

URI_libappstream-glib-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libappstream-glib-devel-0.8.3-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libappstream-glib-devel = "/usr/bin/pkg-config ( ) pkgconfig(glib-2.0) ( ) pkgconfig(gobject-2.0) ( ) pkgconfig(gdk-pixbuf-2.0) ( ) pkgconfig(uuid) ( ) pkgconfig(libarchive) ( ) libappstream-glib.so.8()(64bit) ( ) libappstream-glib(x86-64) ( =  0.8.3-3.el10)"
RPROVIDES:libappstream-glib-devel = "libappstream-glib-devel ( =  0.8.3-3.el10) libappstream-glib-devel(x86-64) ( =  0.8.3-3.el10) pkgconfig(appstream-glib) ( =  0.8.3)"

URI_libappstream-glib-builder = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libappstream-glib-builder-0.8.3-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libappstream-glib-builder = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libcairo.so.2()(64bit) ( ) libarchive.so.13()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libgdk-3.so.0()(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0()(64bit) ( ) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) ( ) libfontconfig.so.1()(64bit) ( ) libfreetype.so.6()(64bit) ( ) librpmio.so.10()(64bit) ( ) librpm.so.10()(64bit) ( ) libgmodule-2.0.so.0()(64bit) ( ) libappstream-glib.so.8()(64bit) ( ) libappstream-glib(x86-64) ( =  0.8.3-3.el10)"
RPROVIDES:libappstream-glib-builder = "libasb_plugin_appdata.so()(64bit) ( ) libasb_plugin_desktop.so()(64bit) ( ) libasb_plugin_font.so()(64bit) ( ) libasb_plugin_gettext.so()(64bit) ( ) libasb_plugin_hardcoded.so()(64bit) ( ) libasb_plugin_icon.so()(64bit) ( ) libasb_plugin_shell_extension.so()(64bit) ( ) libappstream-glib-builder ( =  0.8.3-3.el10) libappstream-glib-builder(x86-64) ( =  0.8.3-3.el10)"
