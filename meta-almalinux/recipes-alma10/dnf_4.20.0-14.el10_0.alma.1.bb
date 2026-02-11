
PN = "dnf"
PE = "0"
PV = "4.20.0"
PR = "14.el10_0.alma.1"
PACKAGES = "dnf dnf-automatic dnf-data python3-dnf yum dnf-bootc"


URI_dnf = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dnf-4.20.0-14.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:dnf = "/bin/sh ( ) coreutils ( ) python3-dnf ( =  4.20.0-14.el10_0.alma.1)"
RPROVIDES:dnf = "dnf ( =  4.20.0-14.el10_0.alma.1)"

URI_dnf-automatic = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dnf-automatic-4.20.0-14.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:dnf-automatic = "/bin/sh ( ) systemd ( ) /usr/bin/python3 ( ) python(abi) ( =  3.12) python3-dnf ( =  4.20.0-14.el10_0.alma.1)"
RPROVIDES:dnf-automatic = "config(dnf-automatic) ( =  4.20.0-14.el10_0.alma.1) dnf-automatic ( =  4.20.0-14.el10_0.alma.1)"

URI_dnf-data = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dnf-data-4.20.0-14.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:dnf-data = ""
RPROVIDES:dnf-data = "dnf-data ( =  4.20.0-14.el10_0.alma.1) config(dnf-data) ( =  4.20.0-14.el10_0.alma.1) dnf-conf ( =  4.20.0-14.el10_0.alma.1)"

URI_python3-dnf = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-dnf-4.20.0-14.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:python3-dnf = "/usr/bin/python3 ( ) python3-libdnf ( ) python(abi) ( =  3.12) dnf-data ( =  4.20.0-14.el10_0.alma.1) libmodulemd ( >=  2.9.3) python3-hawkey ( >=  0.73.1-8) python3-libcomps ( >=  0.1.8) python3-libdnf ( >=  0.73.1-8) python3-rpm ( >=  4.14.0)"
RPROVIDES:python3-dnf = "dnf-command(alias) ( ) dnf-command(autoremove) ( ) dnf-command(check-update) ( ) dnf-command(clean) ( ) dnf-command(distro-sync) ( ) dnf-command(downgrade) ( ) dnf-command(group) ( ) dnf-command(history) ( ) dnf-command(info) ( ) dnf-command(install) ( ) dnf-command(list) ( ) dnf-command(makecache) ( ) dnf-command(mark) ( ) dnf-command(provides) ( ) dnf-command(reinstall) ( ) dnf-command(remove) ( ) dnf-command(repolist) ( ) dnf-command(repoquery) ( ) dnf-command(repository-packages) ( ) dnf-command(search) ( ) dnf-command(updateinfo) ( ) dnf-command(upgrade) ( ) dnf-command(upgrade-to) ( ) python3-dnf ( =  4.20.0-14.el10_0.alma.1) python3.12dist(dnf) ( =  4.20) python3dist(dnf) ( =  4.20) python-dnf ( =  4.20.0-14.el10_0.alma.1) python3.12-dnf ( =  4.20.0-14.el10_0.alma.1)"

URI_yum = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/yum-4.20.0-14.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:yum = "dnf ( =  4.20.0-14.el10_0.alma.1)"
RPROVIDES:yum = "config(yum) ( =  4.20.0-14.el10_0.alma.1) dnf-yum ( =  4.20.0-14.el10_0.alma.1) yum ( =  4.20.0-14.el10_0.alma.1)"

URI_dnf-bootc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dnf-bootc-4.20.0-14.el10_0.alma.1.noarch.rpm;unpack=0"
RDEPENDS:dnf-bootc = "python3-gobject-base ( ) ostree ( ) ostree-libs ( ) util-linux-core ( ) python3-dnf ( =  4.20.0-14.el10_0.alma.1)"
RPROVIDES:dnf-bootc = "dnf-bootc ( =  4.20.0-14.el10_0.alma.1)"
