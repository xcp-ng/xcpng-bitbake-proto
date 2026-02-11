
PN = "python-yubico"
PE = "0"
PV = "1.3.3"
PR = "17.el10"
PACKAGES = "python3-yubico"


URI_python3-yubico = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-yubico-1.3.3-17.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-yubico = "python3.12dist(pyusb) ( ) python(abi) ( =  3.12)"
RPROVIDES:python3-yubico = "python-yubico ( =  1.3.3-17.el10) python3-yubico ( =  1.3.3-17.el10) python3.12-yubico ( =  1.3.3-17.el10) python3.12dist(python-yubico) ( =  1.3.3) python3dist(python-yubico) ( =  1.3.3)"
