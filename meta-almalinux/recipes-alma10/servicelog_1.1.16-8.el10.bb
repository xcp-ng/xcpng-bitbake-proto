
inherit dnf-bridge

PN = "servicelog"
PE = "0"
PV = "1.1.16"
PR = "8.el10"
PACKAGES = ""


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/servicelog-1.1.16-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"
