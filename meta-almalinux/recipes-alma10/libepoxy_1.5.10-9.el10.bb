
PN = "libepoxy"
PE = "0"
PV = "1.5.10"
PR = "9.el10"
PACKAGES = "libepoxy libepoxy-devel"


URI_libepoxy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libepoxy-1.5.10-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libepoxy = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:libepoxy = "libepoxy.so.0()(64bit) ( ) libepoxy(x86-64) ( =  1.5.10-9.el10) libepoxy ( =  1.5.10-9.el10)"

URI_libepoxy-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libepoxy-devel-1.5.10-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libepoxy-devel = "/usr/bin/pkg-config ( ) pkgconfig(x11) ( ) libepoxy.so.0()(64bit) ( ) pkgconfig(egl) ( ) pkgconfig(gl) ( ) libepoxy(x86-64) ( =  1.5.10-9.el10)"
RPROVIDES:libepoxy-devel = "libepoxy-devel ( =  1.5.10-9.el10) libepoxy-devel(x86-64) ( =  1.5.10-9.el10) pkgconfig(epoxy) ( =  1.5.10)"
