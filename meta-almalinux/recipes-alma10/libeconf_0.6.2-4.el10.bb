
inherit dnf-bridge

PN = "libeconf"
PE = "0"
PV = "0.6.2"
PR = "4.el10"
PACKAGES = "libeconf libeconf-devel libeconf-utils"


URI_libeconf = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libeconf-0.6.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libeconf = " \
 glibc \
"

URI_libeconf-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libeconf-devel-0.6.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libeconf-devel = " \
 cmake-filesystem \
 pkgconf-pkg-config \
 libeconf \
"

URI_libeconf-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libeconf-utils-0.6.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libeconf-utils = " \
 glibc \
 libgcc \
 libeconf \
"
