
PN = "python-pdm-backend"
PE = "0"
PV = "2.1.8"
PR = "1.el10"
PACKAGES = "python3-pdm-backend"


URI_python3-pdm-backend = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-pdm-backend-2.1.8-1.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-pdm-backend = "python3-pyproject-metadata ( ) python3-tomli-w ( ) python3-packaging ( ) python(abi) ( =  3.12)"
RPROVIDES:python3-pdm-backend = "python-pdm-backend ( =  2.1.8-1.el10) python3-pdm-backend ( =  2.1.8-1.el10) python3.12-pdm-backend ( =  2.1.8-1.el10) python3.12dist(pdm-backend) ( =  2.1.8) python3dist(pdm-backend) ( =  2.1.8)"
