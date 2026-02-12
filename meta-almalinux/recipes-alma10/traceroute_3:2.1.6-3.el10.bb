
inherit dnf-bridge

PN = "traceroute"
PE = "3"
PV = "2.1.6"
PR = "3.el10"
PACKAGES = "traceroute"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/traceroute-2.1.6-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_traceroute = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/traceroute-2.1.6-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_traceroute}"
RDEPENDS:traceroute = " \
 glibc \
 bash \
"
