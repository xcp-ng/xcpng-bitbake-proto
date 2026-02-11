
PN = "targetcli"
PE = "0"
PV = "2.1.58"
PR = "3.el10"
PACKAGES = "targetcli"


URI_targetcli = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/targetcli-2.1.58-3.el10.noarch.rpm;unpack=0"
RDEPENDS:targetcli = "/usr/bin/python3 ( ) python3-gobject-base ( ) python3-six ( ) python3-dbus ( ) python3-rtslib ( ) target-restore ( ) python3-configshell ( ) python(abi) ( =  3.12)"
RPROVIDES:targetcli = "python3.12dist(targetcli-fb) ( =  2.1.58) python3dist(targetcli-fb) ( =  2.1.58) targetcli ( =  2.1.58-3.el10)"
