
PN = "Judy"
PE = "0"
PV = "1.0.5"
PR = "38.el10"
PACKAGES = "Judy Judy-devel"


URI_Judy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/Judy-1.0.5-38.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:Judy = " \
 glibc \
"

URI_Judy-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/Judy-devel-1.0.5-38.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:Judy-devel = " \
 Judy \
"
