
PN = "python-dns"
PE = "0"
PV = "2.6.1"
PR = "1.el10"
PACKAGES = "python3-dns python3-dns+dnssec python3-dns+idna"


URI_python3-dns = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-dns-2.6.1-1.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-dns = "python(abi) ( =  3.12)"
RPROVIDES:python3-dns = "python-dns ( =  2.6.1-1.el10) python3-dns ( =  2.6.1-1.el10) python3.12-dns ( =  2.6.1-1.el10) python3.12dist(dnspython) ( =  2.6.1) python3dist(dnspython) ( =  2.6.1)"

URI_python3-dns+dnssec = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-dns+dnssec-2.6.1-1.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-dns+dnssec = "python(abi) ( =  3.12) python3-dns ( =  2.6.1-1.el10) python3.12dist(cryptography) ( >=  41)"
RPROVIDES:python3-dns+dnssec = "python-dns+dnssec ( =  2.6.1-1.el10) python3-dns+dnssec ( =  2.6.1-1.el10) python3.12-dns+dnssec ( =  2.6.1-1.el10) python3.12dist(dnspython[dnssec]) ( =  2.6.1) python3dist(dnspython[dnssec]) ( =  2.6.1)"

URI_python3-dns+idna = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-dns+idna-2.6.1-1.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-dns+idna = "python(abi) ( =  3.12) python3-dns ( =  2.6.1-1.el10) python3.12dist(idna) ( >=  3.6)"
RPROVIDES:python3-dns+idna = "python-dns+idna ( =  2.6.1-1.el10) python3-dns+idna ( =  2.6.1-1.el10) python3.12-dns+idna ( =  2.6.1-1.el10) python3.12dist(dnspython[idna]) ( =  2.6.1) python3dist(dnspython[idna]) ( =  2.6.1)"
