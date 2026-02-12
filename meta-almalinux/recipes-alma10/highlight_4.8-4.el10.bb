
inherit dnf-bridge

PN = "highlight"
PE = "0"
PV = "4.8"
PR = "4.el10"
PACKAGES = "highlight"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/highlight-4.8-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_highlight = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/highlight-4.8-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_highlight}"
RDEPENDS:highlight = " \
 lua-libs \
 libgcc \
 libstdc++ \
 bash \
 glibc \
"
