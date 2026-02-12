
inherit dnf-bridge

PN = "ppc64-diag"
PE = "0"
PV = "2.7.10"
PR = "2.el10"
PACKAGES = ""


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/ppc64-diag-2.7.10-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"
