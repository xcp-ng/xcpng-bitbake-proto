
inherit dnf-bridge

PN = "rhel-system-roles"
PE = "0"
PV = "1.95.7"
PR = "0.1.el10_0"
PACKAGES = "rhel-system-roles"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/rhel-system-roles-1.95.7-0.1.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_rhel-system-roles = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rhel-system-roles-1.95.7-0.1.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_rhel-system-roles}"
RDEPENDS:rhel-system-roles = " \
 ansible-core \
 coreutils \
 bash \
 python-unversioned-command \
"
