
inherit dnf-bridge

PN = "libnxz"
PE = "0"
PV = "0.64"
PR = "8.el10"
PACKAGES = ""


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libnxz-0.64-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"
