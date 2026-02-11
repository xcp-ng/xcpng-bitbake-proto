
PN = "sblim-cmpi-base"
PE = "0"
PV = "1.6.4"
PR = "29.el10"
PACKAGES = "sblim-cmpi-base sblim-cmpi-base-devel"


URI_sblim-cmpi-base = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sblim-cmpi-base-1.6.4-29.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sblim-cmpi-base = "
 glibc
 sblim-sfcb
 sblim-indication_helper
 bash
"

URI_sblim-cmpi-base-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sblim-cmpi-base-devel-1.6.4-29.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sblim-cmpi-base-devel = "
 sblim-cmpi-base
"
