
inherit dnf-bridge

PN = "libomp"
PE = "0"
PV = "18.1.8"
PR = "2.el10"
PACKAGES = ""


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/libomp-18.1.8-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"
