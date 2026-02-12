
inherit dnf-bridge

PN = "python-simpleline"
PE = "0"
PV = "1.9.0"
PR = "12.el10"
PACKAGES = "python3-simpleline"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-simpleline-1.9.0-12.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-simpleline = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-simpleline-1.9.0-12.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-simpleline}"
RDEPENDS:python3-simpleline = " \
 python3 \
 python3-rpm \
"
