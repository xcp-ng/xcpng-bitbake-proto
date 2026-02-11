
PN = "babel"
PE = "0"
PV = "2.13.1"
PR = "5.el10"
PACKAGES = "babel babel-doc python3-babel"


URI_babel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/babel-2.13.1-5.el10.noarch.rpm;unpack=0"
RDEPENDS:babel = "/usr/bin/python3 ( ) python3-babel ( =  2.13.1-5.el10)"
RPROVIDES:babel = "babel ( =  2.13.1-5.el10)"

URI_babel-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/babel-doc-2.13.1-5.el10.noarch.rpm;unpack=0"
RDEPENDS:babel-doc = ""
RPROVIDES:babel-doc = "babel-doc ( =  2.13.1-5.el10) python-babel-doc ( =  2.13.1-5.el10) python3-babel-doc ( =  2.13.1-5.el10) python3.12-babel-doc ( =  2.13.1-5.el10)"

URI_python3-babel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-babel-2.13.1-5.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-babel = "python3.12dist(setuptools) ( ) python(abi) ( =  3.12)"
RPROVIDES:python3-babel = "python3-babel ( =  2.13.1-5.el10) python-babel ( =  2.13.1-5.el10) python3.12-babel ( =  2.13.1-5.el10) python3.12dist(babel) ( =  2.13.1) python3dist(babel) ( =  2.13.1)"
