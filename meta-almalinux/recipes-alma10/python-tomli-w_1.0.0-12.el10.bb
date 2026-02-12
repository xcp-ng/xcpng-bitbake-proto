
inherit dnf-bridge

PN = "python-tomli-w"
PE = "0"
PV = "1.0.0"
PR = "12.el10"
PACKAGES = "python3-tomli-w"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/python-tomli-w-1.0.0-12.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-tomli-w = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-tomli-w-1.0.0-12.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-tomli-w}"
RDEPENDS:python3-tomli-w = " \
 python3 \
"
