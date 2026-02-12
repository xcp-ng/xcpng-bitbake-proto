
inherit dnf-bridge

PN = "PyYAML"
PE = "0"
PV = "6.0.1"
PR = "19.el10"
PACKAGES = "python3-pyyaml"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/PyYAML-6.0.1-19.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-pyyaml = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-pyyaml-6.0.1-19.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-pyyaml}"
RDEPENDS:python3-pyyaml = " \
 glibc \
 python3 \
 libyaml \
"
