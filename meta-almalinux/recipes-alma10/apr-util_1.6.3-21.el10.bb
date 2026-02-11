
PN = "apr-util"
PE = "0"
PV = "1.6.3"
PR = "21.el10"
PACKAGES = "apr-util apr-util-devel apr-util-ldap apr-util-lmdb apr-util-mysql apr-util-odbc apr-util-openssl apr-util-pgsql apr-util-sqlite"


URI_apr-util = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apr-util-1.6.3-21.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:apr-util = "
 libuuid
 libxcrypt
 apr
 expat
 glibc
"

URI_apr-util-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apr-util-devel-1.6.3-21.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:apr-util-devel = "
 openldap-devel
 apr-devel
 pkgconf-pkg-config
 apr-util
 expat-devel
 bash
"

URI_apr-util-ldap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apr-util-ldap-1.6.3-21.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:apr-util-ldap = "
 glibc
 openldap
 apr-util
"

URI_apr-util-lmdb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apr-util-lmdb-1.6.3-21.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:apr-util-lmdb = "
 glibc
 lmdb-libs
 apr-util
"

URI_apr-util-mysql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apr-util-mysql-1.6.3-21.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:apr-util-mysql = "
 glibc
 mariadb-connector-c
 apr-util
"

URI_apr-util-odbc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apr-util-odbc-1.6.3-21.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:apr-util-odbc = "
 glibc
 unixODBC
 apr-util
"

URI_apr-util-openssl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apr-util-openssl-1.6.3-21.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:apr-util-openssl = "
 glibc
 openssl-libs
 apr-util
"

URI_apr-util-pgsql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apr-util-pgsql-1.6.3-21.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:apr-util-pgsql = "
 glibc
 apr-util
 libpq
"

URI_apr-util-sqlite = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/apr-util-sqlite-1.6.3-21.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:apr-util-sqlite = "
 glibc
 sqlite-libs
 apr-util
"
