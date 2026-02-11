
PN = "cepces"
PE = "0"
PV = "0.3.9"
PR = "2.el10"
PACKAGES = "cepces cepces-certmonger cepces-selinux python3-cepces"


URI_cepces = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cepces-0.3.9-2.el10.noarch.rpm;unpack=0"
RDEPENDS:cepces = "python3-cepces ( =  0.3.9-2.el10) cepces-selinux ( if  selinux-policy-targeted)"
RPROVIDES:cepces = "cepces ( =  0.3.9-2.el10) config(cepces) ( =  0.3.9-2.el10)"

URI_cepces-certmonger = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cepces-certmonger-0.3.9-2.el10.noarch.rpm;unpack=0"
RDEPENDS:cepces-certmonger = "/bin/sh ( ) cepces ( =  0.3.9-2.el10) /usr/bin/python3 ( ) certmonger ( )"
RPROVIDES:cepces-certmonger = "cepces-certmonger ( =  0.3.9-2.el10)"

URI_cepces-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cepces-selinux-0.3.9-2.el10.noarch.rpm;unpack=0"
RDEPENDS:cepces-selinux = "/bin/sh ( ) selinux-policy-targeted ( ) cepces ( =  0.3.9-2.el10)"
RPROVIDES:cepces-selinux = "cepces-selinux ( =  0.3.9-2.el10)"

URI_python3-cepces = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-cepces-0.3.9-2.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-cepces = "python3dist(setuptools) ( ) python3dist(gssapi) ( ) python3dist(requests) ( ) python3dist(requests-gssapi) ( ) python(abi) ( =  3.12) python3dist(cryptography) ( >=  1.2)"
RPROVIDES:python3-cepces = "python3-cepces ( =  0.3.9-2.el10) python-cepces ( =  0.3.9-2.el10) python3.12-cepces ( =  0.3.9-2.el10) python3.12dist(cepces) ( =  0.3.9) python3dist(cepces) ( =  0.3.9)"
