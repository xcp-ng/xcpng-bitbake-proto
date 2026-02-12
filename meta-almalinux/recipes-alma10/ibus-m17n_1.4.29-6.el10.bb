
inherit dnf-bridge

PN = "ibus-m17n"
PE = "0"
PV = "1.4.29"
PR = "6.el10"
PACKAGES = "ibus-m17n"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/ibus-m17n-1.4.29-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_ibus-m17n = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ibus-m17n-1.4.29-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ibus-m17n}"
RDEPENDS:ibus-m17n = " \
 ibus \
 glib2 \
 gtk3 \
 ibus-libs \
 glibc \
 m17n-lib \
"
