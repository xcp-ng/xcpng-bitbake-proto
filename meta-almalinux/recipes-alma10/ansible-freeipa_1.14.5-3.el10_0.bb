
inherit dnf-bridge

PN = "ansible-freeipa"
PE = "0"
PV = "1.14.5"
PR = "3.el10_0"
PACKAGES = "ansible-freeipa"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/ansible-freeipa-1.14.5-3.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_ansible-freeipa = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ansible-freeipa-1.14.5-3.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_ansible-freeipa}"
RDEPENDS:ansible-freeipa = " \
 python3 \
 ansible-core \
 bash \
"
