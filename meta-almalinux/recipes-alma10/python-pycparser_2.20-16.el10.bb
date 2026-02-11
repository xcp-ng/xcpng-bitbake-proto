
PN = "python-pycparser"
PE = "0"
PV = "2.20"
PR = "16.el10"
PACKAGES = "python3-pycparser"


URI_python3-pycparser = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-pycparser-2.20-16.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-pycparser = "python(abi) ( =  3.12) python3.12dist(ply) ( =  3.11)"
RPROVIDES:python3-pycparser = "python-pycparser ( =  2.20-16.el10) python3-pycparser ( =  2.20-16.el10) python3.12-pycparser ( =  2.20-16.el10) python3.12dist(pycparser) ( =  2.20) python3dist(pycparser) ( =  2.20)"
