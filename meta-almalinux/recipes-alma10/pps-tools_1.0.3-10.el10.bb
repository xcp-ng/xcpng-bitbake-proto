
PN = "pps-tools"
PE = "0"
PV = "1.0.3"
PR = "10.el10"
PACKAGES = "pps-tools-devel pps-tools"


URI_pps-tools-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/pps-tools-devel-1.0.3-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pps-tools-devel = ""

URI_pps-tools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pps-tools-1.0.3-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pps-tools = " \
 glibc \
 bash \
"
