
PN = "libXdamage"
PE = "0"
PV = "1.1.6"
PR = "5.el10"
PACKAGES = "libXdamage libXdamage-devel"


URI_libXdamage = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXdamage-1.1.6-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXdamage = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libX11.so.6()(64bit) ( ) libXfixes.so.3()(64bit) ( )"
RPROVIDES:libXdamage = "libXdamage.so.1()(64bit) ( ) libXdamage ( =  1.1.6-5.el10) libXdamage(x86-64) ( =  1.1.6-5.el10)"

URI_libXdamage-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXdamage-devel-1.1.6-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXdamage-devel = "/usr/bin/pkg-config ( ) libXdamage.so.1()(64bit) ( ) pkgconfig(x11) ( ) pkgconfig(xproto) ( ) pkgconfig(xfixes) ( ) libXdamage ( =  1.1.6-5.el10) pkgconfig(damageproto) ( >=  1.1)"
RPROVIDES:libXdamage-devel = "libXdamage-devel ( =  1.1.6-5.el10) libXdamage-devel(x86-64) ( =  1.1.6-5.el10) pkgconfig(xdamage) ( =  1.1.6)"
