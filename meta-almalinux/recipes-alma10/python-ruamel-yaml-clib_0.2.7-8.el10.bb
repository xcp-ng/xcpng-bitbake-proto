
inherit dnf-bridge

PN = "python-ruamel-yaml-clib"
PE = "0"
PV = "0.2.7"
PR = "8.el10"
PACKAGES = "python3-ruamel-yaml-clib"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-ruamel-yaml-clib-0.2.7-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-ruamel-yaml-clib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-ruamel-yaml-clib-0.2.7-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-ruamel-yaml-clib}"
RDEPENDS:python3-ruamel-yaml-clib = " \
 glibc \
 python3-ruamel-yaml \
 python3 \
"
