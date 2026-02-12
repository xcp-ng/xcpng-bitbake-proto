
inherit dnf-bridge

PN = "smc-tools"
PE = "0"
PV = "1.8.4"
PR = "1.el10"
PACKAGES = "smc-tools"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/smc-tools-1.8.4-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_smc-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/smc-tools-1.8.4-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_smc-tools}"
RDEPENDS:smc-tools = " \
 glibc \
 bash \
 libnl3 \
"
