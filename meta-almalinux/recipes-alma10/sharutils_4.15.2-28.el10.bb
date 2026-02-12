
inherit dnf-bridge

PN = "sharutils"
PE = "0"
PV = "4.15.2"
PR = "28.el10"
PACKAGES = "sharutils"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/sharutils-4.15.2-28.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_sharutils = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/sharutils-4.15.2-28.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_sharutils}"
RDEPENDS:sharutils = " \
 glibc \
"
