
PN = "ethtool"
PE = "2"
PV = "6.11"
PR = "5.el10_0"
PACKAGES = "ethtool"


URI_ethtool = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ethtool-6.11-5.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:ethtool = " \
 glibc \
 libmnl \
"
