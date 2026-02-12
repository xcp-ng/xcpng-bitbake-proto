
inherit dnf-bridge

PN = "opus"
PE = "0"
PV = "1.4"
PR = "6.el10"
PACKAGES = "opus opus-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/opus-1.4-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_opus = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/opus-1.4-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_opus}"
RDEPENDS:opus = " \
 glibc \
"

URI_opus-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/opus-devel-1.4-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_opus-devel}"
RDEPENDS:opus-devel = " \
 libogg-devel \
 opus \
 pkgconf-pkg-config \
"
