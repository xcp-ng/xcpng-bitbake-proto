
inherit dnf-bridge

PN = "softhsm"
PE = "0"
PV = "2.6.1"
PR = "16.el10_0"
PACKAGES = "softhsm softhsm-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/softhsm-2.6.1-16.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_softhsm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/softhsm-2.6.1-16.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_softhsm}"
RDEPENDS:softhsm = " \
 shadow-utils \
 libgcc \
 openssl-libs \
 p11-kit \
 sqlite-libs \
 libstdc++ \
 bash \
 glibc \
"

URI_softhsm-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/softhsm-devel-2.6.1-16.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_softhsm-devel}"
RDEPENDS:softhsm-devel = " \
 softhsm \
 openssl-devel \
 sqlite-devel \
"
