
inherit dnf-bridge

PN = "python-websockets"
PE = "0"
PV = "14.2"
PR = "2.el10_0"
PACKAGES = "python3-websockets"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-websockets-14.2-2.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-websockets = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-websockets-14.2-2.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-websockets}"
RDEPENDS:python3-websockets = " \
 glibc \
 python3 \
"
