
PN = "dnf-plugins-core"
PE = "0"
PV = "4.7.0"
PR = "8.el10"
PACKAGES = "dnf-plugins-core python3-dnf-plugin-post-transaction-actions python3-dnf-plugin-pre-transaction-actions python3-dnf-plugin-versionlock python3-dnf-plugins-core yum-utils python3-dnf-plugin-leaves python3-dnf-plugin-modulesync python3-dnf-plugin-show-leaves"


URI_dnf-plugins-core = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dnf-plugins-core-4.7.0-8.el10.noarch.rpm;unpack=0"
RDEPENDS:dnf-plugins-core = " \
 python3-dnf-plugins-core \
"

URI_python3-dnf-plugin-post-transaction-actions = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-dnf-plugin-post-transaction-actions-4.7.0-8.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-dnf-plugin-post-transaction-actions = " \
 python3 \
 python3-dnf-plugins-core \
"

URI_python3-dnf-plugin-pre-transaction-actions = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-dnf-plugin-pre-transaction-actions-4.7.0-8.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-dnf-plugin-pre-transaction-actions = " \
 python3 \
 python3-dnf-plugins-core \
"

URI_python3-dnf-plugin-versionlock = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-dnf-plugin-versionlock-4.7.0-8.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-dnf-plugin-versionlock = " \
 python3 \
 python3-dnf-plugins-core \
"

URI_python3-dnf-plugins-core = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-dnf-plugins-core-4.7.0-8.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-dnf-plugins-core = " \
 python3 \
 python3-dateutil \
 python3-dbus \
 python3-dnf \
 python3-hawkey \
 python3-systemd \
"

URI_yum-utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/yum-utils-4.7.0-8.el10.noarch.rpm;unpack=0"
RDEPENDS:yum-utils = " \
 python3 \
 dnf-plugins-core \
 python3-dnf \
"

URI_python3-dnf-plugin-leaves = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-dnf-plugin-leaves-4.7.0-8.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-dnf-plugin-leaves = " \
 python3 \
 python3-dnf-plugins-core \
"

URI_python3-dnf-plugin-modulesync = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-dnf-plugin-modulesync-4.7.0-8.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-dnf-plugin-modulesync = " \
 python3 \
 python3-dnf-plugins-core \
 createrepo_c \
"

URI_python3-dnf-plugin-show-leaves = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-dnf-plugin-show-leaves-4.7.0-8.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-dnf-plugin-show-leaves = " \
 python3 \
 python3-dnf-plugins-core \
 python3-dnf-plugin-leaves \
"
