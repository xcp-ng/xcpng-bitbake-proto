
inherit dnf-bridge

PN = "libzpc"
PE = "0"
PV = "1.2.0"
PR = "8.el10"
PACKAGES = ""


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libzpc-1.2.0-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"
