
inherit dnf-bridge

PN = "mtools"
PE = "0"
PV = "4.0.43"
PR = "7.el10"
PACKAGES = "mtools"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/mtools-4.0.43-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_mtools = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/mtools-4.0.43-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mtools}"
RDEPENDS:mtools = " \
 glibc \
 bash \
 glibc-gconv-extra \
"
