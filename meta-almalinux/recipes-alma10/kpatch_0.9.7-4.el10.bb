
inherit dnf-bridge

PN = "kpatch"
PE = "0"
PV = "0.9.7"
PR = "4.el10"
PACKAGES = "kpatch kpatch-dnf"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/kpatch-0.9.7-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_kpatch = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kpatch-0.9.7-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_kpatch}"
RDEPENDS:kpatch = " \
 kmod \
 bash \
 binutils \
"

URI_kpatch-dnf = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kpatch-dnf-0.9.7_0.4-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_kpatch-dnf}"
RDEPENDS:kpatch-dnf = " \
 python3 \
 python3-hawkey \
 bash \
 python3-dnf \
"
