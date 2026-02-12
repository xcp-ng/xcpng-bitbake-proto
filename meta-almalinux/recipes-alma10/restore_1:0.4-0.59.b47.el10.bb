
inherit dnf-bridge

PN = "restore"
PE = "1"
PV = "0.4"
PR = "0.59.b47.el10"
PACKAGES = "restore"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/restore-0.4-0.59.b47.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_restore = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/restore-0.4-0.59.b47.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_restore}"
RDEPENDS:restore = " \
 setup \
 e2fsprogs-libs \
 zlib-ng-compat \
 bzip2-libs \
 lzo \
 readline \
 rmt \
 glibc \
 libselinux \
"
