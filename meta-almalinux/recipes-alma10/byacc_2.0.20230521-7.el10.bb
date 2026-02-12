
inherit dnf-bridge

PN = "byacc"
PE = "0"
PV = "2.0.20230521"
PR = "7.el10"
PACKAGES = "byacc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/byacc-2.0.20230521-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_byacc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/byacc-2.0.20230521-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_byacc}"
RDEPENDS:byacc = " \
 glibc \
"
