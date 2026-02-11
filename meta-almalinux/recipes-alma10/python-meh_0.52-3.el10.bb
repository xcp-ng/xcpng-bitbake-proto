
PN = "python-meh"
PE = "0"
PV = "0.52"
PR = "3.el10"
PACKAGES = "python3-meh python3-meh-gui"


URI_python3-meh = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-meh-0.52-3.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-meh = "python3 ( ) python3-dbus ( ) python3-rpm ( ) python(abi) ( =  3.12)"
RPROVIDES:python3-meh = "python3-meh ( =  0.52-3.el10) python-meh ( =  0.52-3.el10) python3.12-meh ( =  0.52-3.el10) python3.12dist(python-meh) ( =  0.52) python3dist(python-meh) ( =  0.52)"

URI_python3-meh-gui = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-meh-gui-0.52-3.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-meh-gui = "python3-gobject ( ) gtk3 ( ) python(abi) ( =  3.12) python3-meh ( =  0.52-3.el10)"
RPROVIDES:python3-meh-gui = "python-meh-gui ( =  0.52-3.el10) python3-meh-gui ( =  0.52-3.el10) python3.12-meh-gui ( =  0.52-3.el10)"
