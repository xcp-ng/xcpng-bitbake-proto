
PN = "python-tornado"
PE = "0"
PV = "6.4.2"
PR = "1.el10_0.1"
PACKAGES = "python3-tornado python-tornado-doc"


URI_python3-tornado = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-tornado-6.4.2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-tornado = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) python(abi) ( =  3.12)"
RPROVIDES:python3-tornado = "python3.12dist(tornado) ( =  6.4.2) python3dist(tornado) ( =  6.4.2) python-tornado ( =  6.4.2-1.el10_0.1) python3-tornado ( =  6.4.2-1.el10_0.1) python3-tornado(x86-64) ( =  6.4.2-1.el10_0.1) python3.12-tornado ( =  6.4.2-1.el10_0.1)"

URI_python-tornado-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python-tornado-doc-6.4.2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:python-tornado-doc = ""
RPROVIDES:python-tornado-doc = "python-tornado-doc ( =  6.4.2-1.el10_0.1) python-tornado-doc(x86-64) ( =  6.4.2-1.el10_0.1)"
