
inherit dnf-bridge

PN = "python-ptyprocess"
PE = "0"
PV = "0.7.0"
PR = "9.el10"
PACKAGES = "python3-ptyprocess"


URI_python3-ptyprocess = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-ptyprocess-0.7.0-9.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-ptyprocess = " \
 python3 \
"
