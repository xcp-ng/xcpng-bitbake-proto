
inherit dnf-bridge

PN = "PyQt-builder"
PE = "0"
PV = "1.17.0"
PR = "1.el10"
PACKAGES = "PyQt-builder"


URI_PyQt-builder = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/PyQt-builder-1.17.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:PyQt-builder = " \
 python3 \
 python3-packaging \
 sip6 \
"
