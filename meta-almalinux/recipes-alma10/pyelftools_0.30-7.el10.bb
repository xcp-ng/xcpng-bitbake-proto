
PN = "pyelftools"
PE = "0"
PV = "0.30"
PR = "7.el10"
PACKAGES = "python3-pyelftools"


URI_python3-pyelftools = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-pyelftools-0.30-7.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-pyelftools = "/usr/bin/python3 ( ) python(abi) ( =  3.12)"
RPROVIDES:python3-pyelftools = "bundled(python3-construct) ( =  2.6) python-pyelftools ( =  0.30-7.el10) python3-pyelftools ( =  0.30-7.el10) python3.12-pyelftools ( =  0.30-7.el10) python3.12dist(pyelftools) ( =  0.30) python3dist(pyelftools) ( =  0.30)"
