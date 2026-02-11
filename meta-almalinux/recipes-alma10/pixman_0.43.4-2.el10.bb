
PN = "pixman"
PE = "0"
PV = "0.43.4"
PR = "2.el10"
PACKAGES = "pixman pixman-devel"


URI_pixman = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pixman-0.43.4-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pixman = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:pixman = "libpixman-1.so.0()(64bit) ( ) pixman ( =  0.43.4-2.el10) pixman(x86-64) ( =  0.43.4-2.el10)"

URI_pixman-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pixman-devel-0.43.4-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pixman-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libpixman-1.so.0()(64bit) ( ) pixman ( =  0.43.4-2.el10)"
RPROVIDES:pixman-devel = "pixman-devel ( =  0.43.4-2.el10) pixman-devel(x86-64) ( =  0.43.4-2.el10) pkgconfig(pixman-1) ( =  0.43.4)"
