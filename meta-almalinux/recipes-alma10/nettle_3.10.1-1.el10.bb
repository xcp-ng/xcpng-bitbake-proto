
inherit dnf-bridge

PN = "nettle"
PE = "0"
PV = "3.10.1"
PR = "1.el10"
PACKAGES = "nettle nettle-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/nettle-3.10.1-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_nettle = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/nettle-3.10.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_nettle}"
RDEPENDS:nettle = " \
 glibc \
"

URI_nettle-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nettle-devel-3.10.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_nettle-devel}"
RDEPENDS:nettle-devel = " \
 gmp-devel \
 nettle-devel \
 pkgconf-pkg-config \
 nettle \
"
