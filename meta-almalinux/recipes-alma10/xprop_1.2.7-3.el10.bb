
inherit dnf-bridge

PN = "xprop"
PE = "0"
PV = "1.2.7"
PR = "3.el10"
PACKAGES = "xprop"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/xprop-1.2.7-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_xprop = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xprop-1.2.7-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_xprop}"
RDEPENDS:xprop = " \
 glibc \
 libX11 \
"
