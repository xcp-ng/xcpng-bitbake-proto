
inherit dnf-bridge

PN = "fuse3"
PE = "0"
PV = "3.16.2"
PR = "5.el10"
PACKAGES = "fuse-common fuse3 fuse3-libs fuse3-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/fuse3-3.16.2-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_fuse-common = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/fuse-common-3.16.2-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_fuse-common}"
RDEPENDS:fuse-common = ""

URI_fuse3 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/fuse3-3.16.2-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_fuse3}"
RDEPENDS:fuse3 = " \
 glibc \
 fuse3-libs \
 fuse-common \
"

URI_fuse3-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/fuse3-libs-3.16.2-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_fuse3-libs}"
RDEPENDS:fuse3-libs = " \
 glibc \
"

URI_fuse3-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fuse3-devel-3.16.2-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_fuse3-devel}"
RDEPENDS:fuse3-devel = " \
 fuse3-libs \
 pkgconf-pkg-config \
"
