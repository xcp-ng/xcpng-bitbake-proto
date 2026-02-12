
inherit dnf-bridge

PN = "mariadb10.11"
PE = "3"
PV = "10.11.11"
PR = "1.el10"
PACKAGES = "mariadb mariadb-backup mariadb-client-utils mariadb-common mariadb-devel mariadb-embedded mariadb-embedded-devel mariadb-errmsg mariadb-gssapi-server mariadb-oqgraph-engine mariadb-pam mariadb-server mariadb-server-galera mariadb-server-utils mariadb-test"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/mariadb10.11-10.11.11-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_mariadb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mariadb-10.11.11-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mariadb}"
RDEPENDS:mariadb = " \
 zlib-ng-compat \
 mariadb-common \
 libgcc \
 openssl-libs \
 grep \
 libstdc++ \
 bash \
 ncurses-libs \
 mariadb-connector-c \
 glibc \
 coreutils \
 libedit \
"

URI_mariadb-backup = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mariadb-backup-10.11.11-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mariadb-backup}"
RDEPENDS:mariadb-backup = " \
 zlib-ng-compat \
 libaio \
 systemd-libs \
 libxcrypt \
 openssl-libs \
 libgcc \
 mariadb-server \
 libstdc++ \
 pcre2 \
 glibc \
"

URI_mariadb-client-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mariadb-client-utils-10.11.11-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mariadb-client-utils}"
RDEPENDS:mariadb-client-utils = " \
 mariadb \
 perl-interpreter \
 perl-Fcntl \
 perl-Getopt-Long \
 perl-IPC-Open3 \
 perl-Sys-Hostname \
 perl-DBI \
 perl-Exporter \
 perl-File-Temp \
"

URI_mariadb-common = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mariadb-common-10.11.11-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_mariadb-common}"
RDEPENDS:mariadb-common = " \
 mariadb-connector-c-config \
"

URI_mariadb-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mariadb-devel-10.11.11-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mariadb-devel}"
RDEPENDS:mariadb-devel = " \
 mariadb-connector-c-devel \
 openssl-devel \
 pkgconf-pkg-config \
"

URI_mariadb-embedded = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mariadb-embedded-10.11.11-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mariadb-embedded}"
RDEPENDS:mariadb-embedded = " \
 zlib-ng-compat \
 libaio \
 mariadb-common \
 libxcrypt \
 openssl-libs \
 libgcc \
 mariadb-errmsg \
 libstdc++ \
 pcre2 \
 glibc \
"

URI_mariadb-embedded-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mariadb-embedded-devel-10.11.11-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mariadb-embedded-devel}"
RDEPENDS:mariadb-embedded-devel = " \
 mariadb-devel \
 mariadb-embedded \
 libaio-devel \
"

URI_mariadb-errmsg = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mariadb-errmsg-10.11.11-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_mariadb-errmsg}"
RDEPENDS:mariadb-errmsg = " \
 mariadb-common \
"

URI_mariadb-gssapi-server = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mariadb-gssapi-server-10.11.11-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mariadb-gssapi-server}"
RDEPENDS:mariadb-gssapi-server = " \
 glibc \
 krb5-libs \
 mariadb-server \
"

URI_mariadb-oqgraph-engine = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mariadb-oqgraph-engine-10.11.11-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mariadb-oqgraph-engine}"
RDEPENDS:mariadb-oqgraph-engine = " \
 libgcc \
 mariadb-server \
 libstdc++ \
 glibc \
 Judy \
"

URI_mariadb-pam = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mariadb-pam-10.11.11-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mariadb-pam}"
RDEPENDS:mariadb-pam = " \
 glibc \
 mariadb-server \
 pam-libs \
"

URI_mariadb-server = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mariadb-server-10.11.11-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mariadb-server}"
RDEPENDS:mariadb-server = " \
 systemd \
 systemd-libs \
 iproute \
 mysql-selinux \
 libaio \
 mariadb \
 mariadb-common \
 mariadb-errmsg \
 libstdc++ \
 shadow-utils \
 zlib-ng-compat \
 libxcrypt \
 libgcc \
 openssl-libs \
 snappy \
 bash \
 pcre2 \
 bzip2-libs \
 lz4-libs \
 lzo \
 mariadb-connector-c-config \
 glibc \
 coreutils \
"

URI_mariadb-server-galera = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mariadb-server-galera-10.11.11-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mariadb-server-galera}"
RDEPENDS:mariadb-server-galera = " \
 rsync \
 lsof \
 mariadb-common \
 policycoreutils-python-utils \
 policycoreutils \
 mariadb-server \
 bash \
 galera \
 libselinux-utils \
"

URI_mariadb-server-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mariadb-server-utils-10.11.11-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mariadb-server-utils}"
RDEPENDS:mariadb-server-utils = " \
 perl-libs \
 perl-vars \
 perl-Getopt-Long \
 perl-POSIX \
 perl-File-Basename \
 perl-DBI \
 perl-File-Copy \
 perl-DBD-MariaDB \
 perl-Sys-Hostname \
 mariadb-server \
 glibc \
 perl-interpreter \
 perl-File-Path \
 perl-Data-Dumper \
 perl-File-Temp \
"

URI_mariadb-test = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mariadb-test-10.11.11-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mariadb-test}"
RDEPENDS:mariadb-test = " \
 perl-libs \
 perl-Socket \
 perl-Storable \
 perl-Getopt-Long \
 perl-overload \
 perl-Symbol \
 perl-File-Find \
 perl-Sys-Hostname \
 perl-Term-ANSIColor \
 perl-threads \
 perl-threads-shared \
 libaio \
 perl-Carp \
 patch \
 perl-Test-Simple \
 perl-IO \
 mariadb-common \
 mariadb \
 perl-Text-Tabs+Wrap \
 perl-File-Temp \
 libstdc++ \
 perl-IPC-Open3 \
 mariadb-server \
 perl-Data-Dumper \
 perl-Time \
 perl-Time-HiRes \
 zlib-ng-compat \
 perl-Memoize \
 libxcrypt \
 libgcc \
 openssl-libs \
 pam-libs \
 bash \
 pcre2 \
 perl-English \
 perl-Env \
 perl-Exporter \
 perl-base \
 perl-constant \
 perl-Fcntl \
 perl-POSIX \
 perl-File-Basename \
 perl-File-Copy \
 perl-PathTools \
 perl-if \
 glibc \
 perl-interpreter \
 perl-File-Path \
 perl-lib \
"
