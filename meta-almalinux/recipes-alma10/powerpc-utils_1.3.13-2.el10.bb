
inherit dnf-bridge

PN = "powerpc-utils"
PE = "0"
PV = "1.3.13"
PR = "2.el10"
PACKAGES = ""


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/powerpc-utils-1.3.13-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"
