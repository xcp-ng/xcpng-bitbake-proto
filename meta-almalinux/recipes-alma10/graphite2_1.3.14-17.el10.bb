
inherit dnf-bridge

PN = "graphite2"
PE = "0"
PV = "1.3.14"
PR = "17.el10"
PACKAGES = "graphite2 graphite2-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/graphite2-1.3.14-17.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_graphite2 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/graphite2-1.3.14-17.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_graphite2}"
RDEPENDS:graphite2 = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_graphite2-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/graphite2-devel-1.3.14-17.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_graphite2-devel}"
RDEPENDS:graphite2-devel = " \
 graphite2 \
 pkgconf-pkg-config \
"
