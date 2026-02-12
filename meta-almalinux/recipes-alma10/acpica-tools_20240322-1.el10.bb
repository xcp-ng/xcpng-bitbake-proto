
inherit dnf-bridge

PN = "acpica-tools"
PE = "0"
PV = "20240322"
PR = "1.el10"
PACKAGES = "acpica-tools"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/acpica-tools-20240322-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_acpica-tools = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/acpica-tools-20240322-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_acpica-tools}"
RDEPENDS:acpica-tools = " \
 glibc \
 bash \
"
