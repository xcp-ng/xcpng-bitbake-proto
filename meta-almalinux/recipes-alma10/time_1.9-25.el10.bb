
inherit dnf-bridge

PN = "time"
PE = "0"
PV = "1.9"
PR = "25.el10"
PACKAGES = "time"


URI_time = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/time-1.9-25.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:time = " \
 glibc \
"
