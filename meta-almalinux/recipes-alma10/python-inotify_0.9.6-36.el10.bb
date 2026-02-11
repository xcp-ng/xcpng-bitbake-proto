
PN = "python-inotify"
PE = "0"
PV = "0.9.6"
PR = "36.el10"
PACKAGES = "python3-inotify"


URI_python3-inotify = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-inotify-0.9.6-36.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-inotify = "/usr/bin/python3 ( ) python(abi) ( =  3.12)"
RPROVIDES:python3-inotify = "python-inotify ( =  0.9.6-36.el10) python3-inotify ( =  0.9.6-36.el10) python3.12-inotify ( =  0.9.6-36.el10) python3.12dist(pyinotify) ( =  0.9.6) python3dist(pyinotify) ( =  0.9.6)"
