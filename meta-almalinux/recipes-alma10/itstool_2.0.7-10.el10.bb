
inherit dnf-bridge

PN = "itstool"
PE = "0"
PV = "2.0.7"
PR = "10.el10"
PACKAGES = "itstool"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/itstool-2.0.7-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_itstool = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/itstool-2.0.7-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_itstool}"
RDEPENDS:itstool = " \
 python3 \
 python3-libxml2 \
"
