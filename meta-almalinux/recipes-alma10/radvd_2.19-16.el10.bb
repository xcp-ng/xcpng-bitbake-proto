
inherit dnf-bridge

PN = "radvd"
PE = "0"
PV = "2.19"
PR = "16.el10"
PACKAGES = "radvd"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/radvd-2.19-16.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_radvd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/radvd-2.19-16.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_radvd}"
RDEPENDS:radvd = " \
 glibc \
 shadow-utils \
 systemd \
 bash \
"
