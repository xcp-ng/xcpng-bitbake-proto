
PN = "dnf-plugins-core"
PE = "0"
PV = "4.7.0"
PR = "8.el10"
PACKAGES = "dnf-plugins-core python3-dnf-plugin-post-transaction-actions python3-dnf-plugin-pre-transaction-actions python3-dnf-plugin-versionlock python3-dnf-plugins-core yum-utils python3-dnf-plugin-leaves python3-dnf-plugin-modulesync python3-dnf-plugin-show-leaves"


URI_dnf-plugins-core = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dnf-plugins-core-4.7.0-8.el10.noarch.rpm;unpack=0"
RDEPENDS:dnf-plugins-core = "python3-dnf-plugins-core ( =  4.7.0-8.el10)"
RPROVIDES:dnf-plugins-core = "dnf-command(builddep) ( ) dnf-command(changelog) ( ) dnf-command(config-manager) ( ) dnf-command(copr) ( ) dnf-command(debuginfo-install) ( ) dnf-command(download) ( ) dnf-command(groups-manager) ( ) dnf-command(offline-distrosync) ( ) dnf-command(offline-upgrade) ( ) dnf-command(repoclosure) ( ) dnf-command(repodiff) ( ) dnf-command(repograph) ( ) dnf-command(repomanage) ( ) dnf-command(reposync) ( ) dnf-command(system-upgrade) ( ) dnf-plugins-core ( =  4.7.0-8.el10) dnf-plugin-builddep ( =  4.7.0-8.el10) dnf-plugin-config-manager ( =  4.7.0-8.el10) dnf-plugin-debuginfo-install ( =  4.7.0-8.el10) dnf-plugin-download ( =  4.7.0-8.el10) dnf-plugin-generate_completion_cache ( =  4.7.0-8.el10) dnf-plugin-groups-manager ( =  4.7.0-8.el10) dnf-plugin-needs_restarting ( =  4.7.0-8.el10) dnf-plugin-repoclosure ( =  4.7.0-8.el10) dnf-plugin-repodiff ( =  4.7.0-8.el10) dnf-plugin-repograph ( =  4.7.0-8.el10) dnf-plugin-repomanage ( =  4.7.0-8.el10) dnf-plugin-reposync ( =  4.7.0-8.el10) dnf-plugin-system-upgrade ( =  4.7.0-8.el10) dnf-plugins-extras-repoclosure ( =  4.7.0-8.el10) dnf-plugins-extras-repograph ( =  4.7.0-8.el10) dnf-plugins-extras-repomanage ( =  4.7.0-8.el10) yum-plugin-auto-update-debug-info ( =  4.7.0-8.el10) yum-plugin-changelog ( =  4.7.0-8.el10) yum-plugin-copr ( =  4.7.0-8.el10)"

URI_python3-dnf-plugin-post-transaction-actions = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-dnf-plugin-post-transaction-actions-4.7.0-8.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-dnf-plugin-post-transaction-actions = "python(abi) ( =  3.12) python3-dnf-plugins-core ( =  4.7.0-8.el10)"
RPROVIDES:python3-dnf-plugin-post-transaction-actions = "config(python3-dnf-plugin-post-transaction-actions) ( =  4.7.0-8.el10) dnf-plugin-post-transaction-actions ( =  4.7.0-8.el10) python-dnf-plugin-post-transaction-actions ( =  4.7.0-8.el10) python3-dnf-plugin-post-transaction-actions ( =  4.7.0-8.el10) python3.12-dnf-plugin-post-transaction-actions ( =  4.7.0-8.el10)"

URI_python3-dnf-plugin-pre-transaction-actions = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-dnf-plugin-pre-transaction-actions-4.7.0-8.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-dnf-plugin-pre-transaction-actions = "python(abi) ( =  3.12) python3-dnf-plugins-core ( =  4.7.0-8.el10)"
RPROVIDES:python3-dnf-plugin-pre-transaction-actions = "config(python3-dnf-plugin-pre-transaction-actions) ( =  4.7.0-8.el10) dnf-plugin-pre-transaction-actions ( =  4.7.0-8.el10) python-dnf-plugin-pre-transaction-actions ( =  4.7.0-8.el10) python3-dnf-plugin-pre-transaction-actions ( =  4.7.0-8.el10) python3.12-dnf-plugin-pre-transaction-actions ( =  4.7.0-8.el10)"

URI_python3-dnf-plugin-versionlock = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-dnf-plugin-versionlock-4.7.0-8.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-dnf-plugin-versionlock = "python(abi) ( =  3.12) python3-dnf-plugins-core ( =  4.7.0-8.el10)"
RPROVIDES:python3-dnf-plugin-versionlock = "dnf-command(versionlock) ( ) config(python3-dnf-plugin-versionlock) ( =  4.7.0-8.el10) dnf-plugin-versionlock ( =  4.7.0-8.el10) dnf-plugins-extras-versionlock ( =  4.7.0-8.el10) python-dnf-plugin-versionlock ( =  4.7.0-8.el10) python3-dnf-plugin-versionlock ( =  4.7.0-8.el10) python3-dnf-plugins-extras-versionlock ( =  4.7.0-8.el10) python3.12-dnf-plugin-versionlock ( =  4.7.0-8.el10) yum-plugin-versionlock ( =  4.7.0-8.el10)"

URI_python3-dnf-plugins-core = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-dnf-plugins-core-4.7.0-8.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-dnf-plugins-core = "python3-dbus ( ) python3-dateutil ( ) python3-systemd ( ) python(abi) ( =  3.12) python3-dnf ( >=  4.19.0) python3-hawkey ( >=  0.73.0)"
RPROVIDES:python3-dnf-plugins-core = "python3-dnf-plugins-core ( =  4.7.0-8.el10) config(python3-dnf-plugins-core) ( =  4.7.0-8.el10) python-dnf-plugins-core ( =  4.7.0-8.el10) python3-dnf-plugin-system-upgrade ( =  4.7.0-8.el10) python3-dnf-plugins-extras-repoclosure ( =  4.7.0-8.el10) python3-dnf-plugins-extras-repograph ( =  4.7.0-8.el10) python3-dnf-plugins-extras-repomanage ( =  4.7.0-8.el10) python3.12-dnf-plugins-core ( =  4.7.0-8.el10)"

URI_yum-utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/yum-utils-4.7.0-8.el10.noarch.rpm;unpack=0"
RDEPENDS:yum-utils = "/usr/bin/python3 ( ) dnf-plugins-core ( =  4.7.0-8.el10) python3-dnf ( >=  4.19.0)"
RPROVIDES:yum-utils = "dnf-utils ( =  4.7.0-8.el10) yum-utils ( =  4.7.0-8.el10)"

URI_python3-dnf-plugin-leaves = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-dnf-plugin-leaves-4.7.0-8.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-dnf-plugin-leaves = "python(abi) ( =  3.12) python3-dnf-plugins-core ( =  4.7.0-8.el10)"
RPROVIDES:python3-dnf-plugin-leaves = "dnf-command(leaves) ( ) python3-dnf-plugin-leaves ( =  4.7.0-8.el10) dnf-plugin-leaves ( =  4.7.0-8.el10) dnf-plugins-extras-leaves ( =  4.7.0-8.el10) python-dnf-plugin-leaves ( =  4.7.0-8.el10) python3-dnf-plugins-extras-leaves ( =  4.7.0-8.el10) python3.12-dnf-plugin-leaves ( =  4.7.0-8.el10)"

URI_python3-dnf-plugin-modulesync = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-dnf-plugin-modulesync-4.7.0-8.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-dnf-plugin-modulesync = "python(abi) ( =  3.12) python3-dnf-plugins-core ( =  4.7.0-8.el10) createrepo_c ( >=  0.17.4)"
RPROVIDES:python3-dnf-plugin-modulesync = "dnf-command(modulesync) ( ) dnf-plugin-modulesync ( =  4.7.0-8.el10) python-dnf-plugin-modulesync ( =  4.7.0-8.el10) python3-dnf-plugin-modulesync ( =  4.7.0-8.el10) python3.12-dnf-plugin-modulesync ( =  4.7.0-8.el10)"

URI_python3-dnf-plugin-show-leaves = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-dnf-plugin-show-leaves-4.7.0-8.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-dnf-plugin-show-leaves = "python(abi) ( =  3.12) python3-dnf-plugins-core ( =  4.7.0-8.el10) python3-dnf-plugin-leaves ( =  4.7.0-8.el10)"
RPROVIDES:python3-dnf-plugin-show-leaves = "dnf-command(show-leaves) ( ) dnf-plugin-show-leaves ( =  4.7.0-8.el10) dnf-plugins-extras-show-leaves ( =  4.7.0-8.el10) python-dnf-plugin-show-leaves ( =  4.7.0-8.el10) python3-dnf-plugin-show-leaves ( =  4.7.0-8.el10) python3-dnf-plugins-extras-show-leaves ( =  4.7.0-8.el10) python3.12-dnf-plugin-show-leaves ( =  4.7.0-8.el10)"
