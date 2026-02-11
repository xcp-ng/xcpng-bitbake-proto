
PN = "php"
PE = "0"
PV = "8.3.19"
PR = "1.el10_0"
PACKAGES = "php php-bcmath php-cli php-common php-dba php-dbg php-devel php-embedded php-enchant php-ffi php-fpm php-gd php-gmp php-intl php-ldap php-mbstring php-mysqlnd php-odbc php-opcache php-pdo php-pgsql php-process php-snmp php-soap php-xml"


URI_php = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:php = "php-common(x86-64) ( =  8.3.19-1.el10_0)"
RPROVIDES:php = "php ( =  8.3.19-1.el10_0) php(x86-64) ( =  8.3.19-1.el10_0)"

URI_php-bcmath = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-bcmath-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:php-bcmath = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) php-common(x86-64) ( =  8.3.19-1.el10_0)"
RPROVIDES:php-bcmath = "config(php-bcmath) ( =  8.3.19-1.el10_0) php-bcmath ( =  8.3.19-1.el10_0) php-bcmath(x86-64) ( =  8.3.19-1.el10_0)"

URI_php-cli = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-cli-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:php-cli = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) /usr/bin/sh ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libz.so.1()(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libm.so.6(GLIBC_2.35)(64bit) ( ) libcrypt.so.2()(64bit) ( ) libpcre2-8.so.0()(64bit) ( ) libcrypt.so.2(XCRYPT_2.0)(64bit) ( ) libedit.so.0()(64bit) ( ) libcrypto.so.3(OPENSSL_3.2.0)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.11)(64bit) ( ) php-common(x86-64) ( =  8.3.19-1.el10_0)"
RPROVIDES:php-cli = "php-pcntl ( ) php-pcntl(x86-64) ( ) php-readline ( ) php-readline(x86-64) ( ) php-cli(x86-64) ( =  8.3.19-1.el10_0) php-cgi ( =  8.3.19-1.el10_0) php-cgi(x86-64) ( =  8.3.19-1.el10_0) php-cli ( =  8.3.19-1.el10_0)"

URI_php-common = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-common-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:php-common = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libcurl.so.4()(64bit) ( ) libbz2.so.1()(64bit) ( ) tzdata ( )"
RPROVIDES:php-common = "php-bz2 ( ) php-ftp ( ) php-pcre ( ) php-tokenizer ( ) php-zlib ( ) bundled(timelib) ( ) php-bz2(x86-64) ( ) php-calendar ( ) php-calendar(x86-64) ( ) php-ctype ( ) php-ctype(x86-64) ( ) php-curl ( ) php-curl(x86-64) ( ) php-date ( ) php-date(x86-64) ( ) php-exif ( ) php-exif(x86-64) ( ) php-fileinfo ( ) php-fileinfo(x86-64) ( ) php-filter ( ) php-filter(x86-64) ( ) php-ftp(x86-64) ( ) php-gettext ( ) php-gettext(x86-64) ( ) php-hash ( ) php-hash(x86-64) ( ) php-iconv ( ) php-iconv(x86-64) ( ) php-libxml ( ) php-libxml(x86-64) ( ) php-openssl ( ) php-openssl(x86-64) ( ) php-pcre(x86-64) ( ) php-phar ( ) php-phar(x86-64) ( ) php-random ( ) php-random(x86-64) ( ) php-reflection ( ) php-reflection(x86-64) ( ) php-session ( ) php-session(x86-64) ( ) php-sockets ( ) php-sockets(x86-64) ( ) php-spl ( ) php-spl(x86-64) ( ) php-tokenizer(x86-64) ( ) php-zlib(x86-64) ( ) php-common(x86-64) ( =  8.3.19-1.el10_0) php(api) ( =  20230831-64) php(zend-abi) ( =  20230831-64) bundled(libmagic) ( =  5.43) config(php-common) ( =  8.3.19-1.el10_0) php(language) ( =  8.3.19) php(language)(x86-64) ( =  8.3.19) php-common ( =  8.3.19-1.el10_0) php-core ( =  8.3.19) php-core(x86-64) ( =  8.3.19) php-json ( =  8.3.19) php-json(x86-64) ( =  8.3.19) php-mhash ( =  8.3.19) php-mhash(x86-64) ( =  8.3.19) php-standard ( =  8.3.19) php-standard(x86-64) ( =  8.3.19)"

URI_php-dba = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-dba-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:php-dba = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) liblmdb.so.0.0.0()(64bit) ( ) libtokyocabinet.so.9()(64bit) ( ) php-common(x86-64) ( =  8.3.19-1.el10_0)"
RPROVIDES:php-dba = "config(php-dba) ( =  8.3.19-1.el10_0) php-dba ( =  8.3.19-1.el10_0) php-dba(x86-64) ( =  8.3.19-1.el10_0)"

URI_php-dbg = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-dbg-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:php-dbg = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libz.so.1()(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libm.so.6(GLIBC_2.35)(64bit) ( ) libcrypt.so.2()(64bit) ( ) libpcre2-8.so.0()(64bit) ( ) libcrypt.so.2(XCRYPT_2.0)(64bit) ( ) libedit.so.0()(64bit) ( ) libcrypto.so.3(OPENSSL_3.2.0)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.11)(64bit) ( ) php-common(x86-64) ( =  8.3.19-1.el10_0)"
RPROVIDES:php-dbg = "php-dbg ( =  8.3.19-1.el10_0) php-dbg(x86-64) ( =  8.3.19-1.el10_0)"

URI_php-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-devel-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:php-devel = "/usr/bin/sh ( ) gcc ( ) make ( ) zlib-devel(x86-64) ( ) gcc-c++ ( ) libtool ( ) autoconf ( ) automake ( ) libxml2-devel(x86-64) ( ) krb5-devel(x86-64) ( ) pcre2-devel(x86-64) ( ) php-cli(x86-64) ( =  8.3.19-1.el10_0) openssl-devel(x86-64) ( >=  1.0.2)"
RPROVIDES:php-devel = "rpm_macro(pecl_xmldir) ( ) rpm_macro(php_core_api) ( ) rpm_macro(php_extdir) ( ) rpm_macro(php_incldir) ( ) rpm_macro(php_inidir) ( ) rpm_macro(php_pdo_api) ( ) rpm_macro(php_version) ( ) rpm_macro(php_zend_api) ( ) php-devel ( =  8.3.19-1.el10_0) php-devel(x86-64) ( =  8.3.19-1.el10_0)"

URI_php-embedded = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-embedded-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:php-embedded = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libz.so.1()(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libm.so.6(GLIBC_2.35)(64bit) ( ) libcrypt.so.2()(64bit) ( ) libkrb5.so.3()(64bit) ( ) libpcre2-8.so.0()(64bit) ( ) libcom_err.so.2()(64bit) ( ) libgssapi_krb5.so.2()(64bit) ( ) libcrypt.so.2(XCRYPT_2.0)(64bit) ( ) libk5crypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.2.0)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.11)(64bit) ( ) php-common(x86-64) ( =  8.3.19-1.el10_0)"
RPROVIDES:php-embedded = "libphp-8.3.so()(64bit) ( ) php-embedded ( =  8.3.19-1.el10_0) php-embedded(x86-64) ( =  8.3.19-1.el10_0) php-embedded-devel ( =  8.3.19-1.el10_0) php-embedded-devel(x86-64) ( =  8.3.19-1.el10_0)"

URI_php-enchant = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-enchant-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:php-enchant = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libenchant-2.so.2()(64bit) ( ) php-common(x86-64) ( =  8.3.19-1.el10_0)"
RPROVIDES:php-enchant = "config(php-enchant) ( =  8.3.19-1.el10_0) php-enchant ( =  8.3.19-1.el10_0) php-enchant(x86-64) ( =  8.3.19-1.el10_0)"

URI_php-ffi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-ffi-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:php-ffi = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libffi.so.8()(64bit) ( ) libffi.so.8(LIBFFI_BASE_8.0)(64bit) ( ) libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) ( ) php-common(x86-64) ( =  8.3.19-1.el10_0)"
RPROVIDES:php-ffi = "config(php-ffi) ( =  8.3.19-1.el10_0) php-ffi ( =  8.3.19-1.el10_0) php-ffi(x86-64) ( =  8.3.19-1.el10_0)"

URI_php-fpm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-fpm-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:php-fpm = "/bin/sh ( ) systemd ( ) httpd-filesystem ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libz.so.1()(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libxml2.so.2()(64bit) ( ) libsystemd.so.0()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libm.so.6(GLIBC_2.35)(64bit) ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libcrypt.so.2()(64bit) ( ) libpcre2-8.so.0()(64bit) ( ) libcrypt.so.2(XCRYPT_2.0)(64bit) ( ) libacl.so.1()(64bit) ( ) libacl.so.1(ACL_1.0)(64bit) ( ) libcrypto.so.3(OPENSSL_3.2.0)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.11)(64bit) ( ) nginx-filesystem ( ) php-common(x86-64) ( =  8.3.19-1.el10_0) httpd-filesystem ( >=  2.4.10)"
RPROVIDES:php-fpm = "php(httpd) ( ) php-fpm(x86-64) ( =  8.3.19-1.el10_0) config(php-fpm) ( =  8.3.19-1.el10_0) php-fpm ( =  8.3.19-1.el10_0)"

URI_php-gd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-gd-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:php-gd = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libgd.so.3()(64bit) ( ) php-common(x86-64) ( =  8.3.19-1.el10_0)"
RPROVIDES:php-gd = "config(php-gd) ( =  8.3.19-1.el10_0) php-gd ( =  8.3.19-1.el10_0) php-gd(x86-64) ( =  8.3.19-1.el10_0)"

URI_php-gmp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-gmp-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:php-gmp = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libgmp.so.10()(64bit) ( ) php-common(x86-64) ( =  8.3.19-1.el10_0)"
RPROVIDES:php-gmp = "config(php-gmp) ( =  8.3.19-1.el10_0) php-gmp ( =  8.3.19-1.el10_0) php-gmp(x86-64) ( =  8.3.19-1.el10_0)"

URI_php-intl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-intl-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:php-intl = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libicuuc.so.74()(64bit) ( ) libicui18n.so.74()(64bit) ( ) libicudata.so.74()(64bit) ( ) libicuio.so.74()(64bit) ( ) php-common(x86-64) ( =  8.3.19-1.el10_0)"
RPROVIDES:php-intl = "config(php-intl) ( =  8.3.19-1.el10_0) php-intl ( =  8.3.19-1.el10_0) php-intl(x86-64) ( =  8.3.19-1.el10_0)"

URI_php-ldap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-ldap-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:php-ldap = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libldap.so.2()(64bit) ( ) libldap.so.2(OPENLDAP_2.200)(64bit) ( ) liblber.so.2()(64bit) ( ) libsasl2.so.3()(64bit) ( ) liblber.so.2(OPENLDAP_2.200)(64bit) ( ) php-common(x86-64) ( =  8.3.19-1.el10_0)"
RPROVIDES:php-ldap = "config(php-ldap) ( =  8.3.19-1.el10_0) php-ldap ( =  8.3.19-1.el10_0) php-ldap(x86-64) ( =  8.3.19-1.el10_0)"

URI_php-mbstring = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-mbstring-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:php-mbstring = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libonig.so.5()(64bit) ( ) php-common(x86-64) ( =  8.3.19-1.el10_0)"
RPROVIDES:php-mbstring = "php-mbstring(x86-64) ( =  8.3.19-1.el10_0) bundled(libmbfl) ( =  1.3.2) config(php-mbstring) ( =  8.3.19-1.el10_0) php-mbstring ( =  8.3.19-1.el10_0)"

URI_php-mysqlnd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-mysqlnd-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:php-mysqlnd = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) php-pdo(x86-64) ( =  8.3.19-1.el10_0)"
RPROVIDES:php-mysqlnd = "php_database ( ) php-pdo_mysql ( ) php-pdo_mysql(x86-64) ( ) config(php-mysqlnd) ( =  8.3.19-1.el10_0) php-mysqli ( =  8.3.19-1.el10_0) php-mysqli(x86-64) ( =  8.3.19-1.el10_0) php-mysqlnd ( =  8.3.19-1.el10_0) php-mysqlnd(x86-64) ( =  8.3.19-1.el10_0)"

URI_php-odbc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-odbc-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:php-odbc = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libodbc.so.2()(64bit) ( ) php-pdo(x86-64) ( =  8.3.19-1.el10_0)"
RPROVIDES:php-odbc = "php_database ( ) php-pdo_odbc ( ) php-pdo_odbc(x86-64) ( ) config(php-odbc) ( =  8.3.19-1.el10_0) php-odbc ( =  8.3.19-1.el10_0) php-odbc(x86-64) ( =  8.3.19-1.el10_0)"

URI_php-opcache = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-opcache-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:php-opcache = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.3)(64bit) ( ) libcapstone.so.5()(64bit) ( ) php-common(x86-64) ( =  8.3.19-1.el10_0)"
RPROVIDES:php-opcache = "php-opcache(x86-64) ( =  8.3.19-1.el10_0) config(php-opcache) ( =  8.3.19-1.el10_0) php-opcache ( =  8.3.19-1.el10_0) php-pecl(opcache) ( =  8.3.19) php-pecl(opcache)(x86-64) ( =  8.3.19) php-pecl-zendopcache ( =  8.3.19) php-pecl-zendopcache(x86-64) ( =  8.3.19)"

URI_php-pdo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-pdo-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:php-pdo = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libsqlite3.so.0()(64bit) ( ) php-common(x86-64) ( =  8.3.19-1.el10_0)"
RPROVIDES:php-pdo = "php-pdo_sqlite ( ) php-pdo_sqlite(x86-64) ( ) php-sqlite3 ( ) php-sqlite3(x86-64) ( ) php-pdo(x86-64) ( =  8.3.19-1.el10_0) config(php-pdo) ( =  8.3.19-1.el10_0) php(pdo-abi) ( =  20170320-64) php-pdo ( =  8.3.19-1.el10_0) php-pdo-abi ( =  20170320-64)"

URI_php-pgsql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-pgsql-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:php-pgsql = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libpq.so.5()(64bit) ( ) libpq.so.5(RHPG_9.6)(64bit) ( ) libpq.so.5(RHPG_14)(64bit) ( ) php-pdo(x86-64) ( =  8.3.19-1.el10_0)"
RPROVIDES:php-pgsql = "php_database ( ) php-pdo_pgsql ( ) php-pdo_pgsql(x86-64) ( ) config(php-pgsql) ( =  8.3.19-1.el10_0) php-pgsql ( =  8.3.19-1.el10_0) php-pgsql(x86-64) ( =  8.3.19-1.el10_0)"

URI_php-process = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-process-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:php-process = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.33)(64bit) ( ) php-common(x86-64) ( =  8.3.19-1.el10_0)"
RPROVIDES:php-process = "php-posix ( ) php-posix(x86-64) ( ) php-shmop ( ) php-shmop(x86-64) ( ) php-sysvmsg ( ) php-sysvmsg(x86-64) ( ) php-sysvsem ( ) php-sysvsem(x86-64) ( ) php-sysvshm ( ) php-sysvshm(x86-64) ( ) config(php-process) ( =  8.3.19-1.el10_0) php-process ( =  8.3.19-1.el10_0) php-process(x86-64) ( =  8.3.19-1.el10_0)"

URI_php-snmp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-snmp-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:php-snmp = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libcrypto.so.3()(64bit) ( ) libssl.so.3()(64bit) ( ) libnetsnmp.so.40()(64bit) ( ) net-snmp ( ) php-common(x86-64) ( =  8.3.19-1.el10_0)"
RPROVIDES:php-snmp = "config(php-snmp) ( =  8.3.19-1.el10_0) php-snmp ( =  8.3.19-1.el10_0) php-snmp(x86-64) ( =  8.3.19-1.el10_0)"

URI_php-soap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-soap-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:php-soap = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libxml2.so.2(LIBXML2_2.5.7)(64bit) ( ) php-common(x86-64) ( =  8.3.19-1.el10_0)"
RPROVIDES:php-soap = "config(php-soap) ( =  8.3.19-1.el10_0) php-soap ( =  8.3.19-1.el10_0) php-soap(x86-64) ( =  8.3.19-1.el10_0)"

URI_php-xml = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-xml-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:php-xml = "rtld(GNU_HASH) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libc.so.6(GLIBC_2.33)(64bit) ( ) libxslt.so.1()(64bit) ( ) libxml2.so.2(LIBXML2_2.6.5)(64bit) ( ) libxslt.so.1(LIBXML2_1.0.11)(64bit) ( ) libxml2.so.2(LIBXML2_2.5.2)(64bit) ( ) libxslt.so.1(LIBXML2_1.0.18)(64bit) ( ) libxml2.so.2(LIBXML2_2.5.8)(64bit) ( ) libxslt.so.1(LIBXML2_1.0.22)(64bit) ( ) libexslt.so.0()(64bit) ( ) libxml2.so.2(LIBXML2_2.5.0)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.17)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.3)(64bit) ( ) libxml2.so.2(LIBXML2_2.9.0)(64bit) ( ) libxml2.so.2(LIBXML2_2.5.7)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.23)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.8)(64bit) ( ) libxml2.so.2(LIBXML2_2.5.9)(64bit) ( ) libxslt.so.1(LIBXML2_1.0.24)(64bit) ( ) libxml2.so.2(LIBXML2_2.5.4)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.14)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.20)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.6)(64bit) ( ) libxslt.so.1(LIBXML2_1.0.13)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.28)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.7)(64bit) ( ) php-common(x86-64) ( =  8.3.19-1.el10_0)"
RPROVIDES:php-xml = "php-dom ( ) php-dom(x86-64) ( ) php-domxml ( ) php-domxml(x86-64) ( ) php-simplexml ( ) php-simplexml(x86-64) ( ) php-xmlreader ( ) php-xmlreader(x86-64) ( ) php-xmlwriter ( ) php-xmlwriter(x86-64) ( ) php-xsl ( ) php-xsl(x86-64) ( ) php-xml(x86-64) ( =  8.3.19-1.el10_0) config(php-xml) ( =  8.3.19-1.el10_0) php-xml ( =  8.3.19-1.el10_0)"
