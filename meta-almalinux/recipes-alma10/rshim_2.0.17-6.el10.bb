
PN = "rshim"
PE = "0"
PV = "2.0.17"
PR = "6.el10"
PACKAGES = "rshim"


URI_rshim = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rshim-2.0.17-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rshim = " \
 fuse-libs \
 kernel-modules-extra \
 pciutils-libs \
 bash \
 glibc \
 libusb1 \
"
