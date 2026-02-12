
inherit dnf-bridge

PN = "iperf3"
PE = "0"
PV = "3.17.1"
PR = "4.el10"
PACKAGES = "iperf3 iperf3-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/iperf3-3.17.1-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_iperf3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/iperf3-3.17.1-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_iperf3}"
RDEPENDS:iperf3 = " \
 glibc \
 openssl-libs \
 lksctp-tools \
"

URI_iperf3-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/iperf3-devel-3.17.1-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_iperf3-devel}"
RDEPENDS:iperf3-devel = " \
 iperf3 \
"
