
PN = "socat"
PE = "0"
PV = "1.7.4.4"
PR = "8.el10"
PACKAGES = "socat"


URI_socat = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/socat-1.7.4.4-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:socat = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libreadline.so.8()(64bit) ( )"
RPROVIDES:socat = "socat ( =  1.7.4.4-8.el10) socat(x86-64) ( =  1.7.4.4-8.el10)"
