
inherit dnf-bridge

PN = "dwz"
PE = "0"
PV = "0.15"
PR = "7.el10"
PACKAGES = "dwz"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/dwz-0.15-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_dwz = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dwz-0.15-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dwz}"
RDEPENDS:dwz = " \
 glibc \
 elfutils-libelf \
"
