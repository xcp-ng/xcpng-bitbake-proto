
inherit dnf-bridge

PN = "which"
PE = "0"
PV = "2.21"
PR = "44.el10_0"
PACKAGES = "which"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/which-2.21-44.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_which = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/which-2.21-44.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_which}"
RDEPENDS:which = " \
 glibc \
 coreutils \
"
