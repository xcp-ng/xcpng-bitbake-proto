
PN = "accel-config"
PE = "0"
PV = "4.1.8"
PR = "2.el10"
PACKAGES = "accel-config accel-config-libs accel-config-devel accel-config-test"


URI_accel-config = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/accel-config-4.1.8-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:accel-config = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libjson-c.so.5()(64bit) ( ) libjson-c.so.5(JSONC_0.14)(64bit) ( ) libjson-c.so.5(JSONC_PRIVATE)(64bit) ( ) libaccel-config.so.1()(64bit) ( ) libaccel-config.so.1(LIBACCFG_1)(64bit) ( ) libaccel-config.so.1(LIBACCFG_10)(64bit) ( ) libaccel-config.so.1(LIBACCFG_12)(64bit) ( ) libaccel-config.so.1(LIBACCFG_13)(64bit) ( ) libaccel-config.so.1(LIBACCFG_14)(64bit) ( ) libaccel-config.so.1(LIBACCFG_3)(64bit) ( ) libaccel-config.so.1(LIBACCFG_4)(64bit) ( ) libaccel-config.so.1(LIBACCFG_5)(64bit) ( ) libaccel-config.so.1(LIBACCFG_7)(64bit) ( ) libaccel-config.so.1(LIBACCFG_9)(64bit) ( ) accel-config-libs(x86-64) ( =  4.1.8-2.el10)"
RPROVIDES:accel-config = "accel-config(x86-64) ( =  4.1.8-2.el10) accel-config ( =  4.1.8-2.el10)"

URI_accel-config-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/accel-config-libs-4.1.8-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:accel-config-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libuuid.so.1()(64bit) ( ) accel-config(x86-64) ( =  4.1.8-2.el10)"
RPROVIDES:accel-config-libs = "libaccel-config.so.1()(64bit) ( ) libaccel-config.so.1(LIBACCFG_1)(64bit) ( ) libaccel-config.so.1(LIBACCFG_10)(64bit) ( ) libaccel-config.so.1(LIBACCFG_12)(64bit) ( ) libaccel-config.so.1(LIBACCFG_13)(64bit) ( ) libaccel-config.so.1(LIBACCFG_14)(64bit) ( ) libaccel-config.so.1(LIBACCFG_3)(64bit) ( ) libaccel-config.so.1(LIBACCFG_4)(64bit) ( ) libaccel-config.so.1(LIBACCFG_5)(64bit) ( ) libaccel-config.so.1(LIBACCFG_7)(64bit) ( ) libaccel-config.so.1(LIBACCFG_9)(64bit) ( ) libaccel-config.so.1(LIBACCFG_11)(64bit) ( ) libaccel-config.so.1(LIBACCFG_6)(64bit) ( ) libaccel-config.so.1(LIBACCFG_8)(64bit) ( ) accel-config-libs(x86-64) ( =  4.1.8-2.el10) accel-config-libs ( =  4.1.8-2.el10)"

URI_accel-config-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/accel-config-devel-4.1.8-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:accel-config-devel = "/usr/bin/pkg-config ( ) libaccel-config.so.1()(64bit) ( ) accel-config-libs(x86-64) ( =  4.1.8-2.el10)"
RPROVIDES:accel-config-devel = "accel-config-devel ( =  4.1.8-2.el10) accel-config-devel(x86-64) ( =  4.1.8-2.el10) pkgconfig(libaccel-config) ( =  4.1.8)"

URI_accel-config-test = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/accel-config-test-4.1.8-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:accel-config-test = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/bash ( ) libz.so.1()(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libaccel-config.so.1()(64bit) ( ) libaccel-config.so.1(LIBACCFG_1)(64bit) ( ) libaccel-config.so.1(LIBACCFG_10)(64bit) ( ) libaccel-config.so.1(LIBACCFG_14)(64bit) ( ) libaccel-config.so.1(LIBACCFG_5)(64bit) ( ) libaccel-config.so.1(LIBACCFG_7)(64bit) ( ) libaccel-config.so.1(LIBACCFG_8)(64bit) ( ) accel-config-libs(x86-64) ( =  4.1.8-2.el10)"
RPROVIDES:accel-config-test = "accel-config-test ( =  4.1.8-2.el10) accel-config-test(x86-64) ( =  4.1.8-2.el10)"
