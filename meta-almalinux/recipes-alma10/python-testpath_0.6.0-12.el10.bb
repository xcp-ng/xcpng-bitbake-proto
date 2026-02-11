
PN = "python-testpath"
PE = "0"
PV = "0.6.0"
PR = "12.el10"
PACKAGES = "python-testpath-doc python3-testpath"


URI_python-testpath-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python-testpath-doc-0.6.0-12.el10.noarch.rpm;unpack=0"
RDEPENDS:python-testpath-doc = ""
RPROVIDES:python-testpath-doc = "python-testpath-doc ( =  0.6.0-12.el10)"

URI_python3-testpath = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-testpath-0.6.0-12.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-testpath = "python(abi) ( =  3.12)"
RPROVIDES:python3-testpath = "python-testpath ( =  0.6.0-12.el10) python3-testpath ( =  0.6.0-12.el10) python3.12-testpath ( =  0.6.0-12.el10) python3.12dist(testpath) ( =  0.6) python3dist(testpath) ( =  0.6)"
