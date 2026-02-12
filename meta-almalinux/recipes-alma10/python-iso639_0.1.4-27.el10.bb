
inherit dnf-bridge

PN = "python-iso639"
PE = "0"
PV = "0.1.4"
PR = "27.el10"
PACKAGES = "python3-iso639"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-iso639-0.1.4-27.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-iso639 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-iso639-0.1.4-27.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-iso639}"
RDEPENDS:python3-iso639 = " \
 python3 \
"
