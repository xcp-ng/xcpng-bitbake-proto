
PN = "cyrus-sasl"
PE = "0"
PV = "2.1.28"
PR = "27.el10"
PACKAGES = "cyrus-sasl cyrus-sasl-gssapi cyrus-sasl-lib cyrus-sasl-plain cyrus-sasl-scram cyrus-sasl-devel cyrus-sasl-gs2 cyrus-sasl-ldap cyrus-sasl-md5 cyrus-sasl-sql"


URI_cyrus-sasl = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cyrus-sasl-2.1.28-27.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cyrus-sasl = "/bin/sh ( ) /usr/sbin/groupadd ( ) /usr/sbin/useradd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libkrb5.so.3()(64bit) ( ) libldap.so.2()(64bit) ( ) libldap.so.2(OPENLDAP_2.200)(64bit) ( ) libkrb5.so.3(krb5_3_MIT)(64bit) ( ) liblber.so.2()(64bit) ( ) libpam.so.0()(64bit) ( ) libpam.so.0(LIBPAM_1.0)(64bit) ( ) liblber.so.2(OPENLDAP_2.200)(64bit) ( ) libcrypt.so.2()(64bit) ( ) libcrypt.so.2(XCRYPT_2.0)(64bit) ( ) libgdbm.so.6()(64bit) ( ) libsasl2.so.3()(64bit) ( ) /sbin/nologin ( ) /usr/sbin/groupdel ( ) /usr/sbin/userdel ( ) cyrus-sasl-lib(x86-64) ( =  2.1.28-27.el10)"
RPROVIDES:cyrus-sasl = "group(saslauth) ( ) user(saslauth) ( ) config(cyrus-sasl) ( =  2.1.28-27.el10) cyrus-sasl ( =  2.1.28-27.el10) cyrus-sasl(x86-64) ( =  2.1.28-27.el10) group(saslauth) ( =  ZyBzYXNsYXV0aCA3NgAA) user(saslauth) ( =  dSBzYXNsYXV0aCAtICJTYXNsYXV0aGQgdXNlciIgL3J1bi9zYXNsYXV0aGQgL3NiaW4vbm9sb2dpbgAA)"

URI_cyrus-sasl-gssapi = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cyrus-sasl-gssapi-2.1.28-27.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cyrus-sasl-gssapi = "rtld(GNU_HASH) ( ) libkrb5.so.3()(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libcom_err.so.2()(64bit) ( ) libgssapi_krb5.so.2()(64bit) ( ) libk5crypto.so.3()(64bit) ( ) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) ( ) libresolv.so.2()(64bit) ( ) libcrypt.so.2()(64bit) ( ) cyrus-sasl-lib(x86-64) ( =  2.1.28-27.el10)"
RPROVIDES:cyrus-sasl-gssapi = "libgssapiv2.so.3()(64bit) ( ) cyrus-sasl-gssapi ( =  2.1.28-27.el10) cyrus-sasl-gssapi(x86-64) ( =  2.1.28-27.el10)"

URI_cyrus-sasl-lib = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cyrus-sasl-lib-2.1.28-27.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cyrus-sasl-lib = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libresolv.so.2()(64bit) ( ) libcrypt.so.2()(64bit) ( ) libgdbm.so.6()(64bit) ( )"
RPROVIDES:cyrus-sasl-lib = "libsasl2.so.3()(64bit) ( ) libanonymous.so.3()(64bit) ( ) libsasldb.so.3()(64bit) ( ) cyrus-sasl-lib(x86-64) ( =  2.1.28-27.el10) cyrus-sasl-lib ( =  2.1.28-27.el10)"

URI_cyrus-sasl-plain = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cyrus-sasl-plain-2.1.28-27.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cyrus-sasl-plain = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libresolv.so.2()(64bit) ( ) libcrypt.so.2()(64bit) ( ) cyrus-sasl-lib(x86-64) ( =  2.1.28-27.el10)"
RPROVIDES:cyrus-sasl-plain = "liblogin.so.3()(64bit) ( ) libplain.so.3()(64bit) ( ) cyrus-sasl-plain ( =  2.1.28-27.el10) cyrus-sasl-plain(x86-64) ( =  2.1.28-27.el10)"

URI_cyrus-sasl-scram = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cyrus-sasl-scram-2.1.28-27.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cyrus-sasl-scram = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libresolv.so.2()(64bit) ( ) libcrypt.so.2()(64bit) ( ) cyrus-sasl-lib(x86-64) ( =  2.1.28-27.el10)"
RPROVIDES:cyrus-sasl-scram = "libscram.so.3()(64bit) ( ) cyrus-sasl-scram ( =  2.1.28-27.el10) cyrus-sasl-scram(x86-64) ( =  2.1.28-27.el10)"

URI_cyrus-sasl-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cyrus-sasl-devel-2.1.28-27.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cyrus-sasl-devel = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/pkg-config ( ) pkgconfig ( ) libgssapi_krb5.so.2()(64bit) ( ) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) ( ) libsasl2.so.3()(64bit) ( ) cyrus-sasl-lib(x86-64) ( =  2.1.28-27.el10) cyrus-sasl(x86-64) ( =  2.1.28-27.el10)"
RPROVIDES:cyrus-sasl-devel = "cyrus-sasl-devel ( =  2.1.28-27.el10) cyrus-sasl-devel(x86-64) ( =  2.1.28-27.el10) pkgconfig(libsasl2) ( =  2.1.28)"

URI_cyrus-sasl-gs2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cyrus-sasl-gs2-2.1.28-27.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cyrus-sasl-gs2 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libresolv.so.2()(64bit) ( ) libcrypt.so.2()(64bit) ( ) libkrb5.so.3()(64bit) ( ) libcom_err.so.2()(64bit) ( ) libgssapi_krb5.so.2()(64bit) ( ) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) ( ) libk5crypto.so.3()(64bit) ( ) cyrus-sasl-lib(x86-64) ( =  2.1.28-27.el10)"
RPROVIDES:cyrus-sasl-gs2 = "libgs2.so.3()(64bit) ( ) cyrus-sasl-gs2 ( =  2.1.28-27.el10) cyrus-sasl-gs2(x86-64) ( =  2.1.28-27.el10)"

URI_cyrus-sasl-ldap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cyrus-sasl-ldap-2.1.28-27.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cyrus-sasl-ldap = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libresolv.so.2()(64bit) ( ) libcrypt.so.2()(64bit) ( ) libldap.so.2()(64bit) ( ) libldap.so.2(OPENLDAP_2.200)(64bit) ( ) liblber.so.2()(64bit) ( ) liblber.so.2(OPENLDAP_2.200)(64bit) ( ) cyrus-sasl-lib(x86-64) ( =  2.1.28-27.el10)"
RPROVIDES:cyrus-sasl-ldap = "libldapdb.so.3()(64bit) ( ) cyrus-sasl-ldap ( =  2.1.28-27.el10) cyrus-sasl-ldap(x86-64) ( =  2.1.28-27.el10)"

URI_cyrus-sasl-md5 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cyrus-sasl-md5-2.1.28-27.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cyrus-sasl-md5 = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libresolv.so.2()(64bit) ( ) libcrypt.so.2()(64bit) ( ) cyrus-sasl-lib(x86-64) ( =  2.1.28-27.el10)"
RPROVIDES:cyrus-sasl-md5 = "libcrammd5.so.3()(64bit) ( ) libdigestmd5.so.3()(64bit) ( ) cyrus-sasl-md5 ( =  2.1.28-27.el10) cyrus-sasl-md5(x86-64) ( =  2.1.28-27.el10)"

URI_cyrus-sasl-sql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cyrus-sasl-sql-2.1.28-27.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cyrus-sasl-sql = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libresolv.so.2()(64bit) ( ) libcrypt.so.2()(64bit) ( ) libpq.so.5()(64bit) ( ) libpq.so.5(RHPG_9.6)(64bit) ( ) libmariadb.so.3()(64bit) ( ) libmariadb.so.3(libmysqlclient_18)(64bit) ( ) cyrus-sasl-lib(x86-64) ( =  2.1.28-27.el10)"
RPROVIDES:cyrus-sasl-sql = "libsql.so.3()(64bit) ( ) cyrus-sasl-sql ( =  2.1.28-27.el10) cyrus-sasl-sql(x86-64) ( =  2.1.28-27.el10)"
