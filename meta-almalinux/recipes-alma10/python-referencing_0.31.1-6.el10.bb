
inherit dnf-bridge

PN = "python-referencing"
PE = "0"
PV = "0.31.1"
PR = "6.el10"
PACKAGES = "python3-referencing"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/python-referencing-0.31.1-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-referencing = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-referencing-0.31.1-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-referencing}"
RDEPENDS:python3-referencing = " \
 python3 \
 python3-attrs \
 python3-rpds-py \
"
