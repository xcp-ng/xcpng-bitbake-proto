
inherit dnf-bridge

PN = "ibus-libpinyin"
PE = "0"
PV = "1.15.7"
PR = "3.el10"
PACKAGES = "ibus-libpinyin"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/ibus-libpinyin-1.15.7-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_ibus-libpinyin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ibus-libpinyin-1.15.7-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ibus-libpinyin}"
RDEPENDS:ibus-libpinyin = " \
 python3-gobject \
 lua-libs \
 libgcc \
 ibus \
 sqlite-libs \
 libstdc++ \
 bash \
 glib2 \
 libpinyin \
 ibus-libs \
 glibc \
 libpinyin-data \
"
