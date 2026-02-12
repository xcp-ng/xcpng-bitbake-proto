
inherit dnf-bridge

PN = "python-zstandard"
PE = "0"
PV = "0.22.0"
PR = "4.el10"
PACKAGES = "python3-zstandard"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/python-zstandard-0.22.0-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-zstandard = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-zstandard-0.22.0-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-zstandard}"
RDEPENDS:python3-zstandard = " \
 glibc \
 python3 \
"
