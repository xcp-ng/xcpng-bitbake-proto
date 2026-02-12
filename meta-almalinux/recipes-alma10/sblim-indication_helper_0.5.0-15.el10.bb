
inherit dnf-bridge

PN = "sblim-indication_helper"
PE = "0"
PV = "0.5.0"
PR = "15.el10"
PACKAGES = "sblim-indication_helper sblim-indication_helper-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/sblim-indication_helper-0.5.0-15.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_sblim-indication_helper = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sblim-indication_helper-0.5.0-15.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_sblim-indication_helper}"
RDEPENDS:sblim-indication_helper = " \
 glibc \
"

URI_sblim-indication_helper-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sblim-indication_helper-devel-0.5.0-15.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_sblim-indication_helper-devel}"
RDEPENDS:sblim-indication_helper-devel = " \
 glibc-devel \
 sblim-indication_helper \
 sblim-cmpi-devel \
"
