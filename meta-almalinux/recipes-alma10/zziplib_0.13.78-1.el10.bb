
PN = "zziplib"
PE = "0"
PV = "0.13.78"
PR = "1.el10"
PACKAGES = "zziplib zziplib-utils zziplib-devel"


URI_zziplib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/zziplib-0.13.78-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:zziplib = "rtld(GNU_HASH) ( ) libz.so.1()(64bit) ( ) libc.so.6(GLIBC_2.33)(64bit) ( )"
RPROVIDES:zziplib = "libzzip-0.so.13()(64bit) ( ) libzzipfseeko-0.so.13()(64bit) ( ) libzzipmmapped-0.so.13()(64bit) ( ) libzzipwrap-0.so.13()(64bit) ( ) zziplib(x86-64) ( =  0.13.78-1.el10) zziplib ( =  0.13.78-1.el10)"

URI_zziplib-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/zziplib-utils-0.13.78-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:zziplib-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libz.so.1()(64bit) ( ) libzzip-0.so.13()(64bit) ( ) libzzipfseeko-0.so.13()(64bit) ( ) libzzipmmapped-0.so.13()(64bit) ( ) zziplib(x86-64) ( =  0.13.78-1.el10)"
RPROVIDES:zziplib-utils = "zziplib-utils ( =  0.13.78-1.el10) zziplib-utils(x86-64) ( =  0.13.78-1.el10)"

URI_zziplib-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/zziplib-devel-0.13.78-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:zziplib-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) pkgconfig(zlib) ( ) zlib-devel ( ) SDL-devel ( ) pkgconfig(zziplib) ( ) libzzip-0.so.13()(64bit) ( ) libzzipfseeko-0.so.13()(64bit) ( ) libzzipmmapped-0.so.13()(64bit) ( ) libzzipwrap-0.so.13()(64bit) ( ) zziplib(x86-64) ( =  0.13.78-1.el10)"
RPROVIDES:zziplib-devel = "pkgconfig(zzipfseeko) ( =  0.13.78) pkgconfig(zziplib) ( =  0.13.78) pkgconfig(zzipmmapped) ( =  0.13.78) pkgconfig(zzipwrap) ( =  0.13.78) zziplib-devel ( =  0.13.78-1.el10) zziplib-devel(x86-64) ( =  0.13.78-1.el10)"
