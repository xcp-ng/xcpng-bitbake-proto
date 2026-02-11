
PN = "stratis-cli"
PE = "0"
PV = "3.7.0"
PR = "2.el10"
PACKAGES = "stratis-cli"


URI_stratis-cli = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/stratis-cli-3.7.0-2.el10.noarch.rpm;unpack=0"
RDEPENDS:stratis-cli = "/usr/bin/python3 ( ) python3.12dist(packaging) ( ) python3.12dist(psutil) ( ) python3.12dist(python-dateutil) ( ) python3.12dist(wcwidth) ( ) python(abi) ( =  3.12) python3.12dist(dbus-client-gen) ( >=  0.4) python3.12dist(dbus-python-client-gen) ( >=  0.7) python3.12dist(justbytes) ( >=  0.14) stratisd ( with  (REL))"
RPROVIDES:stratis-cli = "python3.12dist(stratis-cli) ( =  3.7) python3dist(stratis-cli) ( =  3.7) stratis-cli ( =  3.7.0-2.el10)"
