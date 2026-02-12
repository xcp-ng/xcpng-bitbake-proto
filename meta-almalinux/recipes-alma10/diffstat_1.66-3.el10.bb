
inherit dnf-bridge

PN = "diffstat"
PE = "0"
PV = "1.66"
PR = "3.el10"
PACKAGES = "diffstat"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/diffstat-1.66-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_diffstat = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/diffstat-1.66-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_diffstat}"
RDEPENDS:diffstat = " \
 glibc \
"
