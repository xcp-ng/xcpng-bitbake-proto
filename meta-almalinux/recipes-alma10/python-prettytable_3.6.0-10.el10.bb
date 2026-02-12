
inherit dnf-bridge

PN = "python-prettytable"
PE = "0"
PV = "3.6.0"
PR = "10.el10"
PACKAGES = "python3-prettytable"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-prettytable-3.6.0-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-prettytable = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-prettytable-3.6.0-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-prettytable}"
RDEPENDS:python3-prettytable = " \
 python3 \
 python3-wcwidth \
"
