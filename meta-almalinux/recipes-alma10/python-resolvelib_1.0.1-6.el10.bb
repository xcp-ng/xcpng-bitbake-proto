
inherit dnf-bridge

PN = "python-resolvelib"
PE = "0"
PV = "1.0.1"
PR = "6.el10"
PACKAGES = "python3-resolvelib"


URI_python3-resolvelib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-resolvelib-1.0.1-6.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-resolvelib = " \
 python3 \
"
