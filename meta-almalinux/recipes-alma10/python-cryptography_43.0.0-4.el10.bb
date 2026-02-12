
inherit dnf-bridge

PN = "python-cryptography"
PE = "0"
PV = "43.0.0"
PR = "4.el10"
PACKAGES = "python3-cryptography"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/python-cryptography-43.0.0-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-cryptography = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-cryptography-43.0.0-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-cryptography}"
RDEPENDS:python3-cryptography = " \
 python3 \
 python3-cffi \
 openssl-libs \
 libgcc \
 glibc \
"
