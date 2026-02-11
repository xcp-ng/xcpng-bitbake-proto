
PN = "python-requests-gssapi"
PE = "0"
PV = "1.2.3"
PR = "13.el10"
PACKAGES = "python3-requests-gssapi"


URI_python3-requests-gssapi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-requests-gssapi-1.2.3-13.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-requests-gssapi = "python3-requests ( ) python3-gssapi ( ) python3.12dist(gssapi) ( ) python(abi) ( =  3.12) python3.12dist(requests) ( >=  1.1)"
RPROVIDES:python3-requests-gssapi = "python-requests-gssapi ( =  1.2.3-13.el10) python3-requests-gssapi ( =  1.2.3-13.el10) python3.12-requests-gssapi ( =  1.2.3-13.el10) python3.12dist(requests-gssapi) ( =  1.2.3) python3dist(requests-gssapi) ( =  1.2.3)"
