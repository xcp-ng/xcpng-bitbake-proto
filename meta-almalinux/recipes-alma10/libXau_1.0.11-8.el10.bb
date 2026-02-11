
PN = "libXau"
PE = "0"
PV = "1.0.11"
PR = "8.el10"
PACKAGES = "libXau libXau-devel"


URI_libXau = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXau-1.0.11-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXau = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.33)(64bit) ( )"
RPROVIDES:libXau = "libXau.so.6()(64bit) ( ) libXau ( =  1.0.11-8.el10) libXau(x86-64) ( =  1.0.11-8.el10)"

URI_libXau-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXau-devel-1.0.11-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXau-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) pkgconfig(xproto) ( ) libXau.so.6()(64bit) ( ) xorg-x11-proto-devel ( ) libXau ( =  1.0.11-8.el10)"
RPROVIDES:libXau-devel = "libXau-devel ( =  1.0.11-8.el10) libXau-devel(x86-64) ( =  1.0.11-8.el10) pkgconfig(xau) ( =  1.0.11)"
