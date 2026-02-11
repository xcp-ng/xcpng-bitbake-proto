
PN = "kronosnet"
PE = "0"
PV = "1.30"
PR = "1.el10"
PACKAGES = "libknet1 libknet1-devel libnozzle1-devel"


URI_libknet1 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libknet1-1.30-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libknet1 = "/sbin/ldconfig ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6()(64bit) ( )"
RPROVIDES:libknet1 = "libknet.so.1()(64bit) ( ) libknet.so.1(LIBKNET)(64bit) ( ) libknet1(x86-64) ( =  1.30-1.el10) libknet1 ( =  1.30-1.el10)"

URI_libknet1-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libknet1-devel-1.30-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libknet1-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libknet.so.1()(64bit) ( ) libknet1(x86-64) ( =  1.30-1.el10)"
RPROVIDES:libknet1-devel = "libknet1-devel ( =  1.30-1.el10) libknet1-devel(x86-64) ( =  1.30-1.el10) pkgconfig(libknet) ( =  1.30)"

URI_libnozzle1-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libnozzle1-devel-1.30-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnozzle1-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libnozzle.so.1()(64bit) ( ) libnozzle1(x86-64) ( =  1.30-1.el10)"
RPROVIDES:libnozzle1-devel = "libnozzle1-devel ( =  1.30-1.el10) libnozzle1-devel(x86-64) ( =  1.30-1.el10) pkgconfig(libnozzle) ( =  1.30)"
