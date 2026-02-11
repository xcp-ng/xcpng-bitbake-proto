
PN = "snapm"
PE = "0"
PV = "0.4.0"
PR = "2.el10"
PACKAGES = "python3-snapm python3-snapm-doc snapm"


URI_python3-snapm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-snapm-0.4.0-2.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-snapm = "/usr/bin/python3 ( ) python3.12dist(packaging) ( ) python3.12dist(python-dateutil) ( ) python3.12dist(wcwidth) ( ) python(abi) ( =  3.12) python3.12dist(dbus-client-gen) ( >=  0.4) python3.12dist(dbus-python-client-gen) ( >=  0.7) python3.12dist(justbytes) ( >=  0.14) python3-boom ( >=  1.6.4) python3.12dist(boom-boot) ( >=  1.6.4)"
RPROVIDES:python3-snapm = "python3-snapm ( =  0.4.0-2.el10) python-snapm ( =  0.4.0-2.el10) python3.12-snapm ( =  0.4.0-2.el10) python3.12dist(snapm) ( =  0.4) python3dist(snapm) ( =  0.4)"

URI_python3-snapm-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-snapm-doc-0.4.0-2.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-snapm-doc = ""
RPROVIDES:python3-snapm-doc = "python-snapm-doc ( =  0.4.0-2.el10) python3-snapm-doc ( =  0.4.0-2.el10) python3.12-snapm-doc ( =  0.4.0-2.el10)"

URI_snapm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/snapm-0.4.0-2.el10.noarch.rpm;unpack=0"
RDEPENDS:snapm = "/usr/bin/python3 ( ) python3-snapm ( =  0.4.0-2.el10)"
RPROVIDES:snapm = "snapm ( =  0.4.0-2.el10)"
