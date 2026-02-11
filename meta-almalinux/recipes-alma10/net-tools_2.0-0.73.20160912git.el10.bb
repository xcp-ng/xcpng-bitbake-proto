
inherit dnf-bridge

PN = "net-tools"
PE = "0"
PV = "2.0"
PR = "0.73.20160912git.el10"
PACKAGES = "net-tools"


URI_net-tools = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/net-tools-2.0-0.73.20160912git.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:net-tools = " \
 glibc \
 libselinux \
 systemd \
 bash \
"
