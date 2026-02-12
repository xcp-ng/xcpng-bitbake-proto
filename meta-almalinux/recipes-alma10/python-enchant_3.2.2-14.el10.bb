
inherit dnf-bridge

PN = "python-enchant"
PE = "0"
PV = "3.2.2"
PR = "14.el10"
PACKAGES = "python3-enchant"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-enchant-3.2.2-14.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-enchant = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-enchant-3.2.2-14.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-enchant}"
RDEPENDS:python3-enchant = " \
 python3 \
 enchant2 \
"
