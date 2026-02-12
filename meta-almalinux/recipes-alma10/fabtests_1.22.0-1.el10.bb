
inherit dnf-bridge

PN = "fabtests"
PE = "0"
PV = "1.22.0"
PR = "1.el10"
PACKAGES = "fabtests"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/fabtests-1.22.0-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_fabtests = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/fabtests-1.22.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_fabtests}"
RDEPENDS:fabtests = " \
 python3 \
 ruby \
 libfabric \
 python3-pytest \
 bash \
 glibc \
"
