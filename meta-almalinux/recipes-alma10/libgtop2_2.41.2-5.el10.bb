
PN = "libgtop2"
PE = "0"
PV = "2.41.2"
PR = "5.el10"
PACKAGES = "libgtop2 libgtop2-devel"


URI_libgtop2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libgtop2-2.41.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgtop2 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( )"
RPROVIDES:libgtop2 = "libgtop-2.0.so.11()(64bit) ( ) libgtop2 ( =  2.41.2-5.el10) libgtop2(x86-64) ( =  2.41.2-5.el10)"

URI_libgtop2-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libgtop2-devel-2.41.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libgtop2-devel = "/usr/bin/pkg-config ( ) pkgconfig(glib-2.0) ( ) libgtop-2.0.so.11()(64bit) ( ) libgtop2(x86-64) ( =  2.41.2-5.el10)"
RPROVIDES:libgtop2-devel = "libgtop2-devel ( =  2.41.2-5.el10) libgtop2-devel(x86-64) ( =  2.41.2-5.el10) pkgconfig(libgtop-2.0) ( =  2.41.2)"
