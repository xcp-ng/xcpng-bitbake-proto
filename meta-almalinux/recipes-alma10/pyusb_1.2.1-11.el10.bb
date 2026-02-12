
inherit dnf-bridge

PN = "pyusb"
PE = "0"
PV = "1.2.1"
PR = "11.el10"
PACKAGES = "python3-pyusb"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/pyusb-1.2.1-11.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-pyusb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-pyusb-1.2.1-11.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-pyusb}"
RDEPENDS:python3-pyusb = " \
 python3 \
 libusb1 \
"
