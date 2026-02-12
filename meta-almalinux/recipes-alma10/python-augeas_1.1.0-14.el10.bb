
inherit dnf-bridge

PN = "python-augeas"
PE = "0"
PV = "1.1.0"
PR = "14.el10"
PACKAGES = "python3-augeas"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-augeas-1.1.0-14.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-augeas = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-augeas-1.1.0-14.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-augeas}"
RDEPENDS:python3-augeas = " \
 python3 \
 python3-cffi \
 augeas-libs \
"
