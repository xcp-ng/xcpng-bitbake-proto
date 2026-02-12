
inherit dnf-bridge

PN = "dwarves"
PE = "0"
PV = "1.27"
PR = "3.el10"
PACKAGES = "dwarves libdwarves1 libdwarves1-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/dwarves-1.27-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_dwarves = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dwarves-1.27-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dwarves}"
RDEPENDS:dwarves = " \
 python3 \
 libdwarves1 \
 elfutils-libelf \
 bash \
 glibc \
"

URI_libdwarves1 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libdwarves1-1.27-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libdwarves1}"
RDEPENDS:libdwarves1 = " \
 glibc \
 zlib-ng-compat \
 elfutils-libelf \
 elfutils-libs \
"

URI_libdwarves1-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libdwarves1-devel-1.27-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libdwarves1-devel}"
RDEPENDS:libdwarves1-devel = " \
 libdwarves1 \
"
