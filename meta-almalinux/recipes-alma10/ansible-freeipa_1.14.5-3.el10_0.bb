
inherit dnf-bridge

PN = "ansible-freeipa"
PE = "0"
PV = "1.14.5"
PR = "3.el10_0"
PACKAGES = "ansible-freeipa"


URI_ansible-freeipa = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ansible-freeipa-1.14.5-3.el10_0.noarch.rpm;unpack=0"
RDEPENDS:ansible-freeipa = " \
 python3 \
 ansible-core \
 bash \
"
