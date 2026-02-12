
inherit dnf-bridge

PN = "iprutils"
PE = "0"
PV = "2.4.19"
PR = "14.el10"
PACKAGES = ""


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/iprutils-2.4.19-14.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"
