
PN = "twolame"
PE = "0"
PV = "0.4.0"
PR = "6.el10"
PACKAGES = "twolame twolame-libs twolame-devel"


URI_twolame = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/twolame-0.4.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:twolame = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libsndfile.so.1()(64bit) ( ) libsndfile.so.1(libsndfile.so.1.0)(64bit) ( ) libtwolame.so.0()(64bit) ( )"
RPROVIDES:twolame = "twolame ( =  0.4.0-6.el10) twolame(x86-64) ( =  0.4.0-6.el10)"

URI_twolame-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/twolame-libs-0.4.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:twolame-libs = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( )"
RPROVIDES:twolame-libs = "libtwolame.so.0()(64bit) ( ) twolame-libs ( =  0.4.0-6.el10) twolame-libs(x86-64) ( =  0.4.0-6.el10)"

URI_twolame-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/twolame-devel-0.4.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:twolame-devel = "/usr/bin/pkg-config ( ) libtwolame.so.0()(64bit) ( ) twolame-libs(x86-64) ( =  0.4.0-6.el10)"
RPROVIDES:twolame-devel = "pkgconfig(twolame) ( =  0.4.0) twolame-devel ( =  0.4.0-6.el10) twolame-devel(x86-64) ( =  0.4.0-6.el10)"
