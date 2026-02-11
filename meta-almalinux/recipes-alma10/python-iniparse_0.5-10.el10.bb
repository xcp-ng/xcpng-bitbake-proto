
PN = "python-iniparse"
PE = "0"
PV = "0.5"
PR = "10.el10"
PACKAGES = "python3-iniparse"


URI_python3-iniparse = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-iniparse-0.5-10.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-iniparse = "python3.12dist(six) ( ) python(abi) ( =  3.12)"
RPROVIDES:python3-iniparse = "python-iniparse ( =  0.5-10.el10) python3-iniparse ( =  0.5-10.el10) python3.12-iniparse ( =  0.5-10.el10) python3.12dist(iniparse) ( =  0.5) python3dist(iniparse) ( =  0.5)"
