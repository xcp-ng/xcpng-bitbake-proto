
PN = "postfix"
PE = "2"
PV = "3.8.5"
PR = "8.el10"
PACKAGES = "postfix postfix-cdb postfix-ldap postfix-lmdb postfix-mysql postfix-pcre postfix-perl-scripts postfix-pgsql postfix-sqlite"


URI_postfix = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postfix-3.8.5-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:postfix = " \
 postfix-lmdb \
 systemd \
 openssl \
 diffutils \
 openssl-libs \
 hostname \
 policycoreutils \
 libicu \
 cyrus-sasl-lib \
 bash \
 glibc \
 alternatives \
 findutils \
"

URI_postfix-cdb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postfix-cdb-3.8.5-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:postfix-cdb = " \
 glibc \
 tinycdb \
 postfix \
"

URI_postfix-ldap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postfix-ldap-3.8.5-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:postfix-ldap = " \
 glibc \
 postfix \
 openldap \
"

URI_postfix-lmdb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postfix-lmdb-3.8.5-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:postfix-lmdb = " \
 glibc \
 postfix \
 lmdb-libs \
"

URI_postfix-mysql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postfix-mysql-3.8.5-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:postfix-mysql = " \
 glibc \
 mariadb-connector-c \
 postfix \
"

URI_postfix-pcre = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postfix-pcre-3.8.5-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:postfix-pcre = " \
 glibc \
 pcre2 \
 postfix \
"

URI_postfix-perl-scripts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postfix-perl-scripts-3.8.5-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:postfix-perl-scripts = " \
 perl-libs \
 perl-vars \
 perl-IO \
 perl-locale \
 perl-Getopt-Long \
 perl-Getopt-Std \
 postfix \
 perl-File-Find \
 perl-interpreter \
 perl-Date-Calc \
"

URI_postfix-pgsql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postfix-pgsql-3.8.5-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:postfix-pgsql = " \
 glibc \
 postfix \
 libpq \
"

URI_postfix-sqlite = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/postfix-sqlite-3.8.5-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:postfix-sqlite = " \
 glibc \
 sqlite-libs \
 postfix \
"
