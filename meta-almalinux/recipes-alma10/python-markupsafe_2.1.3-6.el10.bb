
inherit dnf-bridge

PN = "python-markupsafe"
PE = "0"
PV = "2.1.3"
PR = "6.el10"
PACKAGES = "python3-markupsafe"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-markupsafe-2.1.3-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-markupsafe = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-markupsafe-2.1.3-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-markupsafe}"
RDEPENDS:python3-markupsafe = " \
 glibc \
 python3 \
"
