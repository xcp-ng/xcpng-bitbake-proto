
inherit dnf-bridge

PN = "ansible-pcp"
PE = "0"
PV = "2.4.1"
PR = "1.el10"
PACKAGES = "ansible-pcp"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/ansible-pcp-2.4.1-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_ansible-pcp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ansible-pcp-2.4.1-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_ansible-pcp}"
RDEPENDS:ansible-pcp = " \
 ansible-core \
 bash \
"
