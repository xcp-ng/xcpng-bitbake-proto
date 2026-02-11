
PN = "python-pexpect"
PE = "0"
PV = "4.9.0"
PR = "6.el10"
PACKAGES = "python3-pexpect"


URI_python3-pexpect = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-pexpect-4.9.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-pexpect = "python3-ptyprocess ( ) python(abi) ( =  3.12) python3.12dist(ptyprocess) ( >=  0.5)"
RPROVIDES:python3-pexpect = "python-pexpect ( =  4.9.0-6.el10) python3-pexpect ( =  4.9.0-6.el10) python3.12-pexpect ( =  4.9.0-6.el10) python3.12dist(pexpect) ( =  4.9) python3dist(pexpect) ( =  4.9)"
