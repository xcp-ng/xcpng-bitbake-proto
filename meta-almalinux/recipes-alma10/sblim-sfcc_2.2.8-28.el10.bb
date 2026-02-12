
inherit dnf-bridge

PN = "sblim-sfcc"
PE = "0"
PV = "2.2.8"
PR = "28.el10"
PACKAGES = "sblim-sfcc sblim-sfcc-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/sblim-sfcc-2.2.8-28.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_sblim-sfcc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sblim-sfcc-2.2.8-28.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_sblim-sfcc}"
RDEPENDS:sblim-sfcc = " \
 glibc \
 libcurl \
"

URI_sblim-sfcc-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/sblim-sfcc-devel-2.2.8-28.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_sblim-sfcc-devel}"
RDEPENDS:sblim-sfcc-devel = " \
 sblim-sfcc \
"
