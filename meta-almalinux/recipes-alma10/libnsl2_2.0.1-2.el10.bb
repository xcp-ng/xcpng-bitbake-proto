
PN = "libnsl2"
PE = "0"
PV = "2.0.1"
PR = "2.el10"
PACKAGES = "libnsl2 libnsl2-devel"


URI_libnsl2 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libnsl2-2.0.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnsl2 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libtirpc.so.3()(64bit) ( ) libtirpc.so.3(TIRPC_0.3.0)(64bit) ( )"
RPROVIDES:libnsl2 = "libnsl.so.3()(64bit) ( ) libnsl.so.3(LIBNSL_2.0)(64bit) ( ) libnsl2(x86-64) ( =  2.0.1-2.el10) libnsl2 ( =  2.0.1-2.el10)"

URI_libnsl2-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libnsl2-devel-2.0.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnsl2-devel = "/usr/bin/pkg-config ( ) libnsl.so.3()(64bit) ( ) libnsl2(x86-64) ( =  2.0.1-2.el10) pkgconfig(libtirpc) ( >=  1.0.1)"
RPROVIDES:libnsl2-devel = "libnsl2-devel ( =  2.0.1-2.el10) libnsl2-devel(x86-64) ( =  2.0.1-2.el10) pkgconfig(libnsl) ( =  2.0.1)"
