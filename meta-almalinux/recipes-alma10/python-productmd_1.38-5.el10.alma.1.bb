
inherit dnf-bridge

PN = "python-productmd"
PE = "0"
PV = "1.38"
PR = "5.el10.alma.1"
PACKAGES = "python3-productmd"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-productmd-1.38-5.el10.alma.1.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-productmd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-productmd-1.38-5.el10.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-productmd}"
RDEPENDS:python3-productmd = " \
 python3 \
 python3-six \
"
