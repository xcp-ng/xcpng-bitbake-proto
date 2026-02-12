
inherit dnf-bridge

PN = "python-colorama"
PE = "0"
PV = "0.4.6"
PR = "13.el10"
PACKAGES = "python3-colorama"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/python-colorama-0.4.6-13.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-colorama = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-colorama-0.4.6-13.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-colorama}"
RDEPENDS:python3-colorama = " \
 python3 \
"
