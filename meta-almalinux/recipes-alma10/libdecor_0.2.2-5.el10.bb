
PN = "libdecor"
PE = "0"
PV = "0.2.2"
PR = "5.el10"
PACKAGES = "libdecor libdecor-devel"


URI_libdecor = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libdecor-0.2.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdecor = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libcairo.so.2()(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libgtk-3.so.0()(64bit) ( ) libdbus-1.so.3()(64bit) ( ) libgdk-3.so.0()(64bit) ( ) libpangocairo-1.0.so.0()(64bit) ( ) libdbus-1.so.3(LIBDBUS_1_3)(64bit) ( ) libwayland-client.so.0()(64bit) ( ) libwayland-cursor.so.0()(64bit) ( )"
RPROVIDES:libdecor = "libdecor-0.so.0()(64bit) ( ) libdecor-cairo.so()(64bit) ( ) libdecor-gtk.so()(64bit) ( ) libdecor ( =  0.2.2-5.el10) libdecor(x86-64) ( =  0.2.2-5.el10)"

URI_libdecor-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libdecor-devel-0.2.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdecor-devel = "/usr/bin/pkg-config ( ) pkgconfig(wayland-client) ( ) libdecor-0.so.0()(64bit) ( ) libdecor(x86-64) ( =  0.2.2-5.el10)"
RPROVIDES:libdecor-devel = "libdecor-devel ( =  0.2.2-5.el10) libdecor-devel(x86-64) ( =  0.2.2-5.el10) pkgconfig(libdecor-0) ( =  0.2.2)"
