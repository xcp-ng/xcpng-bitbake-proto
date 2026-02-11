
inherit dnf-bridge

PN = "irqbalance"
PE = "2"
PV = "1.9.4"
PR = "2.el10"
PACKAGES = "irqbalance"


URI_irqbalance = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/irqbalance-1.9.4-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:irqbalance = " \
 systemd-libs \
 numactl-libs \
 libcap-ng \
 bash \
 glib2 \
 ncurses-libs \
 glibc \
"
