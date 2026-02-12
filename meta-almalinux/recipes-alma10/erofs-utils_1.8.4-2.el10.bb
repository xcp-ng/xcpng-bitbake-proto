
inherit dnf-bridge

PN = "erofs-utils"
PE = "0"
PV = "1.8.4"
PR = "2.el10"
PACKAGES = "erofs-fuse erofs-utils"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/erofs-utils-1.8.4-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_erofs-fuse = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/erofs-fuse-1.8.4-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_erofs-fuse}"
RDEPENDS:erofs-fuse = " \
 zlib-ng-compat \
 fuse3 \
 fuse3-libs \
 lz4-libs \
 libzstd \
 glibc \
 libselinux \
 xz-libs \
"

URI_erofs-utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/erofs-utils-1.8.4-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_erofs-utils}"
RDEPENDS:erofs-utils = " \
 libuuid \
 zlib-ng-compat \
 lz4-libs \
 libzstd \
 glibc \
 libselinux \
 xz-libs \
"
