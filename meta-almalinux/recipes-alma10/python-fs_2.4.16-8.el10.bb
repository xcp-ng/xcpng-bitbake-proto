
PN = "python-fs"
PE = "0"
PV = "2.4.16"
PR = "8.el10"
PACKAGES = "python3-fs"


URI_python3-fs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-fs-2.4.16-8.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-fs = "python3.12dist(setuptools) ( ) python(abi) ( =  3.12) python3.12dist(appdirs) ( with  (REL)) python3.12dist(six) ( with  (REL))"
RPROVIDES:python3-fs = "python-fs ( =  2.4.16-8.el10) python3-fs ( =  2.4.16-8.el10) python3.12-fs ( =  2.4.16-8.el10) python3.12dist(fs) ( =  2.4.16) python3dist(fs) ( =  2.4.16)"
