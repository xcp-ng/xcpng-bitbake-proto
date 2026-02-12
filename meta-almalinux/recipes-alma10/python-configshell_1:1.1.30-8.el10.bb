
inherit dnf-bridge

PN = "python-configshell"
PE = "1"
PV = "1.1.30"
PR = "8.el10"
PACKAGES = "python3-configshell"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/python-configshell-1.1.30-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-configshell = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-configshell-1.1.30-8.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-configshell}"
RDEPENDS:python3-configshell = " \
 python3 \
 python3-urwid \
 python3-six \
 python3-pyparsing \
"
