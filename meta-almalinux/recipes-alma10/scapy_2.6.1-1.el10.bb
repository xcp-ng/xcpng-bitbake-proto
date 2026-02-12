
inherit dnf-bridge

PN = "scapy"
PE = "0"
PV = "2.6.1"
PR = "1.el10"
PACKAGES = "python3-scapy"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/scapy-2.6.1-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-scapy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-scapy-2.6.1-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-scapy}"
RDEPENDS:python3-scapy = " \
 python3 \
"
