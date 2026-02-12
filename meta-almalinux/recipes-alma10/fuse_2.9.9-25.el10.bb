
inherit dnf-bridge

PN = "fuse"
PE = "0"
PV = "2.9.9"
PR = "25.el10"
PACKAGES = "fuse fuse-libs fuse-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/fuse-2.9.9-25.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_fuse = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/fuse-2.9.9-25.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_fuse}"
RDEPENDS:fuse = " \
 glibc \
 fuse-common \
 which \
"

URI_fuse-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/fuse-libs-2.9.9-25.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_fuse-libs}"
RDEPENDS:fuse-libs = " \
 glibc \
"

URI_fuse-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/fuse-devel-2.9.9-25.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_fuse-devel}"
RDEPENDS:fuse-devel = " \
 pkgconf-pkg-config \
 fuse-libs \
"
