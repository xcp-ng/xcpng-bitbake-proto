
inherit dnf-bridge

PN = "lld"
PE = "0"
PV = "18.1.8"
PR = "1.el10"
PACKAGES = ""


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/lld-18.1.8-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"
