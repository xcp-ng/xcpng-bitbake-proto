
PN = "python-pkgconfig"
PE = "0"
PV = "1.5.5"
PR = "10.el10"
PACKAGES = "python3-pkgconfig"


URI_python3-pkgconfig = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-pkgconfig-1.5.5-10.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-pkgconfig = "/usr/bin/pkg-config ( ) python(abi) ( =  3.12)"
RPROVIDES:python3-pkgconfig = "python-pkgconfig ( =  1.5.5-10.el10) python3-pkgconfig ( =  1.5.5-10.el10) python3.12-pkgconfig ( =  1.5.5-10.el10) python3.12dist(pkgconfig) ( =  1.5.5) python3dist(pkgconfig) ( =  1.5.5)"
