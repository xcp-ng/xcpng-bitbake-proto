
inherit dnf-bridge

PN = "python-distro"
PE = "0"
PV = "1.9.0"
PR = "5.el10"
PACKAGES = "python3-distro"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-distro-1.9.0-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-distro = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-distro-1.9.0-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-distro}"
RDEPENDS:python3-distro = " \
 python3 \
"
