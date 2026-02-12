
inherit dnf-bridge

PN = "babel"
PE = "0"
PV = "2.13.1"
PR = "5.el10"
PACKAGES = "babel babel-doc python3-babel"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/babel-2.13.1-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_babel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/babel-2.13.1-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_babel}"
RDEPENDS:babel = " \
 python3 \
 python3-babel \
"

URI_babel-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/babel-doc-2.13.1-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_babel-doc}"
RDEPENDS:babel-doc = ""

URI_python3-babel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-babel-2.13.1-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-babel}"
RDEPENDS:python3-babel = " \
 python3-setuptools \
 python3 \
"
