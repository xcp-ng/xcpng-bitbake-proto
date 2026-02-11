
PN = "mtdev"
PE = "0"
PV = "1.1.6"
PR = "10.el10"
PACKAGES = "mtdev mtdev-devel"


URI_mtdev = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mtdev-1.1.6-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mtdev = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( )"
RPROVIDES:mtdev = "libmtdev.so.1()(64bit) ( ) mtdev ( =  1.1.6-10.el10) mtdev(x86-64) ( =  1.1.6-10.el10)"

URI_mtdev-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mtdev-devel-1.1.6-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mtdev-devel = "/usr/bin/pkg-config ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) pkgconfig ( ) libmtdev.so.1()(64bit) ( ) mtdev ( =  1.1.6-10.el10)"
RPROVIDES:mtdev-devel = "mtdev-devel ( =  1.1.6-10.el10) mtdev-devel(x86-64) ( =  1.1.6-10.el10) pkgconfig(mtdev) ( =  1.1.6)"
