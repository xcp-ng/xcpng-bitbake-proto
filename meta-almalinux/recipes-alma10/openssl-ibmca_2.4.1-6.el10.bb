
inherit dnf-bridge

PN = "openssl-ibmca"
PE = "0"
PV = "2.4.1"
PR = "6.el10"
PACKAGES = ""


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/openssl-ibmca-2.4.1-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"
