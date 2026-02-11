
inherit dnf-bridge

PN = "netavark"
PE = "2"
PV = "1.14.1"
PR = "1.el10_0"
PACKAGES = "netavark"


URI_netavark = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/netavark-1.14.1-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:netavark = " \
 nftables \
 aardvark-dns \
 libgcc \
 bash \
 glibc \
"
