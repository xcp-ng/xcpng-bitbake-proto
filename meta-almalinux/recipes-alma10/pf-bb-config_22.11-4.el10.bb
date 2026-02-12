
inherit dnf-bridge

PN = "pf-bb-config"
PE = "0"
PV = "22.11"
PR = "4.el10"
PACKAGES = "pf-bb-config"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/pf-bb-config-22.11-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_pf-bb-config = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pf-bb-config-22.11-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_pf-bb-config}"
RDEPENDS:pf-bb-config = " \
 glibc \
"
