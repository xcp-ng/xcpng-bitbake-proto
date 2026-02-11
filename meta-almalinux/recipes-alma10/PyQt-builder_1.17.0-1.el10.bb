
PN = "PyQt-builder"
PE = "0"
PV = "1.17.0"
PR = "1.el10"
PACKAGES = "PyQt-builder"


URI_PyQt-builder = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/PyQt-builder-1.17.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:PyQt-builder = "/usr/bin/python3 ( ) python3.12dist(packaging) ( ) python(abi) ( =  3.12) python3.12dist(sip) ( with  (REL))"
RPROVIDES:PyQt-builder = "PyQt-builder ( =  1.17.0-1.el10) python3.12dist(pyqt-builder) ( =  1.17) python3dist(pyqt-builder) ( =  1.17)"
