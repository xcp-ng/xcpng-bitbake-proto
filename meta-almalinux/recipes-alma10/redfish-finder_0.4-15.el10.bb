
PN = "redfish-finder"
PE = "0"
PV = "0.4"
PR = "15.el10"
PACKAGES = "redfish-finder"


URI_redfish-finder = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/redfish-finder-0.4-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:redfish-finder = "/bin/sh ( ) /usr/bin/python3 ( ) NetworkManager ( ) python3 ( ) dmidecode ( )"
RPROVIDES:redfish-finder = "redfish-finder ( =  0.4-15.el10) redfish-finder(x86-64) ( =  0.4-15.el10)"
