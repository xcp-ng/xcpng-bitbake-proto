
inherit dnf-bridge

PN = "python-jwcrypto"
PE = "0"
PV = "1.5.6"
PR = "4.el10"
PACKAGES = "python3-jwcrypto"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-jwcrypto-1.5.6-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-jwcrypto = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-jwcrypto-1.5.6-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-jwcrypto}"
RDEPENDS:python3-jwcrypto = " \
 python3 \
 python3-cryptography \
 python3-typing-extensions \
"
