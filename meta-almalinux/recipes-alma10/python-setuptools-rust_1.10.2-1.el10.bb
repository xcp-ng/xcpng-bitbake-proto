
PN = "python-setuptools-rust"
PE = "0"
PV = "1.10.2"
PR = "1.el10"
PACKAGES = "python3-setuptools-rust"


URI_python3-setuptools-rust = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-setuptools-rust-1.10.2-1.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-setuptools-rust = "cargo ( ) python(abi) ( =  3.12) python3.12dist(semantic-version) ( with  (REL)) python3.12dist(setuptools) ( >=  62.4)"
RPROVIDES:python3-setuptools-rust = "python-setuptools-rust ( =  1.10.2-1.el10) python3-setuptools-rust ( =  1.10.2-1.el10) python3.12-setuptools-rust ( =  1.10.2-1.el10) python3.12dist(setuptools-rust) ( =  1.10.2) python3dist(setuptools-rust) ( =  1.10.2)"
