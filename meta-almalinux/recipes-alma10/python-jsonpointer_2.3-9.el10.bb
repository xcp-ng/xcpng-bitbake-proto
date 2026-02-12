
inherit dnf-bridge

PN = "python-jsonpointer"
PE = "0"
PV = "2.3"
PR = "9.el10"
PACKAGES = "python3-jsonpointer"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-jsonpointer-2.3-9.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-jsonpointer = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-jsonpointer-2.3-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-jsonpointer}"
RDEPENDS:python3-jsonpointer = " \
 python3 \
"
