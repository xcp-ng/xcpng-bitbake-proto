
inherit dnf-bridge

PN = "python-packaging"
PE = "0"
PV = "24.2"
PR = "2.el10"
PACKAGES = "python3-packaging"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/python-packaging-24.2-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-packaging = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-packaging-24.2-2.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-packaging}"
RDEPENDS:python3-packaging = " \
 python3 \
"
