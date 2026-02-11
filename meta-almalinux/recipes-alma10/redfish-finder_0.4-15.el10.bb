
inherit dnf-bridge

PN = "redfish-finder"
PE = "0"
PV = "0.4"
PR = "15.el10"
PACKAGES = "redfish-finder"


URI_redfish-finder = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/redfish-finder-0.4-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:redfish-finder = " \
 python3 \
 NetworkManager \
 dmidecode \
 bash \
"
