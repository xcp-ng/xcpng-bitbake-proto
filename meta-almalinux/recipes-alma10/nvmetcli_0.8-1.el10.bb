
PN = "nvmetcli"
PE = "0"
PV = "0.8"
PR = "1.el10"
PACKAGES = "nvmetcli"


URI_nvmetcli = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/nvmetcli-0.8-1.el10.noarch.rpm;unpack=0"
RDEPENDS:nvmetcli = " \
 python3 \
 systemd \
 python3-configshell \
 bash \
 python3-kmod \
"
