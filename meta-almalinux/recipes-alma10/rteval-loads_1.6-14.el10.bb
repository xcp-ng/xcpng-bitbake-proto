
inherit dnf-bridge

PN = "rteval-loads"
PE = "0"
PV = "1.6"
PR = "14.el10"
PACKAGES = ""


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/rteval-loads-1.6-14.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"
