
inherit dnf-bridge

PN = "pyatspi"
PE = "0"
PV = "2.46.1"
PR = "5.el10"
PACKAGES = "python3-pyatspi"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/pyatspi-2.46.1-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-pyatspi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-pyatspi-2.46.1-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-pyatspi}"
RDEPENDS:python3-pyatspi = " \
 python3 \
 python3-gobject \
 at-spi2-core \
"
