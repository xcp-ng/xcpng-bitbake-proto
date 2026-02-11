
PN = "python-ply"
PE = "0"
PV = "3.11"
PR = "25.el10"
PACKAGES = "python3-ply"


URI_python3-ply = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-ply-3.11-25.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-ply = "python(abi) ( =  3.12)"
RPROVIDES:python3-ply = "python3.12dist(ply) ( =  3.11) python-ply ( =  3.11-25.el10) python3-ply ( =  3.11-25.el10) python3.12-ply ( =  3.11-25.el10) python3dist(ply) ( =  3.11)"
