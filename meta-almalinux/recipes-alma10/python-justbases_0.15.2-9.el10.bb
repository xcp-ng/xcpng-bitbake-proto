
inherit dnf-bridge

PN = "python-justbases"
PE = "0"
PV = "0.15.2"
PR = "9.el10"
PACKAGES = "python3-justbases"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-justbases-0.15.2-9.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-justbases = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-justbases-0.15.2-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-justbases}"
RDEPENDS:python3-justbases = " \
 python3 \
"
