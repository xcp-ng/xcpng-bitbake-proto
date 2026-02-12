
inherit dnf-bridge

PN = "rteval"
PE = "0"
PV = "3.9"
PR = "3.el10"
PACKAGES = ""


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/rteval-3.9-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"
