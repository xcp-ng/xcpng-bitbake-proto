
inherit dnf-bridge

PN = "libservicelog"
PE = "0"
PV = "1.1.19"
PR = "12.el10"
PACKAGES = ""


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/libservicelog-1.1.19-12.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"
