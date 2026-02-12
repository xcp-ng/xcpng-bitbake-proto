
inherit dnf-bridge

PN = "python-jmespath"
PE = "0"
PV = "1.0.1"
PR = "8.el10"
PACKAGES = "python3-jmespath"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-jmespath-1.0.1-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-jmespath = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-jmespath-1.0.1-8.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-jmespath}"
RDEPENDS:python3-jmespath = " \
 python3 \
"
