
PN = "stunnel"
PE = "0"
PV = "5.72"
PR = "8.el10"
PACKAGES = "stunnel"


URI_stunnel = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/stunnel-5.72-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:stunnel = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( )"
RPROVIDES:stunnel = "stunnel ( =  5.72-8.el10) stunnel(x86-64) ( =  5.72-8.el10)"
