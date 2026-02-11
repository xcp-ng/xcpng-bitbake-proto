
PN = "libhangul"
PE = "0"
PV = "0.1.0"
PR = "33.el10"
PACKAGES = "libhangul libhangul-devel"


URI_libhangul = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libhangul-0.1.0-33.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libhangul = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:libhangul = "libhangul.so.1()(64bit) ( ) libhangul ( =  0.1.0-33.el10) libhangul(x86-64) ( =  0.1.0-33.el10)"

URI_libhangul-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libhangul-devel-0.1.0-33.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libhangul-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libhangul.so.1()(64bit) ( ) libhangul ( =  0.1.0-33.el10)"
RPROVIDES:libhangul-devel = "libhangul-devel ( =  0.1.0-33.el10) libhangul-devel(x86-64) ( =  0.1.0-33.el10) pkgconfig(libhangul) ( =  0.1.0)"
