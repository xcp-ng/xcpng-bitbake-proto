
inherit dnf-bridge

PN = "python-trove-classifiers"
PE = "0"
PV = "2023.10.18"
PR = "5.el10"
PACKAGES = "python3-trove-classifiers"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/python-trove-classifiers-2023.10.18-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-trove-classifiers = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-trove-classifiers-2023.10.18-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-trove-classifiers}"
RDEPENDS:python3-trove-classifiers = " \
 python3 \
"
