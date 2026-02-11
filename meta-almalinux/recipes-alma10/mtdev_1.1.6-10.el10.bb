
PN = "mtdev"
PE = "0"
PV = "1.1.6"
PR = "10.el10"
PACKAGES = "mtdev mtdev-devel"


URI_mtdev = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mtdev-1.1.6-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mtdev = " \
 glibc \
"

URI_mtdev-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mtdev-devel-1.1.6-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mtdev-devel = " \
 glibc \
 mtdev \
 pkgconf-pkg-config \
"
