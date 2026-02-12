
inherit dnf-bridge

PN = "realtime-setup"
PE = "0"
PV = "2.5"
PR = "2.el10"
PACKAGES = ""


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/realtime-setup-2.5-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"
