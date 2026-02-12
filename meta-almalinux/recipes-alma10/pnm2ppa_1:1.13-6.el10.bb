
inherit dnf-bridge

PN = "pnm2ppa"
PE = "1"
PV = "1.13"
PR = "6.el10"
PACKAGES = "pnm2ppa"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/pnm2ppa-1.13-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_pnm2ppa = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pnm2ppa-1.13-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_pnm2ppa}"
RDEPENDS:pnm2ppa = " \
 glibc \
 foomatic \
 bash \
"
