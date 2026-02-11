
PN = "python-cups"
PE = "0"
PV = "2.0.1"
PR = "23.el10"
PACKAGES = "python-cups-doc python3-cups"


URI_python-cups-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python-cups-doc-2.0.1-23.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python-cups-doc = ""
RPROVIDES:python-cups-doc = "python-cups-doc ( =  2.0.1-23.el10) python-cups-doc(x86-64) ( =  2.0.1-23.el10)"

URI_python3-cups = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-cups-2.0.1-23.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-cups = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/python3 ( ) libcups.so.2()(64bit) ( ) python(abi) ( =  3.12)"
RPROVIDES:python3-cups = "python-cups ( =  2.0.1-23.el10) python3-cups ( =  2.0.1-23.el10) python3-cups(x86-64) ( =  2.0.1-23.el10) python3.12-cups ( =  2.0.1-23.el10) python3.12dist(pycups) ( =  2.0.1) python3dist(pycups) ( =  2.0.1)"
