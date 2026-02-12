
inherit dnf-bridge

PN = "exfatprogs"
PE = "0"
PV = "1.2.2"
PR = "6.el10"
PACKAGES = "exfatprogs"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/exfatprogs-1.2.2-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_exfatprogs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/exfatprogs-1.2.2-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_exfatprogs}"
RDEPENDS:exfatprogs = " \
 glibc \
"
