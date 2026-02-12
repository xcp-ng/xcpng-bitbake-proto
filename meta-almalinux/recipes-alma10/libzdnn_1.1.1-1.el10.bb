
inherit dnf-bridge

PN = "libzdnn"
PE = "0"
PV = "1.1.1"
PR = "1.el10"
PACKAGES = ""


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libzdnn-1.1.1-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"
