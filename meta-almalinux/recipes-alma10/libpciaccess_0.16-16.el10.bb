
PN = "libpciaccess"
PE = "0"
PV = "0.16"
PR = "16.el10"
PACKAGES = "libpciaccess libpciaccess-devel"


URI_libpciaccess = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libpciaccess-0.16-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpciaccess = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) hwdata ( )"
RPROVIDES:libpciaccess = "libpciaccess.so.0()(64bit) ( ) libpciaccess ( =  0.16-16.el10) libpciaccess(x86-64) ( =  0.16-16.el10)"

URI_libpciaccess-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libpciaccess-devel-0.16-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpciaccess-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libpciaccess.so.0()(64bit) ( ) libpciaccess ( =  0.16-16.el10)"
RPROVIDES:libpciaccess-devel = "libpciaccess-devel ( =  0.16-16.el10) libpciaccess-devel(x86-64) ( =  0.16-16.el10) pkgconfig(pciaccess) ( =  0.16)"
