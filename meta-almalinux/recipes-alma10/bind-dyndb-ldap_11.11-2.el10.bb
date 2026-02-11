
PN = "bind-dyndb-ldap"
PE = "0"
PV = "11.11"
PR = "2.el10"
PACKAGES = "bind-dyndb-ldap"


URI_bind-dyndb-ldap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bind-dyndb-ldap-11.11-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bind-dyndb-ldap = "/bin/sh ( ) bind ( >=  32:9.18.33-2) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libkrb5.so.3()(64bit) ( ) libkrb5.so.3(krb5_3_MIT)(64bit) ( ) libuuid.so.1()(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( ) libldap.so.2()(64bit) ( ) libldap.so.2(OPENLDAP_2.200)(64bit) ( ) libdns-9.18.33.so()(64bit) ( ) libisc-9.18.33.so()(64bit) ( ) pkcs11-provider ( >=  0.3) softhsm ( >=  2.6.1)"
RPROVIDES:bind-dyndb-ldap = "bind-dyndb-ldap ( =  11.11-2.el10) bind-dyndb-ldap(x86-64) ( =  11.11-2.el10)"
