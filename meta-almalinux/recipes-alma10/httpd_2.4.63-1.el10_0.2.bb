
PN = "httpd"
PE = "0"
PV = "2.4.63"
PR = "1.el10_0.2"
PACKAGES = "httpd httpd-core httpd-devel httpd-filesystem httpd-manual httpd-tools mod_ldap mod_lua mod_proxy_html mod_session mod_ssl"


URI_httpd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/httpd-2.4.63-1.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:httpd = "
 systemd
 systemd-libs
 httpd-core
 libbrotli
 bash
 glibc
 libselinux
 almalinux-logos-httpd
"

URI_httpd-core = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/httpd-core-2.4.63-1.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:httpd-core = "
 zlib-ng-compat
 httpd-filesystem
 apr
 mailcap
 apr-util
 httpd-tools
 apr-util-lmdb
 bash
 pcre2
 glibc
"

URI_httpd-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/httpd-devel-2.4.63-1.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:httpd-devel = "
 libtool
 perl-libs
 httpd-core
 pkgconf-pkg-config
 apr-devel
 apr-util-devel
 bash
 perl-interpreter
"

URI_httpd-filesystem = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/httpd-filesystem-2.4.63-1.el10_0.2.noarch.rpm;unpack=0"
RDEPENDS:httpd-filesystem = "
 shadow-utils
 bash
"

URI_httpd-manual = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/httpd-manual-2.4.63-1.el10_0.2.noarch.rpm;unpack=0"
RDEPENDS:httpd-manual = "
 httpd-core
"

URI_httpd-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/httpd-tools-2.4.63-1.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:httpd-tools = "
 libxcrypt
 openssl-libs
 apr
 apr-util
 glibc
"

URI_mod_ldap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mod_ldap-2.4.63-1.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:mod_ldap = "
 glibc
 apr-util-ldap
 openldap
 httpd-core
"

URI_mod_lua = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mod_lua-2.4.63-1.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:mod_lua = "
 glibc
 libxcrypt
 lua-libs
 httpd-core
"

URI_mod_proxy_html = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mod_proxy_html-2.4.63-1.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:mod_proxy_html = "
 glibc
 libxml2
 httpd-core
"

URI_mod_session = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mod_session-2.4.63-1.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:mod_session = "
 glibc
 httpd-core
"

URI_mod_ssl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mod_ssl-2.4.63-1.el10_0.2.x86_64_v2.rpm;unpack=0"
RDEPENDS:mod_ssl = "
 sscg
 httpd-core
 httpd-filesystem
 openssl-libs
 hostname
 bash
 glibc
"
