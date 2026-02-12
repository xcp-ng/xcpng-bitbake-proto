
inherit dnf-bridge

PN = "tuna"
PE = "0"
PV = "0.19"
PR = "9.el10"
PACKAGES = "tuna"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/tuna-0.19-9.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_tuna = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/tuna-0.19-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_tuna}"
RDEPENDS:tuna = " \
 python3 \
 python3-linux-procfs \
"
