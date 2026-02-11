
inherit dnf-bridge

PN = "ps_mem"
PE = "0"
PV = "3.14"
PR = "9.el10"
PACKAGES = "ps_mem"


URI_ps_mem = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ps_mem-3.14-9.el10.noarch.rpm;unpack=0"
RDEPENDS:ps_mem = " \
 python3 \
"
