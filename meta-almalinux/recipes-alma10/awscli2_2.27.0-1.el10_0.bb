
PN = "awscli2"
PE = "0"
PV = "2.27.0"
PR = "1.el10_0"
PACKAGES = "awscli2"


URI_awscli2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/awscli2-2.27.0-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:awscli2 = "/usr/bin/python3 ( ) python(abi) ( =  3.12) python3.12dist(colorama) ( >=  0.2.5) python3.12dist(cryptography) ( >=  40) python3.12dist(distro) ( >=  1.5) python3.12dist(docutils) ( >=  0.10) python3.12dist(jmespath) ( >=  0.7.1) python3.12dist(prompt-toolkit) ( >=  3.0.24) python3.12dist(python-dateutil) ( >=  2.1) python3.12dist(ruamel-yaml) ( >=  0.15) python3.12dist(ruamel-yaml-clib) ( >=  0.2) python3.12dist(urllib3) ( >=  1.25.4) python3.12dist(awscrt) ( >=  0.25.4)"
RPROVIDES:awscli2 = "bundled(python3dist(botocore)) ( =  2.0.0) bundled(python3dist(s3transfer)) ( =  0.5.1) awscli ( =  2.27.0-1.el10_0) awscli-2 ( =  2.27.0-1.el10_0) awscli2 ( =  2.27.0-1.el10_0) python3.12dist(awscli) ( =  2.27) python3dist(awscli) ( =  2.27)"
