
inherit dnf-bridge

PN = "python-six"
PE = "0"
PV = "1.16.0"
PR = "16.el10"
PACKAGES = "python3-six"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/python-six-1.16.0-16.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-six = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-six-1.16.0-16.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-six}"
RDEPENDS:python3-six = " \
 python3 \
"
