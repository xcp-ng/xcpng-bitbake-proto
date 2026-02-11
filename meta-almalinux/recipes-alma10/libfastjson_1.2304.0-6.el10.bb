
PN = "libfastjson"
PE = "0"
PV = "1.2304.0"
PR = "6.el10"
PACKAGES = "libfastjson libfastjson-devel"


URI_libfastjson = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libfastjson-1.2304.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libfastjson = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:libfastjson = "libfastjson.so.4()(64bit) ( ) libfastjson ( =  1.2304.0-6.el10) libfastjson(x86-64) ( =  1.2304.0-6.el10)"

URI_libfastjson-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libfastjson-devel-1.2304.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libfastjson-devel = "/usr/bin/pkg-config ( ) libfastjson.so.4()(64bit) ( ) libfastjson(x86-64) ( =  1.2304.0-6.el10)"
RPROVIDES:libfastjson-devel = "libfastjson-devel ( =  1.2304.0-6.el10) libfastjson-devel(x86-64) ( =  1.2304.0-6.el10) pkgconfig(libfastjson) ( =  1.2304.0)"
