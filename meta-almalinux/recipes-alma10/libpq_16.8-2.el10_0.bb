
PN = "libpq"
PE = "0"
PV = "16.8"
PR = "2.el10_0"
PACKAGES = "libpq libpq-devel"


URI_libpq = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libpq-16.8-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpq = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libldap.so.2()(64bit) ( ) libldap.so.2(OPENLDAP_2.200)(64bit) ( ) libgssapi_krb5.so.2()(64bit) ( ) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( )"
RPROVIDES:libpq = "libpq.so.5()(64bit) ( ) libpq.so.5(RHPG_9.6)(64bit) ( ) libpq.so.5(RHPG_10)(64bit) ( ) libpq.so.5(RHPG_12)(64bit) ( ) libpq.so.5(RHPG_13)(64bit) ( ) libpq.so.5(RHPG_14)(64bit) ( ) libpq.so.5(RHPG_16)(64bit) ( ) libpq ( =  16.8-2.el10_0) libpq(x86-64) ( =  16.8-2.el10_0) postgresql-libs ( =  16.8-2.el10_0)"

URI_libpq-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libpq-devel-16.8-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libpq-devel = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/pkg-config ( ) libpq.so.5()(64bit) ( ) pkgconfig(libcrypto) ( ) pkgconfig(libssl) ( ) libpq(x86-64) ( =  16.8-2.el10_0)"
RPROVIDES:libpq-devel = "libpq-devel ( =  16.8-2.el10_0) libpq-devel(x86-64) ( =  16.8-2.el10_0) pkgconfig(libpq) ( =  16.8) postgresql-devel ( =  16.8-2.el10_0)"
