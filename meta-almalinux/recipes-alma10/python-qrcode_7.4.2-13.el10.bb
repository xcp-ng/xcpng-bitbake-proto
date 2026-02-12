
inherit dnf-bridge

PN = "python-qrcode"
PE = "0"
PV = "7.4.2"
PR = "13.el10"
PACKAGES = "python3-qrcode"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-qrcode-7.4.2-13.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-qrcode = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-qrcode-7.4.2-13.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-qrcode}"
RDEPENDS:python3-qrcode = " \
 python3 \
 python3-typing-extensions \
"
