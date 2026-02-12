
inherit dnf-bridge

PN = "fuse-overlayfs"
PE = "0"
PV = "1.14"
PR = "2.el10"
PACKAGES = "fuse-overlayfs"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/fuse-overlayfs-1.14-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_fuse-overlayfs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fuse-overlayfs-1.14-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_fuse-overlayfs}"
RDEPENDS:fuse-overlayfs = " \
 fuse3 \
 fuse3-libs \
 kmod \
 libgcc \
 bash \
 glibc \
"
