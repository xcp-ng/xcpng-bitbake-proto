
PN = "python-urllib3"
PE = "0"
PV = "1.26.19"
PR = "2.el10"
PACKAGES = "python3-urllib3"


URI_python3-urllib3 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-urllib3-1.26.19-2.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-urllib3 = "ca-certificates ( ) python3dist(idna) ( ) python(abi) ( =  3.12)"
RPROVIDES:python3-urllib3 = "bundled(python3dist(six)) ( =  1.16.0) python-urllib3 ( =  1.26.19-2.el10) python3-urllib3 ( =  1.26.19-2.el10) python3.12-urllib3 ( =  1.26.19-2.el10) python3.12dist(urllib3) ( =  1.26.19) python3dist(urllib3) ( =  1.26.19)"
