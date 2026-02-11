
PN = "argparse-manpage"
PE = "0"
PV = "4.5"
PR = "4.el10"
PACKAGES = "argparse-manpage python3-argparse-manpage+setuptools python3-argparse-manpage"


URI_argparse-manpage = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/argparse-manpage-4.5-4.el10.noarch.rpm;unpack=0"
RDEPENDS:argparse-manpage = "/usr/bin/python3 ( ) python(abi) ( =  3.12) python3-argparse-manpage ( =  4.5-4.el10)"
RPROVIDES:argparse-manpage = "argparse-manpage ( =  4.5-4.el10)"

URI_python3-argparse-manpage+setuptools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-argparse-manpage+setuptools-4.5-4.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-argparse-manpage+setuptools = "python3.12dist(setuptools) ( ) python(abi) ( =  3.12) python3-argparse-manpage ( =  4.5-4.el10)"
RPROVIDES:python3-argparse-manpage+setuptools = "python-argparse-manpage+setuptools ( =  4.5-4.el10) python3-argparse-manpage+setuptools ( =  4.5-4.el10) python3.12-argparse-manpage+setuptools ( =  4.5-4.el10) python3.12dist(argparse-manpage[setuptools]) ( =  4.5) python3dist(argparse-manpage[setuptools]) ( =  4.5)"

URI_python3-argparse-manpage = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-argparse-manpage-4.5-4.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-argparse-manpage = "python(abi) ( =  3.12)"
RPROVIDES:python3-argparse-manpage = "python3-argparse-manpage ( =  4.5-4.el10) python-argparse-manpage ( =  4.5-4.el10) python3.12-argparse-manpage ( =  4.5-4.el10) python3.12dist(argparse-manpage) ( =  4.5) python3dist(argparse-manpage) ( =  4.5)"
