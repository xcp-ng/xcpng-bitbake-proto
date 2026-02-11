
PN = "libdvdnav"
PE = "0"
PV = "6.1.1"
PR = "10.el10"
PACKAGES = "libdvdnav libdvdnav-devel"


URI_libdvdnav = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libdvdnav-6.1.1-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdvdnav = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libdvdread.so.8()(64bit) ( )"
RPROVIDES:libdvdnav = "libdvdnav.so.4()(64bit) ( ) libdvdnav ( =  6.1.1-10.el10) libdvdnav(x86-64) ( =  6.1.1-10.el10)"

URI_libdvdnav-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libdvdnav-devel-6.1.1-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdvdnav-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libdvdnav.so.4()(64bit) ( ) libdvdnav ( =  6.1.1-10.el10) libdvdread-devel ( >=  6.0.0) pkgconfig(dvdread) ( >=  6.0.0)"
RPROVIDES:libdvdnav-devel = "libdvdnav-devel ( =  6.1.1-10.el10) libdvdnav-devel(x86-64) ( =  6.1.1-10.el10) pkgconfig(dvdnav) ( =  6.1.1)"
