
PN = "libXxf86vm"
PE = "0"
PV = "1.1.5"
PR = "8.el10"
PACKAGES = "libXxf86vm libXxf86vm-devel"


URI_libXxf86vm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXxf86vm-1.1.5-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXxf86vm = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libX11.so.6()(64bit) ( ) libXext.so.6()(64bit) ( ) libX11 ( >=  1.5.99.902)"
RPROVIDES:libXxf86vm = "libXxf86vm.so.1()(64bit) ( ) libXxf86vm ( =  1.1.5-8.el10) libXxf86vm(x86-64) ( =  1.1.5-8.el10)"

URI_libXxf86vm-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libXxf86vm-devel-1.1.5-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXxf86vm-devel = "/usr/bin/pkg-config ( ) pkgconfig(x11) ( ) pkgconfig(xext) ( ) libXxf86vm.so.1()(64bit) ( ) pkgconfig(xf86vidmodeproto) ( ) libXxf86vm ( =  1.1.5-8.el10)"
RPROVIDES:libXxf86vm-devel = "libXxf86vm-devel ( =  1.1.5-8.el10) libXxf86vm-devel(x86-64) ( =  1.1.5-8.el10) pkgconfig(xxf86vm) ( =  1.1.5)"
