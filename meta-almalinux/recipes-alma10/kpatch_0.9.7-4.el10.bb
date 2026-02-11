
PN = "kpatch"
PE = "0"
PV = "0.9.7"
PR = "4.el10"
PACKAGES = "kpatch kpatch-dnf"


URI_kpatch = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kpatch-0.9.7-4.el10.noarch.rpm;unpack=0"
RDEPENDS:kpatch = " \
 kmod \
 bash \
 binutils \
"

URI_kpatch-dnf = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kpatch-dnf-0.9.7_0.4-4.el10.noarch.rpm;unpack=0"
RDEPENDS:kpatch-dnf = " \
 python3 \
 python3-hawkey \
 bash \
 python3-dnf \
"
