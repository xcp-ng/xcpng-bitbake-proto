
inherit dnf-bridge

PN = "unzip"
PE = "0"
PV = "6.0"
PR = "68.el10"
PACKAGES = "unzip"


URI_unzip = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/unzip-6.0-68.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:unzip = " \
 glibc \
 bash \
 bzip2-libs \
"
