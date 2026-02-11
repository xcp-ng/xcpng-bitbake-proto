
PN = "python-rjsmin"
PE = "0"
PV = "1.2.1"
PR = "9.el10"
PACKAGES = "python-rjsmin-docs python3-rjsmin"


URI_python-rjsmin-docs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python-rjsmin-docs-1.2.1-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python-rjsmin-docs = ""
RPROVIDES:python-rjsmin-docs = "python-rjsmin-docs ( =  1.2.1-9.el10) python-rjsmin-docs(x86-64) ( =  1.2.1-9.el10)"

URI_python3-rjsmin = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-rjsmin-1.2.1-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-rjsmin = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) python(abi) ( =  3.12)"
RPROVIDES:python3-rjsmin = "python-rjsmin ( =  1.2.1-9.el10) python3-rjsmin ( =  1.2.1-9.el10) python3-rjsmin(x86-64) ( =  1.2.1-9.el10) python3.12-rjsmin ( =  1.2.1-9.el10) python3.12dist(rjsmin) ( =  1.2.1) python3dist(rjsmin) ( =  1.2.1)"
