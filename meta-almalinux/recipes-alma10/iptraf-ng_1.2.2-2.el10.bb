
inherit dnf-bridge

PN = "iptraf-ng"
PE = "0"
PV = "1.2.2"
PR = "2.el10"
PACKAGES = "iptraf-ng"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/iptraf-ng-1.2.2-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_iptraf-ng = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/iptraf-ng-1.2.2-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_iptraf-ng}"
RDEPENDS:iptraf-ng = " \
 glibc \
 logrotate \
 ncurses-libs \
"
