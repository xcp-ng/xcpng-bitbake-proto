
PN = "langtable"
PE = "0"
PV = "0.0.65"
PR = "4.el10"
PACKAGES = "langtable python3-langtable"


URI_langtable = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/langtable-0.0.65-4.el10.noarch.rpm;unpack=0"
RDEPENDS:langtable = ""
RPROVIDES:langtable = "langtable ( =  0.0.65-4.el10)"

URI_python3-langtable = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-langtable-0.0.65-4.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-langtable = "python(abi) ( =  3.12) langtable ( =  0.0.65-4.el10)"
RPROVIDES:python3-langtable = "langtable-data ( =  0.0.65-4.el10) python-langtable ( =  0.0.65-4.el10) python3-langtable ( =  0.0.65-4.el10) python3.12-langtable ( =  0.0.65-4.el10) python3.12dist(langtable) ( =  0.0.65) python3dist(langtable) ( =  0.0.65)"
