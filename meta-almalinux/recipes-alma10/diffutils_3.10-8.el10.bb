
inherit dnf-bridge

PN = "diffutils"
PE = "0"
PV = "3.10"
PR = "8.el10"
PACKAGES = "diffutils"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/diffutils-3.10-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_diffutils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/diffutils-3.10-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_diffutils}"
RDEPENDS:diffutils = " \
 glibc \
"
