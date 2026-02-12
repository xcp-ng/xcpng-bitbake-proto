
inherit dnf-bridge

PN = "sgpio"
PE = "0"
PV = "1.2.0.10"
PR = "38.el10"
PACKAGES = "sgpio"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/sgpio-1.2.0.10-38.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_sgpio = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sgpio-1.2.0.10-38.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_sgpio}"
RDEPENDS:sgpio = " \
 glibc \
"
