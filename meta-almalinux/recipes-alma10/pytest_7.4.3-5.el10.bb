
PN = "pytest"
PE = "0"
PV = "7.4.3"
PR = "5.el10"
PACKAGES = "python3-pytest"


URI_python3-pytest = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-pytest-7.4.3-5.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-pytest = "/usr/bin/python3 ( ) python3.12dist(packaging) ( ) python3.12dist(iniconfig) ( ) python(abi) ( =  3.12) python3.12dist(pluggy) ( with  (REL))"
RPROVIDES:python3-pytest = "pytest ( =  7.4.3-5.el10) python-pytest ( =  7.4.3-5.el10) python3-pytest ( =  7.4.3-5.el10) python3.12-pytest ( =  7.4.3-5.el10) python3.12dist(pytest) ( =  7.4.3) python3dist(pytest) ( =  7.4.3)"
