
inherit dnf-bridge

PN = "python-greenlet"
PE = "0"
PV = "3.0.3"
PR = "5.el10"
PACKAGES = "python3-greenlet python3-greenlet-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-greenlet-3.0.3-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-greenlet = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-greenlet-3.0.3-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-greenlet}"
RDEPENDS:python3-greenlet = " \
 glibc \
 python3 \
 libgcc \
 libstdc++ \
"

URI_python3-greenlet-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-greenlet-devel-3.0.3-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-greenlet-devel}"
RDEPENDS:python3-greenlet-devel = " \
 python3-greenlet \
"
