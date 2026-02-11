
PN = "python-augeas"
PE = "0"
PV = "1.1.0"
PR = "14.el10"
PACKAGES = "python3-augeas"


URI_python3-augeas = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-augeas-1.1.0-14.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-augeas = "python3-cffi ( ) augeas-libs ( ) python(abi) ( =  3.12) python3.12dist(cffi) ( >=  1)"
RPROVIDES:python3-augeas = "python-augeas ( =  1.1.0-14.el10) python3-augeas ( =  1.1.0-14.el10) python3.12-augeas ( =  1.1.0-14.el10) python3.12dist(python-augeas) ( =  1.1) python3dist(python-augeas) ( =  1.1)"
