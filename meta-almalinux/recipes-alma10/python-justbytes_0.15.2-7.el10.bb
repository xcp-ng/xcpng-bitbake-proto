
inherit dnf-bridge

PN = "python-justbytes"
PE = "0"
PV = "0.15.2"
PR = "7.el10"
PACKAGES = "python3-justbytes"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-justbytes-0.15.2-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-justbytes = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-justbytes-0.15.2-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-justbytes}"
RDEPENDS:python3-justbytes = " \
 python3 \
 python3-justbases \
"
