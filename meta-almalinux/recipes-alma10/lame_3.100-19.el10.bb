
PN = "lame"
PE = "0"
PV = "3.100"
PR = "19.el10"
PACKAGES = "lame lame-libs lame-devel"


URI_lame = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lame-3.100-19.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lame = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libtinfo.so.6()(64bit) ( ) libmp3lame.so.0()(64bit) ( ) lame-libs ( =  3.100-19.el10)"
RPROVIDES:lame = "lame ( =  3.100-19.el10) lame(x86-64) ( =  3.100-19.el10)"

URI_lame-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lame-libs-3.100-19.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lame-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( )"
RPROVIDES:lame-libs = "libmp3lame.so.0()(64bit) ( ) lame-libs ( =  3.100-19.el10) lame-libs(x86-64) ( =  3.100-19.el10)"

URI_lame-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/lame-devel-3.100-19.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lame-devel = "libmp3lame.so.0()(64bit) ( ) lame-libs ( =  3.100-19.el10)"
RPROVIDES:lame-devel = "lame-devel ( =  3.100-19.el10) lame-devel(x86-64) ( =  3.100-19.el10)"
