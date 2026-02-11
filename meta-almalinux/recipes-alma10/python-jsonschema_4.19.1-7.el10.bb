
PN = "python-jsonschema"
PE = "0"
PV = "4.19.1"
PR = "7.el10"
PACKAGES = "python3-jsonschema"


URI_python3-jsonschema = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-jsonschema-4.19.1-7.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-jsonschema = "/usr/bin/python3 ( ) python(abi) ( =  3.12) python3.12dist(attrs) ( >=  22.2) python3.12dist(jsonschema-specifications) ( >=  2023.3.6) python3.12dist(referencing) ( >=  0.28.4) python3.12dist(rpds-py) ( >=  0.7.1)"
RPROVIDES:python3-jsonschema = "python-jsonschema ( =  4.19.1-7.el10) python3-jsonschema ( =  4.19.1-7.el10) python3.12-jsonschema ( =  4.19.1-7.el10) python3.12dist(jsonschema) ( =  4.19.1) python3dist(jsonschema) ( =  4.19.1)"
