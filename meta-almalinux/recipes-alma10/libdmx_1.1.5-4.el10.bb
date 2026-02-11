
PN = "libdmx"
PE = "0"
PV = "1.1.5"
PR = "4.el10"
PACKAGES = "libdmx libdmx-devel"


URI_libdmx = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdmx-1.1.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdmx = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libX11.so.6()(64bit) ( ) libXext.so.6()(64bit) ( ) libX11 ( >=  1.6.0)"
RPROVIDES:libdmx = "libdmx.so.1()(64bit) ( ) libdmx ( =  1.1.5-4.el10) libdmx(x86-64) ( =  1.1.5-4.el10)"

URI_libdmx-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdmx-devel-1.1.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdmx-devel = "/usr/bin/pkg-config ( ) pkgconfig(x11) ( ) libdmx.so.1()(64bit) ( ) pkgconfig(dmxproto) ( ) pkgconfig(xext) ( ) libdmx ( =  1.1.5-4.el10)"
RPROVIDES:libdmx-devel = "libdmx-devel ( =  1.1.5-4.el10) libdmx-devel(x86-64) ( =  1.1.5-4.el10) pkgconfig(dmx) ( =  1.1.5)"
