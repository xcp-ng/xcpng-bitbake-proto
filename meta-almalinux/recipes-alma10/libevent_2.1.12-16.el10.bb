
inherit dnf-bridge

PN = "libevent"
PE = "0"
PV = "2.1.12"
PR = "16.el10"
PACKAGES = "libevent libevent-devel libevent-doc"


URI_libevent = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libevent-2.1.12-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libevent = " \
 glibc \
 openssl-libs \
"

URI_libevent-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libevent-devel-2.1.12-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libevent-devel = " \
 python3 \
 libevent-devel \
 pkgconf-pkg-config \
 libevent \
"

URI_libevent-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libevent-doc-2.1.12-16.el10.noarch.rpm;unpack=0"
RDEPENDS:libevent-doc = ""
