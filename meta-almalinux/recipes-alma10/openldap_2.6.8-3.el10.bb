
PN = "openldap"
PE = "0"
PV = "2.6.8"
PR = "3.el10"
PACKAGES = "openldap openldap-clients openldap-compat openldap-devel"


URI_openldap = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/openldap-2.6.8-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openldap = "shadow-utils ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libsasl2.so.3()(64bit) ( ) libevent-2.1.so.7()(64bit) ( )"
RPROVIDES:openldap = "libldap.so.2()(64bit) ( ) libldap.so.2(OPENLDAP_2.200)(64bit) ( ) liblber.so.2()(64bit) ( ) liblber.so.2(OPENLDAP_2.200)(64bit) ( ) openldap(x86-64) ( =  2.6.8-3.el10) config(openldap) ( =  2.6.8-3.el10) openldap ( =  2.6.8-3.el10)"

URI_openldap-clients = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/openldap-clients-2.6.8-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openldap-clients = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libldap.so.2()(64bit) ( ) libldap.so.2(OPENLDAP_2.200)(64bit) ( ) liblber.so.2()(64bit) ( ) liblber.so.2(OPENLDAP_2.200)(64bit) ( ) libsasl2.so.3()(64bit) ( ) openldap(x86-64) ( =  2.6.8-3.el10)"
RPROVIDES:openldap-clients = "openldap-clients ( =  2.6.8-3.el10) openldap-clients(x86-64) ( =  2.6.8-3.el10)"

URI_openldap-compat = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/openldap-compat-2.6.8-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openldap-compat = "rtld(GNU_HASH) ( ) libldap.so.2()(64bit) ( ) liblber.so.2()(64bit) ( ) libc.so.6(GLIBC_2.2.5)(64bit) ( ) openldap(x86-64) ( =  2.6.8-3.el10)"
RPROVIDES:openldap-compat = "liblber-2.4.so.2()(64bit) ( ) libldap-2.4.so.2()(64bit) ( ) libldap_r-2.4.so.2()(64bit) ( ) openldap-compat ( =  2.6.8-3.el10) openldap-compat(x86-64) ( =  2.6.8-3.el10)"

URI_openldap-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openldap-devel-2.6.8-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openldap-devel = "/usr/bin/pkg-config ( ) libldap.so.2()(64bit) ( ) liblber.so.2()(64bit) ( ) cyrus-sasl-devel(x86-64) ( ) pkgconfig(lber) ( ) openldap(x86-64) ( =  2.6.8-3.el10)"
RPROVIDES:openldap-devel = "openldap-devel ( =  2.6.8-3.el10) openldap-devel(x86-64) ( =  2.6.8-3.el10) pkgconfig(lber) ( =  2.6.8) pkgconfig(ldap) ( =  2.6.8)"
