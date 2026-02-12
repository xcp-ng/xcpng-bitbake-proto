
inherit dnf-bridge

PN = "python-mako"
PE = "0"
PV = "1.2.3"
PR = "9.el10"
PACKAGES = "python3-mako"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-mako-1.2.3-9.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-mako = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-mako-1.2.3-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-mako}"
RDEPENDS:python3-mako = " \
 python3 \
 python3-markupsafe \
"
