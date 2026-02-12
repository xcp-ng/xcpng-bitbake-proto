
inherit dnf-bridge

PN = "python-lark"
PE = "0"
PV = "1.1.7"
PR = "5.el10"
PACKAGES = "python3-lark"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-lark-1.1.7-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-lark = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-lark-1.1.7-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-lark}"
RDEPENDS:python3-lark = " \
 python3 \
"
