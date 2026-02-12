
inherit dnf-bridge

PN = "python-ifaddr"
PE = "0"
PV = "0.2.0"
PR = "4.el10"
PACKAGES = "python3-ifaddr"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-ifaddr-0.2.0-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-ifaddr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-ifaddr-0.2.0-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-ifaddr}"
RDEPENDS:python3-ifaddr = " \
 python3 \
"
