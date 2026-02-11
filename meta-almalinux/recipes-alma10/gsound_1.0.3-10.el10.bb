
PN = "gsound"
PE = "0"
PV = "1.0.3"
PR = "10.el10"
PACKAGES = "gsound gsound-devel"


URI_gsound = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gsound-1.0.3-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gsound = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libcanberra.so.0()(64bit) ( )"
RPROVIDES:gsound = "libgsound.so.0()(64bit) ( ) gsound ( =  1.0.3-10.el10) gsound(x86-64) ( =  1.0.3-10.el10)"

URI_gsound-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gsound-devel-1.0.3-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gsound-devel = "/usr/bin/pkg-config ( ) pkgconfig(gobject-2.0) ( ) pkgconfig(gio-2.0) ( ) libgsound.so.0()(64bit) ( ) pkgconfig(libcanberra) ( ) gsound(x86-64) ( =  1.0.3-10.el10)"
RPROVIDES:gsound-devel = "gsound-devel ( =  1.0.3-10.el10) gsound-devel(x86-64) ( =  1.0.3-10.el10) pkgconfig(gsound) ( =  1.0.3)"
