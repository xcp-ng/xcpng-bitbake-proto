
inherit dnf-bridge

PN = "python-ruamel-yaml"
PE = "0"
PV = "0.18.5"
PR = "5.el10"
PACKAGES = "python3-ruamel-yaml"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-ruamel-yaml-0.18.5-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-ruamel-yaml = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-ruamel-yaml-0.18.5-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-ruamel-yaml}"
RDEPENDS:python3-ruamel-yaml = " \
 python3 \
 python3-ruamel-yaml-clib \
"
