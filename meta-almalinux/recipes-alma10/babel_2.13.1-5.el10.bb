
PN = "babel"
PE = "0"
PV = "2.13.1"
PR = "5.el10"
PACKAGES = "babel babel-doc python3-babel"


URI_babel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/babel-2.13.1-5.el10.noarch.rpm;unpack=0"
RDEPENDS:babel = "
 python3
 python3-babel
"

URI_babel-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/babel-doc-2.13.1-5.el10.noarch.rpm;unpack=0"
RDEPENDS:babel-doc = ""

URI_python3-babel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-babel-2.13.1-5.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-babel = "
 python3-setuptools
 python3
"
