
PN = "valkey"
PE = "0"
PV = "8.0.6"
PR = "1.el10_0"
PACKAGES = "valkey valkey-devel valkey-compat-redis"


URI_valkey = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/valkey-8.0.6-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:valkey = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) logrotate ( )"
RPROVIDES:valkey = "group(valkey) ( ) bundled(fpconv) ( ) bundled(lzf) ( ) bundled(hdr_histogram) ( =  0.11.0) bundled(hiredis) ( =  1.0.3) bundled(jemalloc) ( =  5.3.0) bundled(linenoise) ( =  1.0) bundled(lua-libs) ( =  5.1.5) user(valkey) ( =  dSB2YWxrZXkgLSAiVmFsa2V5IERhdGFiYXNlIFNlcnZlciIgL2Rldi9udWxsIC9zYmluL25vbG9naW4A) valkey(modules_abi)(x86-64) ( =  1) config(valkey) ( =  8.0.6-1.el10_0) valkey ( =  8.0.6-1.el10_0) valkey(x86-64) ( =  8.0.6-1.el10_0)"

URI_valkey-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/valkey-devel-8.0.6-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:valkey-devel = ""
RPROVIDES:valkey-devel = "rpm_macro(valkey_modules_abi) ( ) rpm_macro(valkey_modules_dir) ( ) valkey-devel ( =  8.0.6-1.el10_0) valkey-devel(x86-64) ( =  8.0.6-1.el10_0) valkey-static ( =  8.0.6-1.el10_0)"

URI_valkey-compat-redis = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/valkey-compat-redis-8.0.6-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:valkey-compat-redis = "/bin/sh ( ) /usr/bin/sh ( ) valkey ( =  8.0.6-1.el10_0)"
RPROVIDES:valkey-compat-redis = "redis ( =  8.0.6-1.el10_0) valkey-compat-redis ( =  8.0.6-1.el10_0)"
