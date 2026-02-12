
inherit dnf-bridge

PN = "libica"
PE = "0"
PV = "4.4.0"
PR = "1.el10"
PACKAGES = ""


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/libica-4.4.0-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"
