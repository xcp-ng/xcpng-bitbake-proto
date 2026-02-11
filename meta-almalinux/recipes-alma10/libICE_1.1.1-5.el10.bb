
PN = "libICE"
PE = "0"
PV = "1.1.1"
PR = "5.el10"
PACKAGES = "libICE libICE-devel"


URI_libICE = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libICE-1.1.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libICE = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:libICE = "libICE.so.6()(64bit) ( ) libICE(x86-64) ( =  1.1.1-5.el10) libICE ( =  1.1.1-5.el10)"

URI_libICE-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libICE-devel-1.1.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libICE-devel = "/usr/bin/pkg-config ( ) pkgconfig(xproto) ( ) libICE.so.6()(64bit) ( ) libICE(x86-64) ( =  1.1.1-5.el10)"
RPROVIDES:libICE-devel = "libICE-devel ( =  1.1.1-5.el10) libICE-devel(x86-64) ( =  1.1.1-5.el10) pkgconfig(ice) ( =  1.1.1)"
