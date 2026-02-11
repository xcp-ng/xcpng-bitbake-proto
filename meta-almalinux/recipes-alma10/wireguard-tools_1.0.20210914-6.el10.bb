
inherit dnf-bridge

PN = "wireguard-tools"
PE = "0"
PV = "1.0.20210914"
PR = "6.el10"
PACKAGES = "wireguard-tools"


URI_wireguard-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/wireguard-tools-1.0.20210914-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:wireguard-tools = " \
 glibc \
 systemd \
 bash \
 systemd-resolved \
"
