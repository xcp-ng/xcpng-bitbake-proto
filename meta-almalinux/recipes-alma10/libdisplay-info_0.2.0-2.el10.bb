
PN = "libdisplay-info"
PE = "0"
PV = "0.2.0"
PR = "2.el10"
PACKAGES = "libdisplay-info libdisplay-info-devel libdisplay-info-tools"


URI_libdisplay-info = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libdisplay-info-0.2.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdisplay-info = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( )"
RPROVIDES:libdisplay-info = "libdisplay-info.so.2()(64bit) ( ) libdisplay-info ( =  0.2.0-2.el10) libdisplay-info(x86-64) ( =  0.2.0-2.el10)"

URI_libdisplay-info-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libdisplay-info-devel-0.2.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdisplay-info-devel = "/usr/bin/pkg-config ( ) libdisplay-info.so.2()(64bit) ( ) libdisplay-info(x86-64) ( =  0.2.0-2.el10)"
RPROVIDES:libdisplay-info-devel = "libdisplay-info-devel ( =  0.2.0-2.el10) libdisplay-info-devel(x86-64) ( =  0.2.0-2.el10) pkgconfig(libdisplay-info) ( =  0.2.0)"

URI_libdisplay-info-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdisplay-info-tools-0.2.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdisplay-info-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.27)(64bit) ( ) libdisplay-info.so.2()(64bit) ( ) libdisplay-info(x86-64) ( =  0.2.0-2.el10)"
RPROVIDES:libdisplay-info-tools = "libdisplay-info-tools ( =  0.2.0-2.el10) libdisplay-info-tools(x86-64) ( =  0.2.0-2.el10)"
