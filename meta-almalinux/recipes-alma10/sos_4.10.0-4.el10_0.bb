
PN = "sos"
PE = "0"
PV = "4.10.0"
PR = "4.el10_0"
PACKAGES = "sos sos-audit"


URI_sos = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/sos-4.10.0-4.el10_0.noarch.rpm;unpack=0"
RDEPENDS:sos = "/usr/bin/python3 ( ) python3-requests ( ) python3-setuptools ( ) python3.12dist(pyyaml) ( ) python3.12dist(packaging) ( ) python3.12dist(pexpect) ( ) python(abi) ( =  3.12)"
RPROVIDES:sos = "config(sos) ( =  4.10.0-4.el10_0) python3.12dist(sos) ( =  4.10) python3dist(sos) ( =  4.10) sos ( =  4.10.0-4.el10_0)"

URI_sos-audit = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sos-audit-4.10.0-4.el10_0.noarch.rpm;unpack=0"
RDEPENDS:sos-audit = "/bin/sh ( ) /usr/bin/bash ( )"
RPROVIDES:sos-audit = "config(sos-audit) ( =  4.10.0-4.el10_0) sos-audit ( =  4.10.0-4.el10_0)"
