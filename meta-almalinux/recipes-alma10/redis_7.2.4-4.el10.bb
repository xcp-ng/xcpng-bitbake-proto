
PN = "redis"
PE = "0"
PV = "7.2.4"
PR = "4.el10"
PACKAGES = "redis redis-devel redis-doc"


URI_redis = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/redis-7.2.4-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:redis = "/bin/sh ( ) systemd ( ) shadow-utils ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libssl.so.3()(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) logrotate ( )"
RPROVIDES:redis = "bundled(fpconv) ( ) bundled(lzf) ( ) bundled(hdr_histogram) ( =  0.11.0) bundled(hiredis) ( =  1.0.3) bundled(jemalloc) ( =  5.3.0) bundled(linenoise) ( =  1.0) bundled(lua-libs) ( =  5.1.5) config(redis) ( =  7.2.4-4.el10) redis ( =  7.2.4-4.el10) redis(modules_abi)(x86-64) ( =  1) redis(x86-64) ( =  7.2.4-4.el10)"

URI_redis-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/redis-devel-7.2.4-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:redis-devel = ""
RPROVIDES:redis-devel = "rpm_macro(redis_modules_abi) ( ) rpm_macro(redis_modules_dir) ( ) redis-devel ( =  7.2.4-4.el10) redis-devel(x86-64) ( =  7.2.4-4.el10) redis-static ( =  7.2.4-4.el10)"

URI_redis-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/redis-doc-7.2.4-4.el10.noarch.rpm;unpack=0"
RDEPENDS:redis-doc = ""
RPROVIDES:redis-doc = "redis-doc ( =  7.2.4-4.el10)"
