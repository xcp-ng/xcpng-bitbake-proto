
PN = "python-jsonschema-specifications"
PE = "0"
PV = "2023.11.2"
PR = "6.el10"
PACKAGES = "python3-jsonschema-specifications python3-jsonschema-specifications-tests"


URI_python3-jsonschema-specifications = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-jsonschema-specifications-2023.11.2-6.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-jsonschema-specifications = "python(abi) ( =  3.12) python3.12dist(referencing) ( >=  0.31)"
RPROVIDES:python3-jsonschema-specifications = "python-jsonschema-specifications ( =  2023.11.2-6.el10) python3-jsonschema-specifications ( =  2023.11.2-6.el10) python3.12-jsonschema-specifications ( =  2023.11.2-6.el10) python3.12dist(jsonschema-specifications) ( =  2023.11.2) python3dist(jsonschema-specifications) ( =  2023.11.2)"

URI_python3-jsonschema-specifications-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-jsonschema-specifications-tests-2023.11.2-6.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-jsonschema-specifications-tests = "python3dist(pytest) ( ) python(abi) ( =  3.12) python3-jsonschema-specifications ( =  2023.11.2-6.el10)"
RPROVIDES:python3-jsonschema-specifications-tests = "python-jsonschema-specifications-tests ( =  2023.11.2-6.el10) python3-jsonschema-specifications-tests ( =  2023.11.2-6.el10) python3.12-jsonschema-specifications-tests ( =  2023.11.2-6.el10)"
