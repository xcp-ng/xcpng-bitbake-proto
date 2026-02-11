
PN = "libiptcdata"
PE = "0"
PV = "1.0.5"
PR = "20.el10"
PACKAGES = "libiptcdata libiptcdata-devel"


URI_libiptcdata = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libiptcdata-1.0.5-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libiptcdata = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:libiptcdata = "libiptcdata.so.0()(64bit) ( ) libiptcdata ( =  1.0.5-20.el10) libiptcdata(x86-64) ( =  1.0.5-20.el10)"

URI_libiptcdata-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libiptcdata-devel-1.0.5-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libiptcdata-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libiptcdata.so.0()(64bit) ( ) libiptcdata(x86-64) ( =  1.0.5-20.el10)"
RPROVIDES:libiptcdata-devel = "libiptcdata-devel ( =  1.0.5-20.el10) libiptcdata-devel(x86-64) ( =  1.0.5-20.el10) pkgconfig(libiptcdata) ( =  1.0.5)"
