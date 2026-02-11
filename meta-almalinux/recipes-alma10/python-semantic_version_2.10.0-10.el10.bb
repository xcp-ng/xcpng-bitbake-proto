
PN = "python-semantic_version"
PE = "0"
PV = "2.10.0"
PR = "10.el10"
PACKAGES = "python3-semantic_version python-semantic_version-doc"


URI_python3-semantic_version = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-semantic_version-2.10.0-10.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-semantic_version = "python(abi) ( =  3.12)"
RPROVIDES:python3-semantic_version = "python-semantic_version ( =  2.10.0-10.el10) python3-semantic_version ( =  2.10.0-10.el10) python3.12-semantic_version ( =  2.10.0-10.el10) python3.12dist(semantic-version) ( =  2.10) python3dist(semantic-version) ( =  2.10)"

URI_python-semantic_version-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python-semantic_version-doc-2.10.0-10.el10.noarch.rpm;unpack=0"
RDEPENDS:python-semantic_version-doc = ""
RPROVIDES:python-semantic_version-doc = "python-semantic_version-doc ( =  2.10.0-10.el10)"
