
inherit dnf-bridge

PN = "omping"
PE = "0"
PV = "0.0.4"
PR = "34.el10"
PACKAGES = "omping"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/omping-0.0.4-34.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_omping = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/omping-0.0.4-34.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_omping}"
RDEPENDS:omping = " \
 glibc \
"
