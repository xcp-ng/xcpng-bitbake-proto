
inherit dnf-bridge

PN = "libell"
PE = "0"
PV = "0.62"
PR = "3.el10"
PACKAGES = "libell libell-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libell-0.62-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libell = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libell-0.62-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libell}"
RDEPENDS:libell = " \
 glibc \
 libgcc \
"

URI_libell-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libell-devel-0.62-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libell-devel}"
RDEPENDS:libell-devel = " \
 libell \
 pkgconf-pkg-config \
"
