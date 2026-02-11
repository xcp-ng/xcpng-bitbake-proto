
PN = "python-smartypants"
PE = "0"
PV = "2.0.1"
PR = "20.el10"
PACKAGES = "python-smartypants-doc python3-smartypants"


URI_python-smartypants-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python-smartypants-doc-2.0.1-20.el10.noarch.rpm;unpack=0"
RDEPENDS:python-smartypants-doc = ""
RPROVIDES:python-smartypants-doc = "python-smartypants-doc ( =  2.0.1-20.el10)"

URI_python3-smartypants = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-smartypants-2.0.1-20.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-smartypants = "/usr/bin/python3 ( ) python3dist(setuptools) ( ) python(abi) ( =  3.12)"
RPROVIDES:python3-smartypants = "python-smartypants ( =  2.0.1-20.el10) python3-smartypants ( =  2.0.1-20.el10) python3.12-smartypants ( =  2.0.1-20.el10) python3.12dist(smartypants) ( =  2.0.1) python3dist(smartypants) ( =  2.0.1)"
