
inherit dnf-bridge

PN = "python-argcomplete"
PE = "0"
PV = "3.2.2"
PR = "4.el10"
PACKAGES = "python3-argcomplete"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-argcomplete-3.2.2-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-argcomplete = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-argcomplete-3.2.2-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-argcomplete}"
RDEPENDS:python3-argcomplete = " \
 python3 \
"
