
inherit dnf-bridge

PN = "ansible-collection-microsoft-sql"
PE = "0"
PV = "2.5.2"
PR = "1.el10"
PACKAGES = "ansible-collection-microsoft-sql"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/ansible-collection-microsoft-sql-2.5.2-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_ansible-collection-microsoft-sql = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ansible-collection-microsoft-sql-2.5.2-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_ansible-collection-microsoft-sql}"
RDEPENDS:ansible-collection-microsoft-sql = " \
 ansible-core \
 rhel-system-roles \
 bash \
"
