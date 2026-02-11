
inherit dnf-bridge

PN = "symlinks"
PE = "0"
PV = "1.7"
PR = "13.el10"
PACKAGES = "symlinks"


URI_symlinks = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/symlinks-1.7-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:symlinks = " \
 glibc \
"
