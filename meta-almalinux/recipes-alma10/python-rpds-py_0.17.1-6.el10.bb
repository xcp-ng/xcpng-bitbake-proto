
inherit dnf-bridge

PN = "python-rpds-py"
PE = "0"
PV = "0.17.1"
PR = "6.el10"
PACKAGES = "python3-rpds-py"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/python-rpds-py-0.17.1-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-rpds-py = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-rpds-py-0.17.1-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-rpds-py}"
RDEPENDS:python3-rpds-py = " \
 glibc \
 libgcc \
 python3 \
"
