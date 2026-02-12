
inherit dnf-bridge

PN = "python-PyMySQL"
PE = "0"
PV = "1.1.1"
PR = "3.el10"
PACKAGES = "python3-PyMySQL python3-PyMySQL+rsa"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-PyMySQL-1.1.1-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-PyMySQL = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-PyMySQL-1.1.1-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-PyMySQL}"
RDEPENDS:python3-PyMySQL = " \
 python3 \
"

URI_python3-PyMySQL+rsa = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-PyMySQL+rsa-1.1.1-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-PyMySQL+rsa}"
RDEPENDS:python3-PyMySQL+rsa = " \
 python3-cryptography \
 python3 \
 python3-PyMySQL \
"
