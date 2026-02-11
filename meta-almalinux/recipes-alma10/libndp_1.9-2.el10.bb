
PN = "libndp"
PE = "0"
PV = "1.9"
PR = "2.el10"
PACKAGES = "libndp libndp-devel"


URI_libndp = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libndp-1.9-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libndp = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:libndp = "libndp.so.0()(64bit) ( ) libndp ( =  1.9-2.el10) libndp(x86-64) ( =  1.9-2.el10)"

URI_libndp-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libndp-devel-1.9-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libndp-devel = "/usr/bin/pkg-config ( ) libndp.so.0()(64bit) ( ) libndp ( =  1.9-2.el10)"
RPROVIDES:libndp-devel = "libndp-devel ( =  1.9-2.el10) libndp-devel(x86-64) ( =  1.9-2.el10) pkgconfig(libndp) ( =  1.9)"
