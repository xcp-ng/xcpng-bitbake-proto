
inherit dnf-bridge

PN = "dovecot"
PE = "1"
PV = "2.3.21"
PR = "16.el10"
PACKAGES = "dovecot dovecot-mysql dovecot-pgsql dovecot-pigeonhole dovecot-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/dovecot-2.3.21-16.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_dovecot = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dovecot-2.3.21-16.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dovecot}"
RDEPENDS:dovecot = " \
 systemd \
 systemd-libs \
 krb5-libs \
 libcap \
 libcom_err \
 openldap \
 xz-libs \
 shadow-utils \
 zlib-ng-compat \
 libxcrypt \
 openssl \
 openssl-libs \
 libzstd \
 sqlite-libs \
 pam-libs \
 bash \
 expat \
 libicu \
 bzip2-libs \
 lz4-libs \
 glibc \
"

URI_dovecot-mysql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dovecot-mysql-2.3.21-16.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dovecot-mysql}"
RDEPENDS:dovecot-mysql = " \
 glibc \
 mariadb-connector-c \
 dovecot \
"

URI_dovecot-pgsql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dovecot-pgsql-2.3.21-16.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dovecot-pgsql}"
RDEPENDS:dovecot-pgsql = " \
 glibc \
 libpq \
 dovecot \
"

URI_dovecot-pigeonhole = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dovecot-pigeonhole-2.3.21-16.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dovecot-pigeonhole}"
RDEPENDS:dovecot-pigeonhole = " \
 glibc \
 dovecot \
"

URI_dovecot-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/dovecot-devel-2.3.21-16.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dovecot-devel}"
RDEPENDS:dovecot-devel = " \
 dovecot \
"
