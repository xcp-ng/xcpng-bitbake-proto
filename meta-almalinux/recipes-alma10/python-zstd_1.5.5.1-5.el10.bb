
inherit dnf-bridge

PN = "python-zstd"
PE = "0"
PV = "1.5.5.1"
PR = "5.el10"
PACKAGES = "python3-zstd"


URI_python3-zstd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-zstd-1.5.5.1-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-zstd = " \
 glibc \
 python3 \
 libzstd \
"
