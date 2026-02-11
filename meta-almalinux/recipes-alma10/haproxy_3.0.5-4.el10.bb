
PN = "haproxy"
PE = "0"
PV = "3.0.5"
PR = "4.el10"
PACKAGES = "haproxy"


URI_haproxy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/haproxy-3.0.5-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:haproxy = "/bin/sh ( ) systemd ( ) shadow-utils ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libcrypt.so.2()(64bit) ( ) libpcre2-8.so.0()(64bit) ( ) libcrypt.so.2(XCRYPT_2.0)(64bit) ( ) libpcre2-posix.so.3()(64bit) ( ) liblua-5.4.so()(64bit) ( ) libssl.so.3(OPENSSL_3.2.0)(64bit) ( )"
RPROVIDES:haproxy = "group(haproxy) ( ) config(haproxy) ( =  3.0.5-4.el10) haproxy ( =  3.0.5-4.el10) haproxy(x86-64) ( =  3.0.5-4.el10) user(haproxy) ( =  dSBoYXByb3h5IC0gImhhcHJveHkiIC92YXIvbGliL2hhcHJveHkA)"
