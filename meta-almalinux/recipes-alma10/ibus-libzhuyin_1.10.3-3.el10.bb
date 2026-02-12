
inherit dnf-bridge

PN = "ibus-libzhuyin"
PE = "0"
PV = "1.10.3"
PR = "3.el10"
PACKAGES = "ibus-libzhuyin"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/ibus-libzhuyin-1.10.3-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_ibus-libzhuyin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ibus-libzhuyin-1.10.3-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ibus-libzhuyin}"
RDEPENDS:ibus-libzhuyin = " \
 libzhuyin \
 libgcc \
 ibus \
 libstdc++ \
 bash \
 glib2 \
 ibus-libs \
 glibc \
"
