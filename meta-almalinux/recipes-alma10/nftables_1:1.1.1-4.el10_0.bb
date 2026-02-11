
inherit dnf-bridge

PN = "nftables"
PE = "1"
PV = "1.1.1"
PR = "4.el10_0"
PACKAGES = "nftables python3-nftables nftables-devel"


URI_nftables = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/nftables-1.1.1-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nftables = " \
 gmp \
 jansson \
 libmnl \
 readline \
 iptables-libs \
 bash \
 libnftnl \
 glibc \
"

URI_python3-nftables = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-nftables-1.1.1-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-nftables = " \
 python3 \
 nftables \
"

URI_nftables-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/nftables-devel-1.1.1-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nftables-devel = " \
 nftables \
 pkgconf-pkg-config \
"
