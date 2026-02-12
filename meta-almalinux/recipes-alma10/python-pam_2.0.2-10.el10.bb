
inherit dnf-bridge

PN = "python-pam"
PE = "0"
PV = "2.0.2"
PR = "10.el10"
PACKAGES = "python3-pam"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-pam-2.0.2-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-pam = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-pam-2.0.2-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-pam}"
RDEPENDS:python3-pam = " \
 python3 \
"
