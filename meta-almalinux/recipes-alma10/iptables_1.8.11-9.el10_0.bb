
inherit dnf-bridge

PN = "iptables"
PE = "0"
PV = "1.8.11"
PR = "9.el10_0"
PACKAGES = "iptables-libs iptables-devel iptables-nft iptables-nft-services iptables-utils"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/iptables-1.8.11-9.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_iptables-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/iptables-libs-1.8.11-9.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_iptables-libs}"
RDEPENDS:iptables-libs = " \
 glibc \
 libnetfilter_conntrack \
"

URI_iptables-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/iptables-devel-1.8.11-9.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_iptables-devel}"
RDEPENDS:iptables-devel = " \
 pkgconf-pkg-config \
 iptables-libs \
"

URI_iptables-nft = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/iptables-nft-1.8.11-9.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_iptables-nft}"
RDEPENDS:iptables-nft = " \
 coreutils \
 libmnl \
 iptables-libs \
 kernel-modules-extra \
 bash \
 libnftnl \
 glibc \
 alternatives \
 kernel-debug-modules-extra \
"

URI_iptables-nft-services = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/iptables-nft-services-1.8.11-9.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_iptables-nft-services}"
RDEPENDS:iptables-nft-services = " \
 iptables-nft \
 bash \
"

URI_iptables-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/iptables-utils-1.8.11-9.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_iptables-utils}"
RDEPENDS:iptables-utils = " \
 libpcap \
 libnfnetlink \
 iptables-nft \
 bash \
 glibc \
"
