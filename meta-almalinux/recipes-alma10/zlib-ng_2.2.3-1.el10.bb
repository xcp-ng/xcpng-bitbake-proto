
PN = "zlib-ng"
PE = "0"
PV = "2.2.3"
PR = "1.el10"
PACKAGES = "zlib-ng-compat zlib-ng-compat-devel zlib-ng zlib-ng-compat-static zlib-ng-devel"


URI_zlib-ng-compat = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/zlib-ng-compat-2.2.3-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:zlib-ng-compat = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.16)(64bit) ( )"
RPROVIDES:zlib-ng-compat = "libz.so.1()(64bit) ( ) libz.so.1(ZLIB_1.2.0)(64bit) ( ) libz.so.1(ZLIB_1.2.2.3)(64bit) ( ) libz.so.1(ZLIB_1.2.3.3)(64bit) ( ) libz.so.1(ZLIB_1.2.2)(64bit) ( ) libz.so.1(ZLIB_1.2.0.2)(64bit) ( ) libz.so.1(ZLIB_1.2.0.8)(64bit) ( ) libz.so.1(ZLIB_1.2.3.4)(64bit) ( ) libz.so.1(ZLIB_1.2.5.1)(64bit) ( ) libz.so.1(ZLIB_1.2.9)(64bit) ( ) libz.so.1(ZLIB_1.2.12)(64bit) ( ) libz.so.1(ZLIB_1.2.2.4)(64bit) ( ) libz.so.1(ZLIB_1.2.3.5)(64bit) ( ) libz.so.1(ZLIB_1.2.5.2)(64bit) ( ) libz.so.1(ZLIB_1.2.7.1)(64bit) ( ) zlib ( =  1.3.1) zlib(x86-64) ( =  1.3.1) zlib-ng-compat ( =  2.2.3-1.el10) zlib-ng-compat(x86-64) ( =  2.2.3-1.el10)"

URI_zlib-ng-compat-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/zlib-ng-compat-devel-2.2.3-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:zlib-ng-compat-devel = "/usr/bin/pkg-config ( ) libz.so.1()(64bit) ( ) cmake-filesystem(x86-64) ( ) zlib-ng-compat(x86-64) ( =  2.2.3-1.el10)"
RPROVIDES:zlib-ng-compat-devel = "cmake(zlib) ( =  1.3.1) pkgconfig(zlib) ( =  1.3.1.zlib-ng) zlib-devel ( =  1.3.1) zlib-devel(x86-64) ( =  1.3.1) zlib-ng-compat-devel ( =  2.2.3-1.el10) zlib-ng-compat-devel(x86-64) ( =  2.2.3-1.el10)"

URI_zlib-ng = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/zlib-ng-2.2.3-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:zlib-ng = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.16)(64bit) ( )"
RPROVIDES:zlib-ng = "libz-ng.so.2()(64bit) ( ) libz-ng.so.2(FAIL)(64bit) ( ) libz-ng.so.2(ZLIB_NG_2.0.0)(64bit) ( ) libz-ng.so.2(ZLIB_NG_2.1.0)(64bit) ( ) libz-ng.so.2(ZLIB_NG_GZ_2.0.0)(64bit) ( ) zlib-ng(x86-64) ( =  2.2.3-1.el10) zlib-ng ( =  2.2.3-1.el10)"

URI_zlib-ng-compat-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/zlib-ng-compat-static-2.2.3-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:zlib-ng-compat-static = "zlib-ng-compat-devel(x86-64) ( =  2.2.3-1.el10)"
RPROVIDES:zlib-ng-compat-static = "zlib-ng-compat-static ( =  2.2.3-1.el10) zlib-ng-compat-static(x86-64) ( =  2.2.3-1.el10) zlib-static ( =  1.3.1) zlib-static(x86-64) ( =  1.3.1)"

URI_zlib-ng-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/zlib-ng-devel-2.2.3-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:zlib-ng-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) libz-ng.so.2()(64bit) ( ) zlib-ng(x86-64) ( =  2.2.3-1.el10)"
RPROVIDES:zlib-ng-devel = "cmake(zlib-ng) ( =  2.2.3) pkgconfig(zlib-ng) ( =  2.2.3) zlib-ng-devel ( =  2.2.3-1.el10) zlib-ng-devel(x86-64) ( =  2.2.3-1.el10)"
