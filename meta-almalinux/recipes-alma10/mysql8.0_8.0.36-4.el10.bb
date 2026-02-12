
inherit dnf-bridge

PN = "mysql8.0"
PE = "0"
PV = "8.0.36"
PR = "4.el10"
PACKAGES = ""


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/mysql8.0-8.0.36-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"
