
PN = "pkcs11-provider"
PE = "0"
PV = "1.0"
PR = "3.el10_0"
PACKAGES = "pkcs11-provider"


URI_pkcs11-provider = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/pkcs11-provider-1.0-3.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:pkcs11-provider = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.3)(64bit) ( )"
RPROVIDES:pkcs11-provider = "config(pkcs11-provider) ( =  1.0-3.el10_0) pkcs11-provider ( =  1.0-3.el10_0) pkcs11-provider(x86-64) ( =  1.0-3.el10_0)"
