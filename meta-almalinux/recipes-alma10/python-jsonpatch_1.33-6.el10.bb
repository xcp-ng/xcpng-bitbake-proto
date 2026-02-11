
PN = "python-jsonpatch"
PE = "0"
PV = "1.33"
PR = "6.el10"
PACKAGES = "python3-jsonpatch"


URI_python3-jsonpatch = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-jsonpatch-1.33-6.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-jsonpatch = "/usr/bin/python3 ( ) python3-jsonpointer ( ) python(abi) ( =  3.12) python3.12dist(jsonpointer) ( >=  1.9)"
RPROVIDES:python3-jsonpatch = "python-jsonpatch ( =  1.33-6.el10) python3-jsonpatch ( =  1.33-6.el10) python3.12-jsonpatch ( =  1.33-6.el10) python3.12dist(jsonpatch) ( =  1.33) python3dist(jsonpatch) ( =  1.33)"
