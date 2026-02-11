
PN = "python-requests"
PE = "0"
PV = "2.32.4"
PR = "1.el10_0"
PACKAGES = "python3-requests"


URI_python3-requests = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-requests-2.32.4-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:python3-requests = "python(abi) ( =  3.12) python3.12dist(charset-normalizer) ( with  (REL)) python3.12dist(idna) ( with  (REL)) python3.12dist(urllib3) ( with  (REL))"
RPROVIDES:python3-requests = "python-requests ( =  2.32.4-1.el10_0) python3-requests ( =  2.32.4-1.el10_0) python3.12-requests ( =  2.32.4-1.el10_0) python3.12dist(requests) ( =  2.32.4) python3dist(requests) ( =  2.32.4)"
