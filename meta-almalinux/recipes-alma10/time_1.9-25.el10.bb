
inherit dnf-bridge

PN = "time"
PE = "0"
PV = "1.9"
PR = "25.el10"
PACKAGES = "time"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/time-1.9-25.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_time = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/time-1.9-25.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_time}"
RDEPENDS:time = " \
 glibc \
"
