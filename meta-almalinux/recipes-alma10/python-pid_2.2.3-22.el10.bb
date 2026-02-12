
inherit dnf-bridge

PN = "python-pid"
PE = "0"
PV = "2.2.3"
PR = "22.el10"
PACKAGES = "python3-pid"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-pid-2.2.3-22.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-pid = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-pid-2.2.3-22.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-pid}"
RDEPENDS:python3-pid = " \
 python3 \
"
