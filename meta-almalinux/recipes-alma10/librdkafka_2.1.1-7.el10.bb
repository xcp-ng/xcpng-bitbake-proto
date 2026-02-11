
PN = "librdkafka"
PE = "0"
PV = "2.1.1"
PR = "7.el10"
PACKAGES = "librdkafka librdkafka-devel"


URI_librdkafka = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/librdkafka-2.1.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:librdkafka = " \
 zlib-ng-compat \
 lz4-libs \
 openssl-libs \
 libgcc \
 libzstd \
 cyrus-sasl-lib \
 libstdc++ \
 glibc \
"

URI_librdkafka-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/librdkafka-devel-2.1.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:librdkafka-devel = " \
 librdkafka \
 zlib-ng-compat-devel \
 libzstd-devel \
 cyrus-sasl-devel \
 pkgconf-pkg-config \
 openssl-devel \
 librdkafka-devel \
 lz4-devel \
"
