
inherit dnf-bridge

PN = "qclib"
PE = "0"
PV = "2.5.0"
PR = "2.el10"
PACKAGES = ""


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/qclib-2.5.0-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"
