
PN = "python-jwcrypto"
PE = "0"
PV = "1.5.6"
PR = "4.el10"
PACKAGES = "python3-jwcrypto"


URI_python3-jwcrypto = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-jwcrypto-1.5.6-4.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-jwcrypto = "python(abi) ( =  3.12) python3-cryptography ( >=  2.3) python3.12dist(cryptography) ( >=  3.4) python3.12dist(typing-extensions) ( >=  4.5)"
RPROVIDES:python3-jwcrypto = "python-jwcrypto ( =  1.5.6-4.el10) python3-jwcrypto ( =  1.5.6-4.el10) python3.12-jwcrypto ( =  1.5.6-4.el10) python3.12dist(jwcrypto) ( =  1.5.6) python3dist(jwcrypto) ( =  1.5.6)"
