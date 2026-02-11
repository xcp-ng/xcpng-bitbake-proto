
PN = "pykickstart"
PE = "0"
PV = "3.52.8"
PR = "1.el10"
PACKAGES = "pykickstart python3-kickstart"


URI_pykickstart = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pykickstart-3.52.8-1.el10.noarch.rpm;unpack=0"
RDEPENDS:pykickstart = "/usr/bin/python3 ( ) python3-kickstart ( =  3.52.8-1.el10)"
RPROVIDES:pykickstart = "pykickstart ( =  3.52.8-1.el10)"

URI_python3-kickstart = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-kickstart-3.52.8-1.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-kickstart = "python3-requests ( ) python3.12dist(requests) ( ) python(abi) ( =  3.12)"
RPROVIDES:python3-kickstart = "python3-kickstart ( =  3.52.8-1.el10) python-kickstart ( =  3.52.8-1.el10) python3.12-kickstart ( =  3.52.8-1.el10) python3.12dist(pykickstart) ( =  3.52.8) python3dist(pykickstart) ( =  3.52.8)"
