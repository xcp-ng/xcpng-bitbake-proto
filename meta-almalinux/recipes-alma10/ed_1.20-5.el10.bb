
inherit dnf-bridge

PN = "ed"
PE = "0"
PV = "1.20"
PR = "5.el10"
PACKAGES = "ed"


URI_ed = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ed-1.20-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ed = " \
 glibc \
 bash \
"
