
inherit dnf-bridge

PN = "gzip"
PE = "0"
PV = "1.13"
PR = "3.el10"
PACKAGES = "gzip"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/gzip-1.13-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_gzip = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/gzip-1.13-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gzip}"
RDEPENDS:gzip = " \
 glibc \
 coreutils \
 bash \
"
