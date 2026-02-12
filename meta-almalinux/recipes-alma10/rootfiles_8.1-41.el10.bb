
inherit dnf-bridge

PN = "rootfiles"
PE = "0"
PV = "8.1"
PR = "41.el10"
PACKAGES = "rootfiles"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/rootfiles-8.1-41.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_rootfiles = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/rootfiles-8.1-41.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_rootfiles}"
RDEPENDS:rootfiles = " \
 bash \
"
