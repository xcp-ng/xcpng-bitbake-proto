
inherit dnf-bridge

PN = "c-ares"
PE = "0"
PV = "1.25.0"
PR = "6.el10"
PACKAGES = "c-ares c-ares-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/c-ares-1.25.0-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_c-ares = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/c-ares-1.25.0-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_c-ares}"
RDEPENDS:c-ares = " \
 glibc \
"

URI_c-ares-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/c-ares-devel-1.25.0-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_c-ares-devel}"
RDEPENDS:c-ares-devel = " \
 cmake-filesystem \
 pkgconf-pkg-config \
 c-ares \
"
