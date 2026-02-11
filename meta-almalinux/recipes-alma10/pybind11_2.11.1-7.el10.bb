
PN = "pybind11"
PE = "0"
PV = "2.11.1"
PR = "7.el10"
PACKAGES = "pybind11-devel python3-pybind11"


URI_pybind11-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/pybind11-devel-2.11.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pybind11-devel = "/usr/bin/pkg-config ( ) /usr/bin/python3 ( ) cmake ( ) cmake-filesystem ( )"
RPROVIDES:pybind11-devel = "pybind11-devel(x86-64) ( =  2.11.1-7.el10) cmake(pybind11) ( =  2.11.1) pkgconfig(pybind11) ( =  2.11.1) pybind11-devel ( =  2.11.1-7.el10) pybind11-static ( =  2.11.1-7.el10)"

URI_python3-pybind11 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-pybind11-2.11.1-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-pybind11 = "python(abi) ( =  3.12) pybind11-devel(x86-64) ( =  2.11.1-7.el10)"
RPROVIDES:python3-pybind11 = "python-pybind11 ( =  2.11.1-7.el10) python3-pybind11 ( =  2.11.1-7.el10) python3-pybind11(x86-64) ( =  2.11.1-7.el10) python3.12-pybind11 ( =  2.11.1-7.el10) python3.12dist(pybind11) ( =  2.11.1) python3dist(pybind11) ( =  2.11.1)"
