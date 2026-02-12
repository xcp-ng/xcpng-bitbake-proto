
inherit dnf-bridge

PN = "libvpd"
PE = "0"
PV = "2.2.10"
PR = "1.el10"
PACKAGES = ""


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/libvpd-2.2.10-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"
