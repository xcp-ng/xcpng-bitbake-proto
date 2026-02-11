
inherit dnf-bridge

PN = "at"
PE = "0"
PV = "3.2.5"
PR = "13.el10_0"
PACKAGES = "at"


URI_at = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/at-3.2.5-13.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:at = " \
 glibc \
 libselinux \
 systemd \
 bash \
"
