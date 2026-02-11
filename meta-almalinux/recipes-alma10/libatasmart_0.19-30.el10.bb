
PN = "libatasmart"
PE = "0"
PV = "0.19"
PR = "30.el10"
PACKAGES = "libatasmart libatasmart-devel"


URI_libatasmart = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libatasmart-0.19-30.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libatasmart = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libudev.so.1()(64bit) ( ) libudev.so.1(LIBUDEV_183)(64bit) ( )"
RPROVIDES:libatasmart = "libatasmart.so.4()(64bit) ( ) libatasmart ( =  0.19-30.el10) libatasmart(x86-64) ( =  0.19-30.el10)"

URI_libatasmart-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libatasmart-devel-0.19-30.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libatasmart-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) vala ( ) libatasmart.so.4()(64bit) ( ) libatasmart ( =  0.19-30.el10)"
RPROVIDES:libatasmart-devel = "libatasmart-devel ( =  0.19-30.el10) libatasmart-devel(x86-64) ( =  0.19-30.el10) pkgconfig(libatasmart) ( =  0.19)"
