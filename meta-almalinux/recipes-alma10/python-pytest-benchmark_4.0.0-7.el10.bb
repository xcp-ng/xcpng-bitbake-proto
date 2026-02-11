
PN = "python-pytest-benchmark"
PE = "0"
PV = "4.0.0"
PR = "7.el10"
PACKAGES = "python3-pytest-benchmark"


URI_python3-pytest-benchmark = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-pytest-benchmark-4.0.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-pytest-benchmark = "/usr/bin/python3 ( ) python3-cpuinfo ( ) python3-pytest ( ) python3.12dist(py-cpuinfo) ( ) python(abi) ( =  3.12) python3.12dist(pytest) ( >=  3.8)"
RPROVIDES:python3-pytest-benchmark = "python-pytest-benchmark ( =  4.0.0-7.el10) python3-pytest-benchmark ( =  4.0.0-7.el10) python3.12-pytest-benchmark ( =  4.0.0-7.el10) python3.12dist(pytest-benchmark) ( =  4) python3dist(pytest-benchmark) ( =  4)"
