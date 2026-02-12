
inherit dnf-bridge

PN = "color-filesystem"
PE = "0"
PV = "1"
PR = "35.el10"
PACKAGES = "color-filesystem"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/color-filesystem-1-35.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_color-filesystem = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/color-filesystem-1-35.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_color-filesystem}"
RDEPENDS:color-filesystem = " \
 rpm \
 filesystem \
"
