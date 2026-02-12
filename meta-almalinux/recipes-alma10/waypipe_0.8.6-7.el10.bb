
inherit dnf-bridge

PN = "waypipe"
PE = "0"
PV = "0.8.6"
PR = "7.el10"
PACKAGES = "waypipe"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/waypipe-0.8.6-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_waypipe = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/waypipe-0.8.6-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_waypipe}"
RDEPENDS:waypipe = " \
 glibc \
 lz4-libs \
 mesa-libgbm \
 libzstd \
"
