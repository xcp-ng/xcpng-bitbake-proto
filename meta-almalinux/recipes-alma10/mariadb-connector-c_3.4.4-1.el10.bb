
PN = "mariadb-connector-c"
PE = "0"
PV = "3.4.4"
PR = "1.el10"
PACKAGES = "mariadb-connector-c mariadb-connector-c-config mariadb-connector-c-devel mariadb-connector-c-doc mariadb-connector-c-test"


URI_mariadb-connector-c = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/mariadb-connector-c-3.4.4-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mariadb-connector-c = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libz.so.1()(64bit) ( ) libgssapi_krb5.so.2()(64bit) ( ) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libzstd.so.1()(64bit) ( ) libcurl.so.4()(64bit) ( ) /etc/my.cnf ( )"
RPROVIDES:mariadb-connector-c = "libmariadb.so.3()(64bit) ( ) libmariadb.so.3(libmysqlclient_18)(64bit) ( ) libmariadb.so.3(libmariadb_3)(64bit) ( ) libmariadb.so.3(libmariadb_3_3_5)(64bit) ( ) libmariadb.so.3(libmariadbclient_18)(64bit) ( ) mariadb-connector-c ( =  3.4.4-1.el10) mariadb-connector-c(x86-64) ( =  3.4.4-1.el10)"

URI_mariadb-connector-c-config = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/mariadb-connector-c-config-3.4.4-1.el10.noarch.rpm;unpack=0"
RDEPENDS:mariadb-connector-c-config = ""
RPROVIDES:mariadb-connector-c-config = "config(mariadb-connector-c-config) ( =  3.4.4-1.el10) mariadb-connector-c-config ( =  3.4.4-1.el10)"

URI_mariadb-connector-c-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mariadb-connector-c-devel-3.4.4-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mariadb-connector-c-devel = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/pkg-config ( ) openssl-devel ( ) libmariadb.so.3()(64bit) ( ) zlib-devel ( ) mariadb-connector-c ( =  3.4.4-1.el10)"
RPROVIDES:mariadb-connector-c-devel = "mariadb-connector-c-devel ( =  3.4.4-1.el10) mariadb-connector-c-devel(x86-64) ( =  3.4.4-1.el10) pkgconfig(libmariadb) ( =  3.4.4)"

URI_mariadb-connector-c-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mariadb-connector-c-doc-3.4.4-1.el10.noarch.rpm;unpack=0"
RDEPENDS:mariadb-connector-c-doc = "mariadb-connector-c ( =  3.4.4-1.el10)"
RPROVIDES:mariadb-connector-c-doc = "mariadb-connector-c-doc ( =  3.4.4-1.el10)"

URI_mariadb-connector-c-test = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mariadb-connector-c-test-3.4.4-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mariadb-connector-c-test = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libz.so.1()(64bit) ( ) libcrypto.so.3()(64bit) ( ) libssl.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) cmake ( ) mariadb-connector-c ( =  3.4.4-1.el10)"
RPROVIDES:mariadb-connector-c-test = "libcctap.so()(64bit) ( ) mariadb-connector-c-test ( =  3.4.4-1.el10) mariadb-connector-c-test(x86-64) ( =  3.4.4-1.el10)"
