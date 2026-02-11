
inherit dnf-bridge

PN = "mdadm"
PE = "0"
PV = "4.3"
PR = "5.el10"
PACKAGES = "mdadm"


URI_mdadm = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/mdadm-4.3-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mdadm = " \
 systemd \
 systemd-libs \
 bash \
 glibc \
 coreutils \
"
