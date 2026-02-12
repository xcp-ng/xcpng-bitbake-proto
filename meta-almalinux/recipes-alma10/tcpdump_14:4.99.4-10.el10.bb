
inherit dnf-bridge

PN = "tcpdump"
PE = "14"
PV = "4.99.4"
PR = "10.el10"
PACKAGES = "tcpdump"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/tcpdump-4.99.4-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_tcpdump = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tcpdump-4.99.4-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_tcpdump}"
RDEPENDS:tcpdump = " \
 libpcap \
 shadow-utils \
 openssl-libs \
 bash \
 glibc \
"
