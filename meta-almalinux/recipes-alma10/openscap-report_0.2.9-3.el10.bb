
PN = "openscap-report"
PE = "0"
PV = "0.2.9"
PR = "3.el10"
PACKAGES = "openscap-report"


URI_openscap-report = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/openscap-report-0.2.9-3.el10.noarch.rpm;unpack=0"
RDEPENDS:openscap-report = "/usr/bin/python3 ( ) python3-lxml ( ) python3.12dist(jinja2) ( ) python3.12dist(lxml) ( ) python(abi) ( =  3.12)"
RPROVIDES:openscap-report = "bundled(patternfly) ( =  4) openscap-report ( =  0.2.9-3.el10) python3.12dist(openscap-report) ( =  0.2.9) python3dist(openscap-report) ( =  0.2.9)"
