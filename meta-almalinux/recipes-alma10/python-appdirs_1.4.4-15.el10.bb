
inherit dnf-bridge

PN = "python-appdirs"
PE = "0"
PV = "1.4.4"
PR = "15.el10"
PACKAGES = "python3-appdirs"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-appdirs-1.4.4-15.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-appdirs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-appdirs-1.4.4-15.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-appdirs}"
RDEPENDS:python3-appdirs = " \
 python3 \
"
