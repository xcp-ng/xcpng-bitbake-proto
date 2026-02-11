
PN = "libsmi"
PE = "0"
PV = "0.4.8"
PR = "43.el10"
PACKAGES = "libsmi libsmi-devel"


URI_libsmi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libsmi-0.4.8-43.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsmi = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) /usr/bin/sh ( ) gawk ( ) wget ( )"
RPROVIDES:libsmi = "libsmi.so.2()(64bit) ( ) config(libsmi) ( =  0.4.8-43.el10) libsmi ( =  0.4.8-43.el10) libsmi(x86-64) ( =  0.4.8-43.el10)"

URI_libsmi-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libsmi-devel-0.4.8-43.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsmi-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libsmi.so.2()(64bit) ( ) libsmi(x86-64) ( =  0.4.8-43.el10)"
RPROVIDES:libsmi-devel = "libsmi-devel ( =  0.4.8-43.el10) libsmi-devel(x86-64) ( =  0.4.8-43.el10) pkgconfig(libsmi) ( =  0.5.0)"
