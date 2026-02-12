
inherit dnf-bridge

PN = "ksc"
PE = "0"
PV = "1.12"
PR = "7.git869a25c.el10"
PACKAGES = "ksc"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/ksc-1.12-7.git869a25c.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_ksc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ksc-1.12-7.git869a25c.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_ksc}"
RDEPENDS:ksc = " \
 kmod \
 python3-requests \
 kernel-devel \
 binutils \
"
