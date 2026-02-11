
PN = "libell"
PE = "0"
PV = "0.62"
PR = "3.el10"
PACKAGES = "libell libell-devel"


URI_libell = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libell-0.62-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libell = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( )"
RPROVIDES:libell = "libell.so.0()(64bit) ( ) libell.so.0(ELL_0.10)(64bit) ( ) libell ( =  0.62-3.el10) libell(x86-64) ( =  0.62-3.el10)"

URI_libell-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libell-devel-0.62-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libell-devel = "/usr/bin/pkg-config ( ) libell.so.0()(64bit) ( ) libell(x86-64) ( =  0.62-3.el10)"
RPROVIDES:libell-devel = "libell-devel ( =  0.62-3.el10) libell-devel(x86-64) ( =  0.62-3.el10) pkgconfig(ell) ( =  0.62)"
