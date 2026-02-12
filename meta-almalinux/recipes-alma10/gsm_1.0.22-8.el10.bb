
inherit dnf-bridge

PN = "gsm"
PE = "0"
PV = "1.0.22"
PR = "8.el10"
PACKAGES = "gsm gsm-devel gsm-tools"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/gsm-1.0.22-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_gsm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gsm-1.0.22-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gsm}"
RDEPENDS:gsm = " \
 glibc \
"

URI_gsm-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gsm-devel-1.0.22-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gsm-devel}"
RDEPENDS:gsm-devel = " \
 gsm \
"

URI_gsm-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gsm-tools-1.0.22-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gsm-tools}"
RDEPENDS:gsm-tools = " \
 glibc \
 gsm \
"
