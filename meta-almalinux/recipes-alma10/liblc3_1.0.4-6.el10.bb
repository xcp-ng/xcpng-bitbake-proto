
PN = "liblc3"
PE = "0"
PV = "1.0.4"
PR = "6.el10"
PACKAGES = "liblc3 liblc3-devel liblc3-utils"


URI_liblc3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/liblc3-1.0.4-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liblc3 = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:liblc3 = "liblc3.so.1()(64bit) ( ) liblc3 ( =  1.0.4-6.el10) liblc3(x86-64) ( =  1.0.4-6.el10)"

URI_liblc3-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/liblc3-devel-1.0.4-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liblc3-devel = "/usr/bin/pkg-config ( ) liblc3.so.1()(64bit) ( ) liblc3(x86-64) ( =  1.0.4-6.el10)"
RPROVIDES:liblc3-devel = "liblc3-devel ( =  1.0.4-6.el10) liblc3-devel(x86-64) ( =  1.0.4-6.el10) pkgconfig(lc3) ( =  1.0.4)"

URI_liblc3-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/liblc3-utils-1.0.4-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liblc3-utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) liblc3.so.1()(64bit) ( ) liblc3(x86-64) ( =  1.0.4-6.el10)"
RPROVIDES:liblc3-utils = "liblc3-utils ( =  1.0.4-6.el10) liblc3-utils(x86-64) ( =  1.0.4-6.el10)"
