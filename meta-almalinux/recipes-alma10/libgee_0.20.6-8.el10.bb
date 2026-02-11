
PN = "libgee"
PE = "0"
PV = "0.20.6"
PR = "8.el10"
PACKAGES = "libgee libgee-devel"


URI_libgee = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgee-0.20.6-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgee = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:libgee = "libgee-0.8.so.2()(64bit) ( ) libgee ( =  0.20.6-8.el10) libgee(x86-64) ( =  0.20.6-8.el10)"

URI_libgee-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libgee-devel-0.20.6-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgee-devel = "/usr/bin/pkg-config ( ) pkgconfig(glib-2.0) ( ) pkgconfig(gobject-2.0) ( ) libgee-0.8.so.2()(64bit) ( ) libgee(x86-64) ( =  0.20.6-8.el10)"
RPROVIDES:libgee-devel = "libgee-devel ( =  0.20.6-8.el10) libgee-devel(x86-64) ( =  0.20.6-8.el10) pkgconfig(gee-0.8) ( =  0.20.6)"
