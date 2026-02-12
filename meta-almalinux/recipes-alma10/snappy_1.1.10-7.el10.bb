
inherit dnf-bridge

PN = "snappy"
PE = "0"
PV = "1.1.10"
PR = "7.el10"
PACKAGES = "snappy snappy-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/snappy-1.1.10-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_snappy = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/snappy-1.1.10-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_snappy}"
RDEPENDS:snappy = " \
 glibc \
 libstdc++ \
"

URI_snappy-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/snappy-devel-1.1.10-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_snappy-devel}"
RDEPENDS:snappy-devel = " \
 snappy \
 cmake-filesystem \
 pkgconf-pkg-config \
"
