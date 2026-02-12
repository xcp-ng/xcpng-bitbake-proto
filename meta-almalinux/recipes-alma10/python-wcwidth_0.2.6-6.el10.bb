
inherit dnf-bridge

PN = "python-wcwidth"
PE = "0"
PV = "0.2.6"
PR = "6.el10"
PACKAGES = "python3-wcwidth"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/python-wcwidth-0.2.6-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-wcwidth = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-wcwidth-0.2.6-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-wcwidth}"
RDEPENDS:python3-wcwidth = " \
 python3 \
"
