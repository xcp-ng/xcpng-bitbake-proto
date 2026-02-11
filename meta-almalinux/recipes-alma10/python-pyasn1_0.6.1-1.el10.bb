
PN = "python-pyasn1"
PE = "0"
PV = "0.6.1"
PR = "1.el10"
PACKAGES = "python3-pyasn1 python3-pyasn1-modules python-pyasn1-doc"


URI_python3-pyasn1 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-pyasn1-0.6.1-1.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-pyasn1 = "python(abi) ( =  3.12)"
RPROVIDES:python3-pyasn1 = "python-pyasn1 ( =  0.6.1-1.el10) python3-pyasn1 ( =  0.6.1-1.el10) python3.12-pyasn1 ( =  0.6.1-1.el10) python3.12dist(pyasn1) ( =  0.6.1) python3dist(pyasn1) ( =  0.6.1)"

URI_python3-pyasn1-modules = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-pyasn1-modules-0.6.1-1.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-pyasn1-modules = "python(abi) ( =  3.12) python3.12dist(pyasn1) ( with  (REL)) python3-pyasn1 ( >=  0.4.7) python3-pyasn1 ( <  0.7.0)"
RPROVIDES:python3-pyasn1-modules = "python-modules ( =  0.6.1-1.el10) python-pyasn1-modules ( =  0.6.1-1.el10) python3-pyasn1-modules ( =  0.6.1-1.el10) python3.12-modules ( =  0.6.1-1.el10) python3.12-pyasn1-modules ( =  0.6.1-1.el10) python3.12dist(pyasn1-modules) ( =  0.4.1) python3dist(pyasn1-modules) ( =  0.4.1)"

URI_python-pyasn1-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python-pyasn1-doc-0.6.1-1.el10.noarch.rpm;unpack=0"
RDEPENDS:python-pyasn1-doc = ""
RPROVIDES:python-pyasn1-doc = "python-pyasn1-doc ( =  0.6.1-1.el10)"
