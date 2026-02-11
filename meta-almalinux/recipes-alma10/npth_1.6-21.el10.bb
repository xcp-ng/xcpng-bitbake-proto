
PN = "npth"
PE = "0"
PV = "1.6"
PR = "21.el10"
PACKAGES = "npth npth-devel"


URI_npth = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/npth-1.6-21.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:npth = "
 glibc
"

URI_npth-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/npth-devel-1.6-21.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:npth-devel = "
 bash
 npth
"
