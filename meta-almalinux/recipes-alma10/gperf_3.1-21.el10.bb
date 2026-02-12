
inherit dnf-bridge

PN = "gperf"
PE = "0"
PV = "3.1"
PR = "21.el10"
PACKAGES = "gperf"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/gperf-3.1-21.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_gperf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gperf-3.1-21.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gperf}"
RDEPENDS:gperf = " \
 glibc \
 libgcc \
 libstdc++ \
"
