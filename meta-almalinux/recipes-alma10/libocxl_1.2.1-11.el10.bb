
inherit dnf-bridge

PN = "libocxl"
PE = "0"
PV = "1.2.1"
PR = "11.el10"
PACKAGES = ""


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libocxl-1.2.1-11.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"
