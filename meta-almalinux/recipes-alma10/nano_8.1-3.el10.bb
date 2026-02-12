
inherit dnf-bridge

PN = "nano"
PE = "0"
PV = "8.1"
PR = "3.el10"
PACKAGES = "nano"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/nano-8.1-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_nano = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/nano-8.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_nano}"
RDEPENDS:nano = " \
 glibc \
 file-libs \
 ncurses-libs \
"
