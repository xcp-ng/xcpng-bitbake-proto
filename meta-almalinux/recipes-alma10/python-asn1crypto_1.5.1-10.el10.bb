
inherit dnf-bridge

PN = "python-asn1crypto"
PE = "0"
PV = "1.5.1"
PR = "10.el10"
PACKAGES = "python3-asn1crypto"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-asn1crypto-1.5.1-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-asn1crypto = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-asn1crypto-1.5.1-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-asn1crypto}"
RDEPENDS:python3-asn1crypto = " \
 python3 \
"
