
inherit dnf-bridge

PN = "php"
PE = "0"
PV = "8.3.19"
PR = "1.el10_0"
PACKAGES = "php php-bcmath php-cli php-common php-dba php-dbg php-devel php-embedded php-enchant php-ffi php-fpm php-gd php-gmp php-intl php-ldap php-mbstring php-mysqlnd php-odbc php-opcache php-pdo php-pgsql php-process php-snmp php-soap php-xml"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/php-8.3.19-1.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_php = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_php}"
RDEPENDS:php = " \
 php-common \
"

URI_php-bcmath = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-bcmath-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_php-bcmath}"
RDEPENDS:php-bcmath = " \
 glibc \
 php-common \
"

URI_php-cli = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-cli-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_php-cli}"
RDEPENDS:php-cli = " \
 zlib-ng-compat \
 libxcrypt \
 openssl-libs \
 libxml2 \
 php-common \
 bash \
 pcre2 \
 glibc \
 libedit \
"

URI_php-common = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-common-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_php-common}"
RDEPENDS:php-common = " \
 tzdata \
 bzip2-libs \
 openssl-libs \
 libcurl \
 glibc \
"

URI_php-dba = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-dba-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_php-dba}"
RDEPENDS:php-dba = " \
 glibc \
 php-common \
 tokyocabinet \
 lmdb-libs \
"

URI_php-dbg = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-dbg-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_php-dbg}"
RDEPENDS:php-dbg = " \
 zlib-ng-compat \
 libxcrypt \
 openssl-libs \
 libxml2 \
 php-common \
 pcre2 \
 glibc \
 libedit \
"

URI_php-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-devel-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_php-devel}"
RDEPENDS:php-devel = " \
 libxml2-devel \
 libtool \
 autoconf \
 automake \
 zlib-ng-compat-devel \
 make \
 pcre2-devel \
 php-cli \
 openssl-devel \
 bash \
 gcc \
 gcc-c++ \
 krb5-devel \
"

URI_php-embedded = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-embedded-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_php-embedded}"
RDEPENDS:php-embedded = " \
 zlib-ng-compat \
 libxcrypt \
 openssl-libs \
 libxml2 \
 krb5-libs \
 php-common \
 libcom_err \
 pcre2 \
 glibc \
"

URI_php-enchant = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-enchant-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_php-enchant}"
RDEPENDS:php-enchant = " \
 glibc \
 php-common \
 enchant2 \
"

URI_php-ffi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-ffi-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_php-ffi}"
RDEPENDS:php-ffi = " \
 glibc \
 php-common \
 libffi \
"

URI_php-fpm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-fpm-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_php-fpm}"
RDEPENDS:php-fpm = " \
 libacl \
 systemd \
 zlib-ng-compat \
 systemd-libs \
 libxcrypt \
 httpd-filesystem \
 openssl-libs \
 libxml2 \
 php-common \
 bash \
 pcre2 \
 glibc \
 libselinux \
 nginx-filesystem \
"

URI_php-gd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-gd-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_php-gd}"
RDEPENDS:php-gd = " \
 glibc \
 gd \
 php-common \
"

URI_php-gmp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-gmp-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_php-gmp}"
RDEPENDS:php-gmp = " \
 glibc \
 gmp \
 php-common \
"

URI_php-intl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-intl-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_php-intl}"
RDEPENDS:php-intl = " \
 libgcc \
 php-common \
 libstdc++ \
 glibc \
 libicu \
"

URI_php-ldap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-ldap-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_php-ldap}"
RDEPENDS:php-ldap = " \
 glibc \
 cyrus-sasl-lib \
 php-common \
 openldap \
"

URI_php-mbstring = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-mbstring-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_php-mbstring}"
RDEPENDS:php-mbstring = " \
 glibc \
 oniguruma \
 php-common \
"

URI_php-mysqlnd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-mysqlnd-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_php-mysqlnd}"
RDEPENDS:php-mysqlnd = " \
 glibc \
 php-pdo \
"

URI_php-odbc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-odbc-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_php-odbc}"
RDEPENDS:php-odbc = " \
 glibc \
 php-pdo \
 unixODBC \
"

URI_php-opcache = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-opcache-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_php-opcache}"
RDEPENDS:php-opcache = " \
 glibc \
 capstone \
 libgcc \
 php-common \
"

URI_php-pdo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-pdo-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_php-pdo}"
RDEPENDS:php-pdo = " \
 glibc \
 sqlite-libs \
 php-common \
"

URI_php-pgsql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-pgsql-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_php-pgsql}"
RDEPENDS:php-pgsql = " \
 glibc \
 php-pdo \
 libpq \
"

URI_php-process = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-process-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_php-process}"
RDEPENDS:php-process = " \
 glibc \
 php-common \
"

URI_php-snmp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-snmp-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_php-snmp}"
RDEPENDS:php-snmp = " \
 net-snmp \
 net-snmp-libs \
 openssl-libs \
 php-common \
 glibc \
"

URI_php-soap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-soap-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_php-soap}"
RDEPENDS:php-soap = " \
 glibc \
 php-common \
 libxml2 \
"

URI_php-xml = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/php-xml-8.3.19-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_php-xml}"
RDEPENDS:php-xml = " \
 glibc \
 php-common \
 libxslt \
 libxml2 \
"
