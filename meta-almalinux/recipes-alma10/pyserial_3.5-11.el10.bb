
inherit dnf-bridge

PN = "pyserial"
PE = "0"
PV = "3.5"
PR = "11.el10"
PACKAGES = "python3-pyserial"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/pyserial-3.5-11.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-pyserial = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-pyserial-3.5-11.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-pyserial}"
RDEPENDS:python3-pyserial = " \
 python3 \
"
