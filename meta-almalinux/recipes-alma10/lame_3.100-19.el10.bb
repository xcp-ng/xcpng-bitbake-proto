
inherit dnf-bridge

PN = "lame"
PE = "0"
PV = "3.100"
PR = "19.el10"
PACKAGES = "lame lame-libs lame-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/lame-3.100-19.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_lame = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lame-3.100-19.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_lame}"
RDEPENDS:lame = " \
 glibc \
 lame-libs \
 ncurses-libs \
"

URI_lame-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lame-libs-3.100-19.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_lame-libs}"
RDEPENDS:lame-libs = " \
 glibc \
"

URI_lame-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/lame-devel-3.100-19.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_lame-devel}"
RDEPENDS:lame-devel = " \
 lame-libs \
"
