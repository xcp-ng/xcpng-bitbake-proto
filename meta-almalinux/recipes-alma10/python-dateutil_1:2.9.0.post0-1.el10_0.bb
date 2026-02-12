
inherit dnf-bridge

PN = "python-dateutil"
PE = "1"
PV = "2.9.0.post0"
PR = "1.el10_0"
PACKAGES = "python3-dateutil python-dateutil-doc"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/python-dateutil-2.9.0.post0-1.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-dateutil = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-dateutil-2.9.0.post0-1.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-dateutil}"
RDEPENDS:python3-dateutil = " \
 python3 \
 python3-six \
 tzdata \
"

URI_python-dateutil-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python-dateutil-doc-2.9.0.post0-1.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_python-dateutil-doc}"
RDEPENDS:python-dateutil-doc = ""
