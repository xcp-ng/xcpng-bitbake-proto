
PN = "wavpack"
PE = "0"
PV = "5.6.0"
PR = "9.el10"
PACKAGES = "wavpack wavpack-devel"


URI_wavpack = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/wavpack-5.6.0-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:wavpack = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( )"
RPROVIDES:wavpack = "libwavpack.so.1()(64bit) ( ) wavpack ( =  5.6.0-9.el10) wavpack(x86-64) ( =  5.6.0-9.el10)"

URI_wavpack-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/wavpack-devel-5.6.0-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:wavpack-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libwavpack.so.1()(64bit) ( ) wavpack(x86-64) ( =  5.6.0-9.el10)"
RPROVIDES:wavpack-devel = "pkgconfig(wavpack) ( =  5.6.0) wavpack-devel ( =  5.6.0-9.el10) wavpack-devel(x86-64) ( =  5.6.0-9.el10)"
