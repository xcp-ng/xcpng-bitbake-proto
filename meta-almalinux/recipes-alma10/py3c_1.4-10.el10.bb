
PN = "py3c"
PE = "0"
PV = "1.4"
PR = "10.el10"
PACKAGES = "py3c-devel py3c-doc"


URI_py3c-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/py3c-devel-1.4-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:py3c-devel = "/usr/bin/pkg-config ( ) python3-devel ( )"
RPROVIDES:py3c-devel = "pkgconfig(py3c) ( =  1.4) py3c-devel ( =  1.4-10.el10) py3c-devel(x86-64) ( =  1.4-10.el10) py3c-static ( =  1.4-10.el10) py3c-static(x86-64) ( =  1.4-10.el10)"

URI_py3c-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/py3c-doc-1.4-10.el10.noarch.rpm;unpack=0"
RDEPENDS:py3c-doc = ""
RPROVIDES:py3c-doc = "py3c-doc ( =  1.4-10.el10)"
