
inherit dnf-bridge

PN = "python-cups"
PE = "0"
PV = "2.0.1"
PR = "23.el10"
PACKAGES = "python-cups-doc python3-cups"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-cups-2.0.1-23.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python-cups-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python-cups-doc-2.0.1-23.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python-cups-doc}"
RDEPENDS:python-cups-doc = ""

URI_python3-cups = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-cups-2.0.1-23.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-cups}"
RDEPENDS:python3-cups = " \
 glibc \
 cups-libs \
 python3 \
"
