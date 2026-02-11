
inherit dnf-bridge

PN = "python-iniparse"
PE = "0"
PV = "0.5"
PR = "10.el10"
PACKAGES = "python3-iniparse"


URI_python3-iniparse = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-iniparse-0.5-10.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-iniparse = " \
 python3 \
 python3-six \
"
