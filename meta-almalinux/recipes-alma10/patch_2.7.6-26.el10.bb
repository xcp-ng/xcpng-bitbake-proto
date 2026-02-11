
PN = "patch"
PE = "0"
PV = "2.7.6"
PR = "26.el10"
PACKAGES = "patch"


URI_patch = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/patch-2.7.6-26.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:patch = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) ed ( ) libattr.so.1()(64bit) ( ) libattr.so.1(ATTR_1.1)(64bit) ( ) libattr.so.1(ATTR_1.3)(64bit) ( )"
RPROVIDES:patch = "bundled(gnulib) ( =  20180203) patch ( =  2.7.6-26.el10) patch(x86-64) ( =  2.7.6-26.el10)"
