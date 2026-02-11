
PN = "rng-tools"
PE = "0"
PV = "6.17"
PR = "4.el10"
PACKAGES = "rng-tools"


URI_rng-tools = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/rng-tools-6.17-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rng-tools = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libcap.so.2()(64bit) ( ) libjansson.so.4()(64bit) ( ) libjansson.so.4(libjansson.so.4)(64bit) ( ) libcurl.so.4()(64bit) ( ) libjitterentropy.so.3()(64bit) ( ) selinux-policy ( if  selinux-policy)"
RPROVIDES:rng-tools = "config(rng-tools) ( =  6.17-4.el10) rng-tools ( =  6.17-4.el10) rng-tools(x86-64) ( =  6.17-4.el10)"
