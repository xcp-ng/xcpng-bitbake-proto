
PN = "libspelling"
PE = "0"
PV = "0.4.6"
PR = "1.el10"
PACKAGES = "libspelling libspelling-devel"


URI_libspelling = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libspelling-0.4.6-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libspelling = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libgtk-4.so.1()(64bit) ( ) libicuuc.so.74()(64bit) ( ) libgtksourceview-5.so.0()(64bit) ( ) libenchant-2.so.2()(64bit) ( )"
RPROVIDES:libspelling = "libspelling-1.so.2()(64bit) ( ) libspelling ( =  0.4.6-1.el10) libspelling(x86-64) ( =  0.4.6-1.el10)"

URI_libspelling-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libspelling-devel-0.4.6-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libspelling-devel = "/usr/bin/pkg-config ( ) pkgconfig(gio-2.0) ( ) pkgconfig(gtk4) ( ) pkgconfig(gtksourceview-5) ( ) libspelling-1.so.2()(64bit) ( ) libspelling(x86-64) ( =  0.4.6-1.el10)"
RPROVIDES:libspelling-devel = "libspelling-devel ( =  0.4.6-1.el10) libspelling-devel(x86-64) ( =  0.4.6-1.el10) pkgconfig(libspelling-1) ( =  0.4.6)"
