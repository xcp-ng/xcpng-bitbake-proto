
PN = "mod_auth_gssapi"
PE = "0"
PV = "1.6.5"
PR = "8.el10"
PACKAGES = "mod_auth_gssapi"


URI_mod_auth_gssapi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mod_auth_gssapi-1.6.5-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mod_auth_gssapi = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libkrb5.so.3()(64bit) ( ) libcom_err.so.2()(64bit) ( ) libgssapi_krb5.so.2()(64bit) ( ) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) ( ) libk5crypto.so.3()(64bit) ( ) httpd-mmn ( =  20120211x8664) krb5-libs ( >=  1.11.5)"
RPROVIDES:mod_auth_gssapi = "config(mod_auth_gssapi) ( =  1.6.5-8.el10) mod_auth_gssapi ( =  1.6.5-8.el10) mod_auth_gssapi(x86-64) ( =  1.6.5-8.el10)"
