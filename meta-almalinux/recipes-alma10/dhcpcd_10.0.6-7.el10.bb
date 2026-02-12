
inherit dnf-bridge

PN = "dhcpcd"
PE = "0"
PV = "10.0.6"
PR = "7.el10"
PACKAGES = "dhcpcd"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/dhcpcd-10.0.6-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_dhcpcd = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dhcpcd-10.0.6-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dhcpcd}"
RDEPENDS:dhcpcd = " \
 glibc \
 systemd \
 bash \
 systemd-libs \
"
