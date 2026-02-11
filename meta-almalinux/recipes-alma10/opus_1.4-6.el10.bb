
PN = "opus"
PE = "0"
PV = "1.4"
PR = "6.el10"
PACKAGES = "opus opus-devel"


URI_opus = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/opus-1.4-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:opus = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:opus = "libopus.so.0()(64bit) ( ) opus ( =  1.4-6.el10) opus(x86-64) ( =  1.4-6.el10)"

URI_opus-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/opus-devel-1.4-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:opus-devel = "/usr/bin/pkg-config ( ) libopus.so.0()(64bit) ( ) libogg-devel ( ) opus ( =  1.4-6.el10)"
RPROVIDES:opus-devel = "opus-devel ( =  1.4-6.el10) opus-devel(x86-64) ( =  1.4-6.el10) pkgconfig(opus) ( =  1.4)"
