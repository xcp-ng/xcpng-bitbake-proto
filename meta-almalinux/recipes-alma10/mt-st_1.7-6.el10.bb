
inherit dnf-bridge

PN = "mt-st"
PE = "0"
PV = "1.7"
PR = "6.el10"
PACKAGES = "mt-st"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/mt-st-1.7-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_mt-st = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mt-st-1.7-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mt-st}"
RDEPENDS:mt-st = " \
 glibc \
 systemd \
 bash \
"
