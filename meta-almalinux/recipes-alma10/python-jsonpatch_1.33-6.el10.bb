
inherit dnf-bridge

PN = "python-jsonpatch"
PE = "0"
PV = "1.33"
PR = "6.el10"
PACKAGES = "python3-jsonpatch"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-jsonpatch-1.33-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-jsonpatch = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-jsonpatch-1.33-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-jsonpatch}"
RDEPENDS:python3-jsonpatch = " \
 python3 \
 python3-jsonpointer \
"
