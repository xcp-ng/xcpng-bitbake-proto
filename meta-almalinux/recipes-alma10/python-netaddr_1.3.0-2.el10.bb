
inherit dnf-bridge

PN = "python-netaddr"
PE = "0"
PV = "1.3.0"
PR = "2.el10"
PACKAGES = "python3-netaddr"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-netaddr-1.3.0-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-netaddr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-netaddr-1.3.0-2.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-netaddr}"
RDEPENDS:python3-netaddr = " \
 python3 \
"
