
inherit dnf-bridge

PN = "exempi"
PE = "0"
PV = "2.6.4"
PR = "7.el10"
PACKAGES = "exempi exempi-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/exempi-2.6.4-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_exempi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/exempi-2.6.4-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_exempi}"
RDEPENDS:exempi = " \
 zlib-ng-compat \
 libgcc \
 libstdc++ \
 expat \
 glibc \
"

URI_exempi-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/exempi-devel-2.6.4-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_exempi-devel}"
RDEPENDS:exempi-devel = " \
 pkgconf-pkg-config \
 exempi \
"
