
inherit dnf-bridge

PN = "mysql8.4"
PE = "0"
PV = "8.4.6"
PR = "2.el10_0"
PACKAGES = "mysql8.4 mysql8.4-common mysql8.4-errmsg mysql8.4-libs mysql8.4-server mysql8.4-devel mysql8.4-test mysql8.4-test-data"


URI_mysql8.4 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mysql8.4-8.4.6-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:mysql8.4 = " \
 zlib-ng-compat \
 openssl-libs \
 libgcc \
 grep \
 libzstd \
 libstdc++ \
 bash \
 mysql8.4-common \
 glibc \
 coreutils \
 libedit \
"

URI_mysql8.4-common = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mysql8.4-common-8.4.6-2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:mysql8.4-common = " \
 mariadb-connector-c-config \
"

URI_mysql8.4-errmsg = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mysql8.4-errmsg-8.4.6-2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:mysql8.4-errmsg = " \
 mysql8.4-common \
"

URI_mysql8.4-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mysql8.4-libs-8.4.6-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:mysql8.4-libs = " \
 zlib-ng-compat \
 openssl-libs \
 libgcc \
 libzstd \
 libstdc++ \
 mysql8.4-common \
 glibc \
"

URI_mysql8.4-server = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mysql8.4-server-8.4.6-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:mysql8.4-server = " \
 systemd \
 perl-libs \
 policycoreutils-python-utils \
 perl-Getopt-Long \
 mysql-selinux \
 mysql8.4 \
 mysql8.4-common \
 mysql8.4-errmsg \
 libaio \
 numactl-libs \
 libstdc++ \
 libtirpc \
 mecab \
 protobuf-lite \
 shadow-utils \
 zlib-ng-compat \
 libgcc \
 openssl-libs \
 libzstd \
 bash \
 libicu \
 lz4-libs \
 mariadb-connector-c-config \
 glibc \
 coreutils \
 perl-interpreter \
"

URI_mysql8.4-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mysql8.4-devel-8.4.6-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:mysql8.4-devel = " \
 zlib-ng-compat-devel \
 libzstd-devel \
 pkgconf-pkg-config \
 openssl-devel \
 bash \
 mysql8.4-libs \
"

URI_mysql8.4-test = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mysql8.4-test-8.4.6-2.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:mysql8.4-test = " \
 mysql8.4-test-data \
 perl-libwww-perl \
 perl-FindBin \
 perl-Socket \
 perl-Getopt-Long \
 perl-Sys-Hostname \
 mysql8.4 \
 mysql8.4-common \
 mysql8.4-server \
 perl-Test-Simple \
 perl-IPC-Open3 \
 libstdc++ \
 perl-JSON \
 perl-Data-Dumper \
 perl-Time-HiRes \
 protobuf \
 zlib-ng-compat \
 perl-Digest \
 perl-Memoize \
 openssl \
 perl-Digest-MD5 \
 libgcc \
 openssl-libs \
 libzstd \
 bash \
 perl-Env \
 perl-Exporter \
 lz4 \
 lz4-libs \
 gzip \
 perl-Fcntl \
 perl-File-Compare \
 glibc \
 perl-File-Temp \
"

URI_mysql8.4-test-data = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mysql8.4-test-data-8.4.6-2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:mysql8.4-test-data = " \
 perl-libs \
 perl-FindBin \
 perl-Getopt-Long \
 perl-overload \
 mysql8.4-test \
 perl-Sys-Hostname \
 perl-threads \
 perl-threads-shared \
 perl-Carp \
 perl-Test-Simple \
 perl-IO \
 perl-JSON \
 perl-lib \
 perl-Data-Dumper \
 perl-Time \
 perl-Time-HiRes \
 perl-Memoize \
 bash \
 perl-English \
 perl-Exporter \
 perl-base \
 perl-constant \
 perl-Fcntl \
 perl-File-Basename \
 perl-POSIX \
 perl-File-Copy \
 perl-PathTools \
 perl-if \
 perl-File-Find \
 perl-interpreter \
 perl-File-Path \
 perl-File-Temp \
"
