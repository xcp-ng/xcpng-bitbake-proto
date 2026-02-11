
PN = "sip6"
PE = "0"
PV = "6.9.0"
PR = "1.el10"
PACKAGES = "sip6"


URI_sip6 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sip6-6.9.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:sip6 = "/usr/bin/python3 ( ) python3.12dist(setuptools) ( ) python3.12dist(packaging) ( ) python(abi) ( =  3.12)"
RPROVIDES:sip6 = "python-sip6 ( =  6.9.0-1.el10) python3-sip6 ( =  6.9.0-1.el10) python3.12-sip6 ( =  6.9.0-1.el10) python3.12dist(sip) ( =  6.9) python3dist(sip) ( =  6.9) sip6 ( =  6.9.0-1.el10)"
