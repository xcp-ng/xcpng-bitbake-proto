
PN = "python-psutil"
PE = "0"
PV = "5.9.8"
PR = "5.el10"
PACKAGES = "python3-psutil python3-psutil-tests"


URI_python3-psutil = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-psutil-5.9.8-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-psutil = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.7)(64bit) ( ) python(abi) ( =  3.12)"
RPROVIDES:python3-psutil = "python-psutil ( =  5.9.8-5.el10) python3-psutil ( =  5.9.8-5.el10) python3-psutil(x86-64) ( =  5.9.8-5.el10) python3.12-psutil ( =  5.9.8-5.el10) python3.12dist(psutil) ( =  5.9.8) python3dist(psutil) ( =  5.9.8)"

URI_python3-psutil-tests = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-psutil-tests-5.9.8-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-psutil-tests = "python(abi) ( =  3.12) python3-psutil(x86-64) ( =  5.9.8-5.el10)"
RPROVIDES:python3-psutil-tests = "python-psutil-tests ( =  5.9.8-5.el10) python3-psutil-tests ( =  5.9.8-5.el10) python3-psutil-tests(x86-64) ( =  5.9.8-5.el10) python3.12-psutil-tests ( =  5.9.8-5.el10)"
