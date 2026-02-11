
PN = "sbc"
PE = "0"
PV = "2.0"
PR = "6.el10"
PACKAGES = "libsbc sbc sbc-devel"


URI_libsbc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libsbc-2.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsbc = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( )"
RPROVIDES:libsbc = "libsbc.so.1()(64bit) ( ) libsbc.so.1(SBC_1.0)(64bit) ( ) libsbc.so.1(SBC_1.1)(64bit) ( ) libsbc.so.1(SBC_1.2)(64bit) ( ) libsbc.so.1(SBC_1.3)(64bit) ( ) libsbc(x86-64) ( =  2.0-6.el10) libsbc ( =  2.0-6.el10)"

URI_sbc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sbc-2.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sbc = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libsbc(x86-64) ( =  2.0-6.el10)"
RPROVIDES:sbc = "sbc ( =  2.0-6.el10) sbc(x86-64) ( =  2.0-6.el10)"

URI_sbc-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sbc-devel-2.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sbc-devel = "/usr/bin/pkg-config ( ) libsbc.so.1()(64bit) ( ) libsbc(x86-64) ( =  2.0-6.el10) sbc(x86-64) ( =  2.0-6.el10)"
RPROVIDES:sbc-devel = "pkgconfig(sbc) ( =  2.0) sbc-devel ( =  2.0-6.el10) sbc-devel(x86-64) ( =  2.0-6.el10)"
