
PN = "orca"
PE = "0"
PV = "46.2"
PR = "2.el10"
PACKAGES = "orca"


URI_orca = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/orca-46.2-2.el10.noarch.rpm;unpack=0"
RDEPENDS:orca = "/usr/bin/python3 ( ) speech-dispatcher ( ) python3-pyatspi ( ) libwnck3 ( ) python3-brlapi ( ) python3-louis ( ) python3-speechd ( ) python(abi) ( =  3.12)"
RPROVIDES:orca = "orca ( =  46.2-2.el10)"
