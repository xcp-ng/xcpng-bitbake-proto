
PN = "CUnit"
PE = "0"
PV = "2.1.3"
PR = "34.el10"
PACKAGES = "CUnit CUnit-devel"


URI_CUnit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/CUnit-2.1.3-34.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:CUnit = "
 glibc
"

URI_CUnit-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/CUnit-devel-2.1.3-34.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:CUnit-devel = "
 CUnit
 pkgconf-pkg-config
"
