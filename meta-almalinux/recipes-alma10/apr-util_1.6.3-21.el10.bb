
PN = "apr-util"
PE = "0"
PV = "1.6.3"
PR = "21.el10"
PACKAGES = "apr-util apr-util-devel apr-util-ldap apr-util-lmdb apr-util-mysql apr-util-odbc apr-util-openssl apr-util-pgsql apr-util-sqlite"


URI_apr-util = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apr-util-1.6.3-21.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:apr-util = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypt.so.2()(64bit) ( ) libuuid.so.1()(64bit) ( ) libexpat.so.1()(64bit) ( ) libcrypt.so.2(XCRYPT_2.0)(64bit) ( ) libapr-1.so.0()(64bit) ( )"
RPROVIDES:apr-util = "libaprutil-1.so.0()(64bit) ( ) apr-util(x86-64) ( =  1.6.3-21.el10) apr-util ( =  1.6.3-21.el10)"

URI_apr-util-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apr-util-devel-1.6.3-21.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:apr-util-devel = "/usr/bin/sh ( ) /usr/bin/pkg-config ( ) pkgconfig ( ) libaprutil-1.so.0()(64bit) ( ) apr-devel(x86-64) ( ) expat-devel(x86-64) ( ) pkgconfig(apr-1) ( ) openldap-devel(x86-64) ( ) apr-util(x86-64) ( =  1.6.3-21.el10)"
RPROVIDES:apr-util-devel = "apr-util-devel ( =  1.6.3-21.el10) apr-util-devel(x86-64) ( =  1.6.3-21.el10) pkgconfig(apr-util-1) ( =  1.6.3)"

URI_apr-util-ldap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apr-util-ldap-1.6.3-21.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:apr-util-ldap = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libldap.so.2()(64bit) ( ) libldap.so.2(OPENLDAP_2.200)(64bit) ( ) liblber.so.2()(64bit) ( ) apr-util(x86-64) ( =  1.6.3-21.el10)"
RPROVIDES:apr-util-ldap = "apr-util-ldap ( =  1.6.3-21.el10) apr-util-ldap(x86-64) ( =  1.6.3-21.el10)"

URI_apr-util-lmdb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apr-util-lmdb-1.6.3-21.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:apr-util-lmdb = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) liblmdb.so.0.0.0()(64bit) ( ) apr-util(x86-64) ( =  1.6.3-21.el10)"
RPROVIDES:apr-util-lmdb = "apr-util-lmdb(x86-64) ( =  1.6.3-21.el10) apr-util-1(dbm)(x86-64) ( =  1.6.3-21.el10) apr-util-lmdb ( =  1.6.3-21.el10)"

URI_apr-util-mysql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apr-util-mysql-1.6.3-21.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:apr-util-mysql = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libmariadb.so.3()(64bit) ( ) libmariadb.so.3(libmysqlclient_18)(64bit) ( ) apr-util(x86-64) ( =  1.6.3-21.el10)"
RPROVIDES:apr-util-mysql = "apr-util-mysql ( =  1.6.3-21.el10) apr-util-mysql(x86-64) ( =  1.6.3-21.el10)"

URI_apr-util-odbc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apr-util-odbc-1.6.3-21.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:apr-util-odbc = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libodbc.so.2()(64bit) ( ) apr-util(x86-64) ( =  1.6.3-21.el10)"
RPROVIDES:apr-util-odbc = "apr-util-odbc ( =  1.6.3-21.el10) apr-util-odbc(x86-64) ( =  1.6.3-21.el10)"

URI_apr-util-openssl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apr-util-openssl-1.6.3-21.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:apr-util-openssl = "rtld(GNU_HASH) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libssl.so.3()(64bit) ( ) apr-util(x86-64) ( =  1.6.3-21.el10)"
RPROVIDES:apr-util-openssl = "apr-util-openssl(x86-64) ( =  1.6.3-21.el10) apr-util-openssl ( =  1.6.3-21.el10)"

URI_apr-util-pgsql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apr-util-pgsql-1.6.3-21.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:apr-util-pgsql = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libpq.so.5()(64bit) ( ) libpq.so.5(RHPG_9.6)(64bit) ( ) apr-util(x86-64) ( =  1.6.3-21.el10)"
RPROVIDES:apr-util-pgsql = "apr-util-pgsql ( =  1.6.3-21.el10) apr-util-pgsql(x86-64) ( =  1.6.3-21.el10)"

URI_apr-util-sqlite = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apr-util-sqlite-1.6.3-21.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:apr-util-sqlite = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libsqlite3.so.0()(64bit) ( ) apr-util(x86-64) ( =  1.6.3-21.el10)"
RPROVIDES:apr-util-sqlite = "apr-util-sqlite ( =  1.6.3-21.el10) apr-util-sqlite(x86-64) ( =  1.6.3-21.el10)"
