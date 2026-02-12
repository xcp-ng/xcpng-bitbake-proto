
inherit dnf-bridge

PN = "python-awscrt"
PE = "0"
PV = "0.27.2"
PR = "1.el10_0"
PACKAGES = "python3-awscrt"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-awscrt-0.27.2-1.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-awscrt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-awscrt-0.27.2-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-awscrt}"
RDEPENDS:python3-awscrt = " \
 glibc \
 openssl-libs \
 libgcc \
 python3 \
"
