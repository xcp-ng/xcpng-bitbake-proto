
inherit dnf-bridge

PN = "vdo"
PE = "0"
PV = "8.3.0.72"
PR = "1.el10"
PACKAGES = "vdo vdo-support"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/vdo-8.3.0.72-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_vdo = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/vdo-8.3.0.72-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_vdo}"
RDEPENDS:vdo = " \
 glibc \
 libblkid \
 libuuid \
 zlib-ng-compat \
"

URI_vdo-support = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/vdo-support-8.3.0.72-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_vdo-support}"
RDEPENDS:vdo-support = " \
 glibc \
 libuuid \
 zlib-ng-compat \
 bash \
"
