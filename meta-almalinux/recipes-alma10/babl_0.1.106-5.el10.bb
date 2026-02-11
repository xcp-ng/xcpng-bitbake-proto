
PN = "babl"
PE = "0"
PV = "0.1.106"
PR = "5.el10"
PACKAGES = "babl babl-devel babl-devel-docs"


URI_babl = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/babl-0.1.106-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:babl = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) liblcms2.so.2()(64bit) ( )"
RPROVIDES:babl = "libbabl-0.1.so.0()(64bit) ( ) libbabl-0.1.so.0(V0_1_0)(64bit) ( ) babl(x86-64) ( =  0.1.106-5.el10) babl ( =  0.1.106-5.el10)"

URI_babl-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/babl-devel-0.1.106-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:babl-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libbabl-0.1.so.0()(64bit) ( ) babl(x86-64) ( =  0.1.106-5.el10) pkgconfig(lcms2) ( >=  2.8)"
RPROVIDES:babl-devel = "babl-devel ( =  0.1.106-5.el10) babl-devel(x86-64) ( =  0.1.106-5.el10) pkgconfig(babl-0.1) ( =  0.1.106)"

URI_babl-devel-docs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/babl-devel-docs-0.1.106-5.el10.noarch.rpm;unpack=0"
RDEPENDS:babl-devel-docs = "babl-devel ( =  0.1.106-5.el10)"
RPROVIDES:babl-devel-docs = "babl-devel-docs ( =  0.1.106-5.el10)"
