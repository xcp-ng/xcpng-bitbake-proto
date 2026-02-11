
inherit dnf-bridge

PN = "python-imagesize"
PE = "0"
PV = "1.4.1"
PR = "9.el10"
PACKAGES = "python3-imagesize"


URI_python3-imagesize = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-imagesize-1.4.1-9.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-imagesize = " \
 python3 \
"
