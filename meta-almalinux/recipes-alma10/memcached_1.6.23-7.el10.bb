
inherit dnf-bridge

PN = "memcached"
PE = "0"
PV = "1.6.23"
PR = "7.el10"
PACKAGES = "memcached memcached-selinux memcached-devel"


URI_memcached = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/memcached-1.6.23-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:memcached = " \
 memcached-selinux \
 shadow-utils \
 perl-libs \
 systemd \
 libevent \
 perl-IO \
 openssl-libs \
 cyrus-sasl-lib \
 bash \
 glibc \
 perl-interpreter \
"

URI_memcached-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/memcached-selinux-1.6.23-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:memcached-selinux = " \
 policycoreutils-python-utils \
 policycoreutils \
 bash \
 selinux-policy \
 libselinux-utils \
"

URI_memcached-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/memcached-devel-1.6.23-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:memcached-devel = " \
 memcached \
"
