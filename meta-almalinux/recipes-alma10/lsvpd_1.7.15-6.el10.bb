
inherit dnf-bridge

PN = "lsvpd"
PE = "0"
PV = "1.7.15"
PR = "6.el10"
PACKAGES = ""


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/lsvpd-1.7.15-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"
