
PN = "python-virt-firmware"
PE = "0"
PV = "24.11"
PR = "2.el10_0"
PACKAGES = "python3-virt-firmware uki-direct python3-virt-firmware-tests"


URI_python3-virt-firmware = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-virt-firmware-24.11-2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:python3-virt-firmware = "/usr/bin/python3 ( ) python3.12dist(cryptography) ( ) python3.12dist(setuptools) ( ) python3dist(cryptography) ( ) python3dist(pefile) ( ) python3.12dist(pefile) ( ) python3dist(setuptools) ( ) python(abi) ( =  3.12)"
RPROVIDES:python3-virt-firmware = "virt-firmware ( ) python3.12dist(virt-firmware) ( =  24.11) python3dist(virt-firmware) ( =  24.11) python-virt-firmware ( =  24.11-2.el10_0) python3-virt-firmware ( =  24.11-2.el10_0) python3.12-virt-firmware ( =  24.11-2.el10_0)"

URI_uki-direct = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/uki-direct-24.11-2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:uki-direct = "/bin/sh ( ) /usr/bin/sh ( ) python3-virt-firmware ( )"
RPROVIDES:uki-direct = "ukidirect ( ) uki-direct ( =  24.11-2.el10_0)"

URI_python3-virt-firmware-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-virt-firmware-tests-24.11-2.el10_0.noarch.rpm;unpack=0"
RDEPENDS:python3-virt-firmware-tests = "/usr/bin/sh ( ) /usr/bin/bash ( ) python3dist(pytest) ( ) edk2-ovmf ( ) python3-virt-firmware ( )"
RPROVIDES:python3-virt-firmware-tests = "python-virt-firmware-tests ( =  24.11-2.el10_0) python3-virt-firmware-tests ( =  24.11-2.el10_0) python3.12-virt-firmware-tests ( =  24.11-2.el10_0)"
