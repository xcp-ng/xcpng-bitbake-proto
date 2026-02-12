
inherit dnf-bridge

PN = "python-urllib3"
PE = "0"
PV = "1.26.19"
PR = "2.el10"
PACKAGES = "python3-urllib3"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/python-urllib3-1.26.19-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-urllib3 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-urllib3-1.26.19-2.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-urllib3}"
RDEPENDS:python3-urllib3 = " \
 ca-certificates \
 python3-idna \
 python3 \
"
