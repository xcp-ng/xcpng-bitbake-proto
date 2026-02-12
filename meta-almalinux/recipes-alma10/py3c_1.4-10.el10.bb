
inherit dnf-bridge

PN = "py3c"
PE = "0"
PV = "1.4"
PR = "10.el10"
PACKAGES = "py3c-devel py3c-doc"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/py3c-1.4-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_py3c-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/py3c-devel-1.4-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_py3c-devel}"
RDEPENDS:py3c-devel = " \
 pkgconf-pkg-config \
 python3-devel \
"

URI_py3c-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/py3c-doc-1.4-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_py3c-doc}"
RDEPENDS:py3c-doc = ""
