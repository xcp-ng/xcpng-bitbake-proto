
PN = "duktape"
PE = "0"
PV = "2.7.0"
PR = "10.el10"
PACKAGES = "duktape duktape-devel"


URI_duktape = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/duktape-2.7.0-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:duktape = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:duktape = "libduktape.so.207()(64bit) ( ) libduktaped.so.207()(64bit) ( ) duktape ( =  2.7.0-10.el10) duktape(x86-64) ( =  2.7.0-10.el10)"

URI_duktape-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/duktape-devel-2.7.0-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:duktape-devel = "/usr/bin/pkg-config ( ) libduktape.so.207()(64bit) ( ) libduktaped.so.207()(64bit) ( ) duktape ( =  2.7.0)"
RPROVIDES:duktape-devel = "duktape-devel ( =  2.7.0-10.el10) duktape-devel(x86-64) ( =  2.7.0-10.el10) pkgconfig(duktape) ( =  2.7.0)"
