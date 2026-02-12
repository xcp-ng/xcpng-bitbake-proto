
inherit dnf-bridge

PN = "rshim"
PE = "0"
PV = "2.0.17"
PR = "6.el10"
PACKAGES = "rshim"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/rshim-2.0.17-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_rshim = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rshim-2.0.17-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rshim}"
RDEPENDS:rshim = " \
 fuse-libs \
 kernel-modules-extra \
 pciutils-libs \
 bash \
 glibc \
 libusb1 \
"
