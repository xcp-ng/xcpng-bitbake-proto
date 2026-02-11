
PN = "libXcomposite"
PE = "0"
PV = "0.4.6"
PR = "5.el10"
PACKAGES = "libXcomposite libXcomposite-devel"


URI_libXcomposite = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXcomposite-0.4.6-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXcomposite = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libX11.so.6()(64bit) ( )"
RPROVIDES:libXcomposite = "libXcomposite.so.1()(64bit) ( ) libXcomposite ( =  0.4.6-5.el10) libXcomposite(x86-64) ( =  0.4.6-5.el10)"

URI_libXcomposite-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libXcomposite-devel-0.4.6-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libXcomposite-devel = "/usr/bin/pkg-config ( ) pkgconfig(x11) ( ) libXcomposite.so.1()(64bit) ( ) pkgconfig(xproto) ( ) pkgconfig(xfixes) ( ) libXcomposite ( =  0.4.6-5.el10) pkgconfig(compositeproto) ( >=  0.4)"
RPROVIDES:libXcomposite-devel = "libXcomposite-devel ( =  0.4.6-5.el10) libXcomposite-devel(x86-64) ( =  0.4.6-5.el10) pkgconfig(xcomposite) ( =  0.4.6)"
