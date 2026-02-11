
PN = "libsoup3"
PE = "0"
PV = "3.6.5"
PR = "3.el10_0.9"
PACKAGES = "libsoup3 libsoup3-devel libsoup3-doc"


URI_libsoup3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libsoup3-3.6.5-3.el10_0.9.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsoup3 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libz.so.1()(64bit) ( ) libgmodule-2.0.so.0()(64bit) ( ) libz.so.1(ZLIB_1.2.0)(64bit) ( ) libsqlite3.so.0()(64bit) ( ) libgssapi_krb5.so.2()(64bit) ( ) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) ( ) libbrotlidec.so.1()(64bit) ( ) libnghttp2.so.14()(64bit) ( ) libpsl.so.5()(64bit) ( )"
RPROVIDES:libsoup3 = "libsoup-3.0.so.0()(64bit) ( ) libsoup3(x86-64) ( =  3.6.5-3.el10_0.9) libsoup3 ( =  3.6.5-3.el10_0.9)"

URI_libsoup3-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libsoup3-devel-3.6.5-3.el10_0.9.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsoup3-devel = "/usr/bin/pkg-config ( ) pkgconfig(zlib) ( ) libsoup-3.0.so.0()(64bit) ( ) pkgconfig(libbrotlidec) ( ) pkgconfig(libnghttp2) ( ) pkgconfig(sqlite3) ( ) pkgconfig(sysprof-capture-4) ( ) pkgconfig(krb5-gssapi) ( ) pkgconfig(gio-2.0) ( >=  2.70.0) pkgconfig(glib-2.0) ( >=  2.70.0) pkgconfig(gmodule-no-export-2.0) ( >=  2.70.0) pkgconfig(gobject-2.0) ( >=  2.70.0) pkgconfig(libpsl) ( >=  0.20) libsoup3(x86-64) ( =  3.6.5-3.el10_0.9)"
RPROVIDES:libsoup3-devel = "pkgconfig(libsoup-3.0) ( =  3.6.5) libsoup3-devel ( =  3.6.5-3.el10_0.9) libsoup3-devel(x86-64) ( =  3.6.5-3.el10_0.9)"

URI_libsoup3-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libsoup3-doc-3.6.5-3.el10_0.9.noarch.rpm;unpack=0"
RDEPENDS:libsoup3-doc = ""
RPROVIDES:libsoup3-doc = "libsoup3-doc ( =  3.6.5-3.el10_0.9)"
