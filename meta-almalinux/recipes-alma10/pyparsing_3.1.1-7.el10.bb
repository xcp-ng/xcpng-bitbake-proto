
PN = "pyparsing"
PE = "0"
PV = "3.1.1"
PR = "7.el10"
PACKAGES = "python3-pyparsing pyparsing-doc"


URI_python3-pyparsing = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-pyparsing-3.1.1-7.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-pyparsing = "python(abi) ( =  3.12)"
RPROVIDES:python3-pyparsing = "python-pyparsing ( =  3.1.1-7.el10) python3-pyparsing ( =  3.1.1-7.el10) python3.12-pyparsing ( =  3.1.1-7.el10) python3.12dist(pyparsing) ( =  3.1.1) python3dist(pyparsing) ( =  3.1.1)"

URI_pyparsing-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/pyparsing-doc-3.1.1-7.el10.noarch.rpm;unpack=0"
RDEPENDS:pyparsing-doc = ""
RPROVIDES:pyparsing-doc = "pyparsing-doc ( =  3.1.1-7.el10)"
