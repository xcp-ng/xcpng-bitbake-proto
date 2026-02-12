
inherit dnf-bridge

PN = "python-pyqt6-sip"
PE = "0"
PV = "13.9.1"
PR = "1.el10"
PACKAGES = "python3-pyqt6-sip"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-pyqt6-sip-13.9.1-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-pyqt6-sip = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-pyqt6-sip-13.9.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-pyqt6-sip}"
RDEPENDS:python3-pyqt6-sip = " \
 glibc \
 python3 \
"
