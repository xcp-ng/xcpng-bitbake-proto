
inherit dnf-bridge

PN = "mtdev"
PE = "0"
PV = "1.1.6"
PR = "10.el10"
PACKAGES = "mtdev mtdev-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/mtdev-1.1.6-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_mtdev = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mtdev-1.1.6-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mtdev}"
RDEPENDS:mtdev = " \
 glibc \
"

URI_mtdev-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mtdev-devel-1.1.6-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mtdev-devel}"
RDEPENDS:mtdev-devel = " \
 glibc \
 mtdev \
 pkgconf-pkg-config \
"
