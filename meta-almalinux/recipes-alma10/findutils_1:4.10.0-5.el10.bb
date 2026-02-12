
inherit dnf-bridge

PN = "findutils"
PE = "1"
PV = "4.10.0"
PR = "5.el10"
PACKAGES = "findutils"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/findutils-4.10.0-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_findutils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/findutils-4.10.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_findutils}"
RDEPENDS:findutils = " \
 glibc \
 libselinux \
"
