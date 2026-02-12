
inherit dnf-bridge

PN = "python-xkbregistry"
PE = "0"
PV = "0.3"
PR = "3.el10"
PACKAGES = "python3-xkbregistry"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-xkbregistry-0.3-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-xkbregistry = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-xkbregistry-0.3-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-xkbregistry}"
RDEPENDS:python3-xkbregistry = " \
 glibc \
 libxkbcommon \
 python3-cffi \
 python3 \
"
