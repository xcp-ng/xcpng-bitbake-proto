
inherit dnf-bridge

PN = "python-editables"
PE = "0"
PV = "0.5"
PR = "3.el10"
PACKAGES = "python3-editables"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/python-editables-0.5-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-editables = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-editables-0.5-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-editables}"
RDEPENDS:python3-editables = " \
 python3 \
"
