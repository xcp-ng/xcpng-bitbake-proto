
PN = "udica"
PE = "0"
PV = "0.2.8"
PR = "6.el10"
PACKAGES = "udica"


URI_udica = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/udica-0.2.8-6.el10.noarch.rpm;unpack=0"
RDEPENDS:udica = "/usr/bin/python3 ( ) python3 ( ) python3-libselinux ( ) python3-libsemanage ( ) python(abi) ( =  3.12) container-selinux ( >=  2.168.0-2)"
RPROVIDES:udica = "python3.12dist(udica) ( =  0.2.8) python3dist(udica) ( =  0.2.8) udica ( =  0.2.8-6.el10)"
