
inherit dnf-bridge

PN = "libutempter"
PE = "0"
PV = "1.2.1"
PR = "15.el10"
PACKAGES = "libutempter libutempter-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/libutempter-1.2.1-15.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libutempter = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libutempter-1.2.1-15.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libutempter}"
RDEPENDS:libutempter = " \
 glibc \
 shadow-utils \
 bash \
"

URI_libutempter-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libutempter-devel-1.2.1-15.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libutempter-devel}"
RDEPENDS:libutempter-devel = " \
 libutempter \
"
