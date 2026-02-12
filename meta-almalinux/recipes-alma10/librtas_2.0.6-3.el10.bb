
inherit dnf-bridge

PN = "librtas"
PE = "0"
PV = "2.0.6"
PR = "3.el10"
PACKAGES = ""


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/librtas-2.0.6-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"
