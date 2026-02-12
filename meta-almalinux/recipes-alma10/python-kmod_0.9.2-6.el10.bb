
inherit dnf-bridge

PN = "python-kmod"
PE = "0"
PV = "0.9.2"
PR = "6.el10"
PACKAGES = "python3-kmod"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/python-kmod-0.9.2-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-kmod = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-kmod-0.9.2-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-kmod}"
RDEPENDS:python3-kmod = " \
 glibc \
 kmod-libs \
 python3 \
"
