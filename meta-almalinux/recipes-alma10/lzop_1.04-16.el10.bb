
inherit dnf-bridge

PN = "lzop"
PE = "0"
PV = "1.04"
PR = "16.el10"
PACKAGES = "lzop"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/lzop-1.04-16.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_lzop = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/lzop-1.04-16.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_lzop}"
RDEPENDS:lzop = " \
 glibc \
 lzo \
"
