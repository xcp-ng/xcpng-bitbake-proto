
inherit dnf-bridge

PN = "socat"
PE = "0"
PV = "1.7.4.4"
PR = "8.el10"
PACKAGES = "socat"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/socat-1.7.4.4-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_socat = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/socat-1.7.4.4-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_socat}"
RDEPENDS:socat = " \
 glibc \
 openssl-libs \
 readline \
"
