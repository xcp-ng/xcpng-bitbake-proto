
PN = "micropipenv"
PE = "0"
PV = "1.6.0"
PR = "9.el10"
PACKAGES = "micropipenv micropipenv+toml"


URI_micropipenv = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/micropipenv-1.6.0-9.el10.noarch.rpm;unpack=0"
RDEPENDS:micropipenv = "/usr/bin/python3 ( ) python(abi) ( =  3.12) python3.12dist(pip) ( >=  9)"
RPROVIDES:micropipenv = "micropipenv ( =  1.6.0-9.el10) python-micropipenv ( =  1.6.0-9.el10) python3-micropipenv ( =  1.6.0-9.el10) python3.12-micropipenv ( =  1.6.0-9.el10) python3.12dist(micropipenv) ( =  1.6) python3dist(micropipenv) ( =  1.6)"

URI_micropipenv+toml = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/micropipenv+toml-1.6.0-9.el10.noarch.rpm;unpack=0"
RDEPENDS:micropipenv+toml = "python(abi) ( =  3.12) micropipenv ( =  1.6.0-9.el10)"
RPROVIDES:micropipenv+toml = "micropipenv+toml ( =  1.6.0-9.el10) python3.12dist(micropipenv[toml]) ( =  1.6) python3dist(micropipenv[toml]) ( =  1.6)"
