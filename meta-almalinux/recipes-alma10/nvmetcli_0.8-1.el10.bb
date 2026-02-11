
PN = "nvmetcli"
PE = "0"
PV = "0.8"
PR = "1.el10"
PACKAGES = "nvmetcli"


URI_nvmetcli = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/nvmetcli-0.8-1.el10.noarch.rpm;unpack=0"
RDEPENDS:nvmetcli = "/bin/sh ( ) systemd ( ) /usr/bin/python3 ( ) python3-configshell ( ) python3-kmod ( ) python(abi) ( =  3.12)"
RPROVIDES:nvmetcli = "nvmetcli ( =  0.8-1.el10) python3.12dist(nvmetcli) ( =  0.8) python3dist(nvmetcli) ( =  0.8)"
