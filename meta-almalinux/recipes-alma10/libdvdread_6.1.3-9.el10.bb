
PN = "libdvdread"
PE = "0"
PV = "6.1.3"
PR = "9.el10"
PACKAGES = "libdvdread libdvdread-devel"


URI_libdvdread = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libdvdread-6.1.3-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdvdread = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:libdvdread = "libdvdread.so.8()(64bit) ( ) bundled(md5-gcc) ( ) libdvdread ( =  6.1.3-9.el10) libdvdread(x86-64) ( =  6.1.3-9.el10)"

URI_libdvdread-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libdvdread-devel-6.1.3-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdvdread-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libdvdread.so.8()(64bit) ( ) libdvdread ( =  6.1.3-9.el10)"
RPROVIDES:libdvdread-devel = "libdvdread-devel ( =  6.1.3-9.el10) libdvdread-devel(x86-64) ( =  6.1.3-9.el10) pkgconfig(dvdread) ( =  6.1.3)"
