
PN = "libSM"
PE = "0"
PV = "1.2.4"
PR = "5.el10"
PACKAGES = "libSM libSM-devel"


URI_libSM = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libSM-1.2.4-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libSM = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libuuid.so.1()(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( ) libICE.so.6()(64bit) ( )"
RPROVIDES:libSM = "libSM.so.6()(64bit) ( ) libSM ( =  1.2.4-5.el10) libSM(x86-64) ( =  1.2.4-5.el10)"

URI_libSM-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libSM-devel-1.2.4-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libSM-devel = "/usr/bin/pkg-config ( ) pkgconfig(xproto) ( ) libSM.so.6()(64bit) ( ) pkgconfig(ice) ( ) pkgconfig(uuid) ( ) libSM ( =  1.2.4-5.el10)"
RPROVIDES:libSM-devel = "libSM-devel ( =  1.2.4-5.el10) libSM-devel(x86-64) ( =  1.2.4-5.el10) pkgconfig(sm) ( =  1.2.4)"
