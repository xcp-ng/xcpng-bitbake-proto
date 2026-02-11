
inherit dnf-bridge

PN = "netlabel_tools"
PE = "0"
PV = "0.30.0"
PR = "20.el10"
PACKAGES = "netlabel_tools"


URI_netlabel_tools = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/netlabel_tools-0.30.0-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:netlabel_tools = " \
 glibc \
 systemd \
 bash \
 libnl3 \
"
