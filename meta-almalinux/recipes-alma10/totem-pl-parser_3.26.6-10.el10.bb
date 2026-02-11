
PN = "totem-pl-parser"
PE = "0"
PV = "3.26.6"
PR = "10.el10"
PACKAGES = "totem-pl-parser totem-pl-parser-devel"


URI_totem-pl-parser = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/totem-pl-parser-3.26.6-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:totem-pl-parser = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libarchive.so.13()(64bit) ( ) libgcrypt.so.20()(64bit) ( ) libgcrypt.so.20(GCRYPT_1.6)(64bit) ( ) libuchardet.so.0()(64bit) ( )"
RPROVIDES:totem-pl-parser = "libtotem-plparser-mini.so.18()(64bit) ( ) libtotem-plparser.so.18()(64bit) ( ) libtotem-plparser-mini.so.18(LIBTOTEM_PL_PARSER_MINI_1.0)(64bit) ( ) libtotem-plparser.so.18(LIBTOTEM_PL_PARSER_MINI_1.0)(64bit) ( ) totem-pl-parser(x86-64) ( =  3.26.6-10.el10) totem-pl-parser ( =  3.26.6-10.el10)"

URI_totem-pl-parser-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/totem-pl-parser-devel-3.26.6-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:totem-pl-parser-devel = "/usr/bin/pkg-config ( ) pkgconfig(glib-2.0) ( ) pkgconfig(gobject-2.0) ( ) pkgconfig(gio-2.0) ( ) pkgconfig(libxml-2.0) ( ) pkgconfig(gthread-2.0) ( ) libtotem-plparser-mini.so.18()(64bit) ( ) libtotem-plparser.so.18()(64bit) ( ) pkgconfig(libarchive) ( ) totem-pl-parser(x86-64) ( =  3.26.6-10.el10)"
RPROVIDES:totem-pl-parser-devel = "pkgconfig(totem-plparser) ( =  3.26.6) pkgconfig(totem-plparser-mini) ( =  3.26.6) totem-pl-parser-devel ( =  3.26.6-10.el10) totem-pl-parser-devel(x86-64) ( =  3.26.6-10.el10)"
