
PN = "appstream"
PE = "0"
PV = "1.0.2"
PR = "5.el10"
PACKAGES = "appstream appstream-compose appstream-compose-devel appstream-devel appstream-qt appstream-qt-devel"


URI_appstream = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/appstream-1.0.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:appstream = "rtld(GNU_HASH) ( ) /bin/sh ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libxml2.so.2()(64bit) ( ) libsystemd.so.0()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libzstd.so.1()(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libcurl.so.4()(64bit) ( ) libyaml-0.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.9.0)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.23)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.8)(64bit) ( ) appstream-data ( ) libxmlb.so.2()(64bit) ( ) libxmlb.so.2(LIBXMLB_0.1.0)(64bit) ( ) libxmlb.so.2(LIBXMLB_0.1.1)(64bit) ( ) libxmlb.so.2(LIBXMLB_0.1.12)(64bit) ( ) libxmlb.so.2(LIBXMLB_0.1.4)(64bit) ( ) libxmlb.so.2(LIBXMLB_0.3.0)(64bit) ( ) libxmlb.so.2(LIBXMLB_0.3.1)(64bit) ( ) libxmlb.so.2(LIBXMLB_0.3.4)(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_240)(64bit) ( )"
RPROVIDES:appstream = "metainfo() ( ) libappstream.so.5()(64bit) ( ) metainfo(org.freedesktop.appstream.cli.metainfo.xml) ( ) appstream(x86-64) ( =  1.0.2-5.el10) appstream ( =  1.0.2-5.el10)"

URI_appstream-compose = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/appstream-compose-1.0.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:appstream-compose = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libcairo.so.2()(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libgdk_pixbuf-2.0.so.0()(64bit) ( ) libfontconfig.so.1()(64bit) ( ) libfreetype.so.6()(64bit) ( ) libyaml-0.so.2()(64bit) ( ) librsvg-2.so.2()(64bit) ( ) libappstream.so.5()(64bit) ( ) appstream(x86-64) ( =  1.0.2-5.el10)"
RPROVIDES:appstream-compose = "metainfo() ( ) libappstream-compose.so.0()(64bit) ( ) metainfo(org.freedesktop.appstream.compose.metainfo.xml) ( ) appstream-compose ( =  1.0.2-5.el10) appstream-compose(x86-64) ( =  1.0.2-5.el10)"

URI_appstream-compose-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/appstream-compose-devel-1.0.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:appstream-compose-devel = "/usr/bin/pkg-config ( ) pkgconfig(gdk-pixbuf-2.0) ( ) pkgconfig(appstream) ( ) libappstream-compose.so.0()(64bit) ( ) pkgconfig(glib-2.0) ( >=  2.62) pkgconfig(gobject-2.0) ( >=  2.62) appstream-devel(x86-64) ( =  1.0.2-5.el10) appstream-compose(x86-64) ( =  1.0.2-5.el10) pkgconfig(gio-2.0) ( >=  2.62)"
RPROVIDES:appstream-compose-devel = "appstream-compose-devel ( =  1.0.2-5.el10) appstream-compose-devel(x86-64) ( =  1.0.2-5.el10) pkgconfig(appstream-compose) ( =  1.0.2)"

URI_appstream-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/appstream-devel-1.0.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:appstream-devel = "/usr/bin/pkg-config ( ) pkgconfig(gio-2.0) ( ) libappstream.so.5()(64bit) ( ) pkgconfig(glib-2.0) ( >=  2.62) appstream(x86-64) ( =  1.0.2-5.el10) pkgconfig(gobject-2.0) ( >=  2.62)"
RPROVIDES:appstream-devel = "appstream-devel(x86-64) ( =  1.0.2-5.el10) appstream-devel ( =  1.0.2-5.el10) appstream-vala ( =  1.0.2-5.el10) pkgconfig(appstream) ( =  1.0.2)"

URI_appstream-qt = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/appstream-qt-1.0.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:appstream-qt = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libQt6Core.so.6()(64bit) ( ) libQt6Core.so.6(Qt_6)(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libQt6Core.so.6(Qt_6.7)(64bit) ( ) libappstream.so.5()(64bit) ( ) appstream(x86-64) ( =  1.0.2-5.el10)"
RPROVIDES:appstream-qt = "libAppStreamQt.so.3()(64bit) ( ) appstream-qt(x86-64) ( =  1.0.2-5.el10) appstream-qt ( =  1.0.2-5.el10)"

URI_appstream-qt-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/appstream-qt-devel-1.0.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:appstream-qt-devel = "cmake-filesystem(x86-64) ( ) libAppStreamQt.so.3()(64bit) ( ) appstream-qt(x86-64) ( =  1.0.2-5.el10) pkgconfig(Qt6Core) ( >=  6.2.4)"
RPROVIDES:appstream-qt-devel = "appstream-qt-devel ( =  1.0.2-5.el10) appstream-qt-devel(x86-64) ( =  1.0.2-5.el10) cmake(AppStreamQt) ( =  1.0.2) cmake(appstreamqt) ( =  1.0.2)"
