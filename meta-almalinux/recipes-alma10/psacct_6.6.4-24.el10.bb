
inherit dnf-bridge

PN = "psacct"
PE = "0"
PV = "6.6.4"
PR = "24.el10"
PACKAGES = "psacct"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/psacct-6.6.4-24.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_psacct = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/psacct-6.6.4-24.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_psacct}"
RDEPENDS:psacct = " \
 glibc \
 coreutils \
 systemd \
 bash \
"
