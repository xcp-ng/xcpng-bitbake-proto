
inherit dnf-bridge

PN = "tcpdump"
PE = "14"
PV = "4.99.4"
PR = "10.el10"
PACKAGES = "tcpdump"


URI_tcpdump = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tcpdump-4.99.4-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tcpdump = " \
 libpcap \
 shadow-utils \
 openssl-libs \
 bash \
 glibc \
"
