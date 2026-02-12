
inherit dnf-bridge

PN = "kdump-anaconda-addon"
PE = "0"
PV = "006"
PR = "17.20220714git7ca2d3e.el10"
PACKAGES = "kdump-anaconda-addon"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/kdump-anaconda-addon-006-17.20220714git7ca2d3e.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_kdump-anaconda-addon = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/kdump-anaconda-addon-006-17.20220714git7ca2d3e.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_kdump-anaconda-addon}"
RDEPENDS:kdump-anaconda-addon = " \
 hicolor-icon-theme \
 anaconda \
"
