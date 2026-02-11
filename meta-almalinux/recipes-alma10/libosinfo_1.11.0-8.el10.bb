
PN = "libosinfo"
PE = "0"
PV = "1.11.0"
PR = "8.el10"
PACKAGES = "libosinfo libosinfo-devel"


URI_libosinfo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libosinfo-1.11.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libosinfo = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libsoup-3.0.so.0()(64bit) ( ) libxslt.so.1()(64bit) ( ) libxslt.so.1(LIBXML2_1.0.11)(64bit) ( ) libxslt.so.1(LIBXML2_1.0.18)(64bit) ( ) osinfo-db ( ) hwdata ( ) osinfo-db-tools ( )"
RPROVIDES:libosinfo = "libosinfo-1.0.so.0()(64bit) ( ) libosinfo-1.0.so.0(LIBOSINFO_0.0.1)(64bit) ( ) libosinfo-1.0.so.0(LIBOSINFO_0.0.5)(64bit) ( ) libosinfo-1.0.so.0(LIBOSINFO_0.2.2)(64bit) ( ) libosinfo-1.0.so.0(LIBOSINFO_0.2.6)(64bit) ( ) libosinfo-1.0.so.0(LIBOSINFO_1.7.0)(64bit) ( ) libosinfo-1.0.so.0(LIBOSINFO_0.0.3)(64bit) ( ) libosinfo-1.0.so.0(LIBOSINFO_0.2.3)(64bit) ( ) libosinfo-1.0.so.0(LIBOSINFO_0.2.9)(64bit) ( ) libosinfo-1.0.so.0(LIBOSINFO_0.0.6)(64bit) ( ) libosinfo-1.0.so.0(LIBOSINFO_0.1.0)(64bit) ( ) libosinfo-1.0.so.0(LIBOSINFO_0.2.0)(64bit) ( ) libosinfo-1.0.so.0(LIBOSINFO_0.2.1)(64bit) ( ) libosinfo-1.0.so.0(LIBOSINFO_0.2.10)(64bit) ( ) libosinfo-1.0.so.0(LIBOSINFO_0.2.11)(64bit) ( ) libosinfo-1.0.so.0(LIBOSINFO_0.2.12)(64bit) ( ) libosinfo-1.0.so.0(LIBOSINFO_0.2.13)(64bit) ( ) libosinfo-1.0.so.0(LIBOSINFO_0.2.7)(64bit) ( ) libosinfo-1.0.so.0(LIBOSINFO_0.2.8)(64bit) ( ) libosinfo-1.0.so.0(LIBOSINFO_1.10.0)(64bit) ( ) libosinfo-1.0.so.0(LIBOSINFO_1.3.0)(64bit) ( ) libosinfo-1.0.so.0(LIBOSINFO_1.4.0)(64bit) ( ) libosinfo-1.0.so.0(LIBOSINFO_1.5.0)(64bit) ( ) libosinfo-1.0.so.0(LIBOSINFO_1.6.0)(64bit) ( ) libosinfo-1.0.so.0(LIBOSINFO_1.8.0)(64bit) ( ) libosinfo ( =  1.11.0-8.el10) libosinfo(x86-64) ( =  1.11.0-8.el10)"

URI_libosinfo-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libosinfo-devel-1.11.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libosinfo-devel = "/usr/bin/pkg-config ( ) glib2-devel ( ) pkgconfig ( ) pkgconfig(gobject-2.0) ( ) libosinfo-1.0.so.0()(64bit) ( ) libosinfo ( =  1.11.0-8.el10)"
RPROVIDES:libosinfo-devel = "libosinfo-devel ( =  1.11.0-8.el10) libosinfo-devel(x86-64) ( =  1.11.0-8.el10) libosinfo-vala ( =  1.11.0-8.el10) pkgconfig(libosinfo-1.0) ( =  1.11.0)"
