
PN = "python-PyMySQL"
PE = "0"
PV = "1.1.1"
PR = "3.el10"
PACKAGES = "python3-PyMySQL python3-PyMySQL+rsa"


URI_python3-PyMySQL = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-PyMySQL-1.1.1-3.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-PyMySQL = "python(abi) ( =  3.12)"
RPROVIDES:python3-PyMySQL = "python-PyMySQL ( =  1.1.1-3.el10) python3-PyMySQL ( =  1.1.1-3.el10) python3.12-PyMySQL ( =  1.1.1-3.el10) python3.12dist(pymysql) ( =  1.1.1) python3dist(pymysql) ( =  1.1.1)"

URI_python3-PyMySQL+rsa = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-PyMySQL+rsa-1.1.1-3.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-PyMySQL+rsa = "python3.12dist(cryptography) ( ) python(abi) ( =  3.12) python3-PyMySQL ( =  1.1.1-3.el10)"
RPROVIDES:python3-PyMySQL+rsa = "python-PyMySQL+rsa ( =  1.1.1-3.el10) python3-PyMySQL+rsa ( =  1.1.1-3.el10) python3.12-PyMySQL+rsa ( =  1.1.1-3.el10) python3.12dist(pymysql[rsa]) ( =  1.1.1) python3dist(pymysql[rsa]) ( =  1.1.1)"
