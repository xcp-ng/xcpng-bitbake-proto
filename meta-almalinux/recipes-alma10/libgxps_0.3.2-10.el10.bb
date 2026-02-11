
PN = "libgxps"
PE = "0"
PV = "0.3.2"
PR = "10.el10"
PACKAGES = "libgxps libgxps-devel libgxps-tools"


URI_libgxps = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgxps-0.3.2-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgxps = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libcairo.so.2()(64bit) ( ) libm.so.6(GLIBC_2.35)(64bit) ( ) libjpeg.so.62()(64bit) ( ) libjpeg.so.62(LIBJPEG_6.2)(64bit) ( ) libfreetype.so.6()(64bit) ( ) libpng16.so.16()(64bit) ( ) libpng16.so.16(PNG16_0)(64bit) ( ) libarchive.so.13()(64bit) ( ) libtiff.so.6()(64bit) ( ) libtiff.so.6(LIBTIFF_4.0)(64bit) ( ) liblcms2.so.2()(64bit) ( )"
RPROVIDES:libgxps = "libgxps.so.2()(64bit) ( ) libgxps ( =  0.3.2-10.el10) libgxps(x86-64) ( =  0.3.2-10.el10)"

URI_libgxps-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libgxps-devel-0.3.2-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgxps-devel = "/usr/bin/pkg-config ( ) libgxps.so.2()(64bit) ( ) pkgconfig(cairo) ( >=  1.10.0) pkgconfig(libarchive) ( >=  2.8.0) libgxps(x86-64) ( =  0.3.2-10.el10) pkgconfig(gio-2.0) ( >=  2.36.0) pkgconfig(gobject-2.0) ( >=  2.36.0)"
RPROVIDES:libgxps-devel = "libgxps-devel ( =  0.3.2-10.el10) libgxps-devel(x86-64) ( =  0.3.2-10.el10) pkgconfig(libgxps) ( =  0.3.2)"

URI_libgxps-tools = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libgxps-tools-0.3.2-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgxps-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libcairo.so.2()(64bit) ( ) libpng16.so.16()(64bit) ( ) libpng16.so.16(PNG16_0)(64bit) ( ) libjpeg.so.62()(64bit) ( ) libjpeg.so.62(LIBJPEG_6.2)(64bit) ( ) libgxps.so.2()(64bit) ( ) libgxps(x86-64) ( =  0.3.2-10.el10)"
RPROVIDES:libgxps-tools = "libgxps-tools ( =  0.3.2-10.el10) libgxps-tools(x86-64) ( =  0.3.2-10.el10)"
