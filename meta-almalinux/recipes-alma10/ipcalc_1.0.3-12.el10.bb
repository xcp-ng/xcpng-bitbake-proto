
inherit dnf-bridge

PN = "ipcalc"
PE = "0"
PV = "1.0.3"
PR = "12.el10"
PACKAGES = "ipcalc"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/ipcalc-1.0.3-12.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_ipcalc = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ipcalc-1.0.3-12.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ipcalc}"
RDEPENDS:ipcalc = " \
 glibc \
"
