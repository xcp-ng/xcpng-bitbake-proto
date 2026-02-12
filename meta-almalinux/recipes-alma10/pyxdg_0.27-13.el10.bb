
inherit dnf-bridge

PN = "pyxdg"
PE = "0"
PV = "0.27"
PR = "13.el10"
PACKAGES = "python3-pyxdg"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/pyxdg-0.27-13.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-pyxdg = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-pyxdg-0.27-13.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-pyxdg}"
RDEPENDS:python3-pyxdg = " \
 python3 \
"
