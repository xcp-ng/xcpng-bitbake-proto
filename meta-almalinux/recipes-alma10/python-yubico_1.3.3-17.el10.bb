
inherit dnf-bridge

PN = "python-yubico"
PE = "0"
PV = "1.3.3"
PR = "17.el10"
PACKAGES = "python3-yubico"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-yubico-1.3.3-17.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-yubico = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-yubico-1.3.3-17.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-yubico}"
RDEPENDS:python3-yubico = " \
 python3 \
 python3-pyusb \
"
