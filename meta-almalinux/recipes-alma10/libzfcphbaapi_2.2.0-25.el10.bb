
inherit dnf-bridge

PN = "libzfcphbaapi"
PE = "0"
PV = "2.2.0"
PR = "25.el10"
PACKAGES = ""


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/libzfcphbaapi-2.2.0-25.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"
