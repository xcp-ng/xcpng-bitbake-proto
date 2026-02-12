
inherit dnf-bridge

PN = "mtx"
PE = "0"
PV = "1.3.12"
PR = "34.el10"
PACKAGES = "mtx"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/mtx-1.3.12-34.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_mtx = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mtx-1.3.12-34.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mtx}"
RDEPENDS:mtx = " \
 glibc \
"
