
PN = "httpd"
PE = "0"
PV = "2.4.63"
PR = "1.el10_0.2"
PACKAGES = "httpd httpd-core httpd-devel httpd-filesystem httpd-manual httpd-tools mod_ldap mod_lua mod_proxy_html mod_session mod_ssl"


URI_httpd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/httpd-2.4.63-1.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:httpd = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libselinux.so.1()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libbrotlienc.so.1()(64bit) ( ) system-logos(httpd-logo-ng) ( ) httpd-core ( =  2.4.63-1.el10_0.2)"
RPROVIDES:httpd = "webserver ( ) config(httpd) ( =  2.4.63-1.el10_0.2) httpd ( =  2.4.63-1.el10_0.2) httpd(x86-64) ( =  2.4.63-1.el10_0.2)"

URI_httpd-core = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/httpd-core-2.4.63-1.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:httpd-core = "httpd-filesystem ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/sh ( ) libz.so.1()(64bit) ( ) libpcre2-8.so.0()(64bit) ( ) libapr-1.so.0()(64bit) ( ) libaprutil-1.so.0()(64bit) ( ) /etc/mime.types ( ) apr-util-1(dbm)(x86-64) ( ) httpd-filesystem ( =  2.4.63-1.el10_0.2) httpd-tools ( =  2.4.63-1.el10_0.2)"
RPROVIDES:httpd-core = "httpd-mmn ( =  20120211x8664) httpd-core ( =  2.4.63-1.el10_0.2) httpd-mmn ( =  20120211) config(httpd-core) ( =  2.4.63-1.el10_0.2) httpd-core(x86-64) ( =  2.4.63-1.el10_0.2) httpd-suexec ( =  2.4.63-1.el10_0.2) mod_dav ( =  2.4.63-1.el10_0.2) mod_proxy_uwsgi ( =  2.4.63-1.el10_0.2)"

URI_httpd-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/httpd-devel-2.4.63-1.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:httpd-devel = "/usr/bin/sh ( ) perl(strict) ( ) /usr/bin/perl ( ) pkgconfig ( ) libtool ( ) apr-devel ( ) apr-util-devel ( ) perl(:VERSION) ( >=  5.4.0) httpd-core ( =  2.4.63-1.el10_0.2)"
RPROVIDES:httpd-devel = "rpm_macro(_httpd_apxs) ( ) rpm_macro(_httpd_confdir) ( ) rpm_macro(_httpd_contentdir) ( ) rpm_macro(_httpd_mmn) ( ) rpm_macro(_httpd_modconfdir) ( ) rpm_macro(_httpd_moddir) ( ) rpm_macro(_httpd_requires) ( ) rpm_macro(_httpd_statedir) ( ) httpd-devel ( =  2.4.63-1.el10_0.2) httpd-devel(x86-64) ( =  2.4.63-1.el10_0.2)"

URI_httpd-filesystem = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/httpd-filesystem-2.4.63-1.el10_0.2.noarch.rpm;unpack=0"
RDEPENDS:httpd-filesystem = "/bin/sh ( ) shadow-utils ( )"
RPROVIDES:httpd-filesystem = "group(apache) ( ) httpd-filesystem ( =  2.4.63-1.el10_0.2) group(apache) ( =  ZyBhcGFjaGUgNDgA) user(apache) ( =  dSBhcGFjaGUgNDggIkFwYWNoZSIgL3Vzci9zaGFyZS9odHRwZCAvc2Jpbi9ub2xvZ2lu)"

URI_httpd-manual = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/httpd-manual-2.4.63-1.el10_0.2.noarch.rpm;unpack=0"
RDEPENDS:httpd-manual = "httpd-core ( =  2.4.63-1.el10_0.2)"
RPROVIDES:httpd-manual = "config(httpd-manual) ( =  2.4.63-1.el10_0.2) httpd-manual ( =  2.4.63-1.el10_0.2)"

URI_httpd-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/httpd-tools-2.4.63-1.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:httpd-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libcrypt.so.2()(64bit) ( ) libcrypt.so.2(XCRYPT_2.0)(64bit) ( ) libapr-1.so.0()(64bit) ( ) libaprutil-1.so.0()(64bit) ( )"
RPROVIDES:httpd-tools = "httpd-tools ( =  2.4.63-1.el10_0.2) httpd-tools(x86-64) ( =  2.4.63-1.el10_0.2)"

URI_mod_ldap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mod_ldap-2.4.63-1.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:mod_ldap = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libldap.so.2()(64bit) ( ) libldap.so.2(OPENLDAP_2.200)(64bit) ( ) liblber.so.2()(64bit) ( ) liblber.so.2(OPENLDAP_2.200)(64bit) ( ) apr-util-ldap ( ) httpd-mmn ( =  20120211x8664) httpd-core ( =  2.4.63-1.el10_0.2)"
RPROVIDES:mod_ldap = "config(mod_ldap) ( =  2.4.63-1.el10_0.2) mod_ldap ( =  2.4.63-1.el10_0.2) mod_ldap(x86-64) ( =  2.4.63-1.el10_0.2)"

URI_mod_lua = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mod_lua-2.4.63-1.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:mod_lua = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libcrypt.so.2()(64bit) ( ) libcrypt.so.2(XCRYPT_2.0)(64bit) ( ) liblua-5.4.so()(64bit) ( ) httpd-mmn ( =  20120211x8664) httpd-core ( =  2.4.63-1.el10_0.2)"
RPROVIDES:mod_lua = "config(mod_lua) ( =  2.4.63-1.el10_0.2) mod_lua ( =  2.4.63-1.el10_0.2) mod_lua(x86-64) ( =  2.4.63-1.el10_0.2)"

URI_mod_proxy_html = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mod_proxy_html-2.4.63-1.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:mod_proxy_html = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libxml2.so.2(LIBXML2_2.5.2)(64bit) ( ) httpd-mmn ( =  20120211x8664) httpd-core ( =  2.4.63-1.el10_0.2)"
RPROVIDES:mod_proxy_html = "config(mod_proxy_html) ( =  1:2.4.63-1.el10_0.2) mod_proxy_html ( =  1:2.4.63-1.el10_0.2) mod_proxy_html(x86-64) ( =  1:2.4.63-1.el10_0.2)"

URI_mod_session = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mod_session-2.4.63-1.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:mod_session = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) httpd-mmn ( =  20120211x8664) httpd-core ( =  2.4.63-1.el10_0.2)"
RPROVIDES:mod_session = "config(mod_session) ( =  2.4.63-1.el10_0.2) mod_session ( =  2.4.63-1.el10_0.2) mod_session(x86-64) ( =  2.4.63-1.el10_0.2)"

URI_mod_ssl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mod_ssl-2.4.63-1.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:mod_ssl = "httpd-filesystem ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/sh ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) /usr/bin/bash ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) /usr/bin/hostname ( ) httpd-mmn ( =  20120211x8664) httpd-core ( =  2.4.63-1.el10_0.2) sscg ( >=  3.0.3)"
RPROVIDES:mod_ssl = "config(mod_ssl) ( =  1:2.4.63-1.el10_0.2) mod_ssl ( =  1:2.4.63-1.el10_0.2) mod_ssl(x86-64) ( =  1:2.4.63-1.el10_0.2)"
