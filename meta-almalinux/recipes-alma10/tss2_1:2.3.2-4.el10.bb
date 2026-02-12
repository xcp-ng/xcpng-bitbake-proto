
inherit dnf-bridge

PN = "tss2"
PE = "1"
PV = "2.3.2"
PR = "4.el10"
PACKAGES = "tss2 tss2-devel"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/tss2-2.3.2-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_tss2 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/tss2-2.3.2-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_tss2}"
RDEPENDS:tss2 = " \
 glibc \
 openssl \
 openssl-libs \
"

URI_tss2-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/tss2-devel-2.3.2-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_tss2-devel}"
RDEPENDS:tss2-devel = " \
 tss2 \
"
