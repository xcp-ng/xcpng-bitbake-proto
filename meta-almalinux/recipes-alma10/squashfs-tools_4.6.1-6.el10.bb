
inherit dnf-bridge

PN = "squashfs-tools"
PE = "0"
PV = "4.6.1"
PR = "6.el10"
PACKAGES = "squashfs-tools"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/squashfs-tools-4.6.1-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_squashfs-tools = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/squashfs-tools-4.6.1-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_squashfs-tools}"
RDEPENDS:squashfs-tools = " \
 zlib-ng-compat \
 lz4-libs \
 lzo \
 libgcc \
 libzstd \
 glibc \
 xz-libs \
"
