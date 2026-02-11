
PN = "tuna"
PE = "0"
PV = "0.19"
PR = "9.el10"
PACKAGES = "tuna"


URI_tuna = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/tuna-0.19-9.el10.noarch.rpm;unpack=0"
RDEPENDS:tuna = "/usr/bin/python3 ( ) python(abi) ( =  3.12) python3-linux-procfs ( >=  0.7.3)"
RPROVIDES:tuna = "python3.12dist(tuna) ( =  0.19) python3dist(tuna) ( =  0.19) tuna ( =  0.19-9.el10)"
