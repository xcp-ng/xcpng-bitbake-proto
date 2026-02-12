
inherit dnf-bridge

PN = "python-requests-file"
PE = "0"
PV = "2.0.0"
PR = "4.el10"
PACKAGES = "python3-requests-file"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-requests-file-2.0.0-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-requests-file = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-requests-file-2.0.0-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-requests-file}"
RDEPENDS:python3-requests-file = " \
 python3 \
 python3-requests \
"
