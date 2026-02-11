
PN = "python-pip"
PE = "0"
PV = "23.3.2"
PR = "7.el10"
PACKAGES = "python3-pip-wheel python3-pip"


URI_python3-pip-wheel = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-pip-wheel-23.3.2-7.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-pip-wheel = "ca-certificates ( )"
RPROVIDES:python3-pip-wheel = "bundled(python3dist(tomli)) ( =  2.0.1) bundled(python3dist(cachecontrol)) ( =  0.13.1) bundled(python3dist(certifi)) ( =  2023.7.22) bundled(python3dist(chardet)) ( =  5.1) bundled(python3dist(colorama)) ( =  0.4.6) bundled(python3dist(distlib)) ( =  0.3.6) bundled(python3dist(distro)) ( =  1.8) bundled(python3dist(idna)) ( =  3.4) bundled(python3dist(msgpack)) ( =  1.0.5) bundled(python3dist(packaging)) ( =  21.3) bundled(python3dist(platformdirs)) ( =  3.8.1) bundled(python3dist(pygments)) ( =  2.15.1) bundled(python3dist(pyparsing)) ( =  3.1) bundled(python3dist(pyproject-hooks)) ( =  1) bundled(python3dist(requests)) ( =  2.31) bundled(python3dist(resolvelib)) ( =  1.0.1) bundled(python3dist(rich)) ( =  13.4.2) bundled(python3dist(setuptools)) ( =  68) bundled(python3dist(six)) ( =  1.16) bundled(python3dist(tenacity)) ( =  8.2.2) bundled(python3dist(truststore)) ( =  0.8) bundled(python3dist(typing-extensions)) ( =  4.7.1) bundled(python3dist(urllib3)) ( =  1.26.17) bundled(python3dist(webencodings)) ( =  0.5.1) python-pip-wheel ( =  23.3.2-7.el10) python3-pip-wheel ( =  23.3.2-7.el10) python3.12-pip-wheel ( =  23.3.2-7.el10)"

URI_python3-pip = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-pip-23.3.2-7.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-pip = "/usr/bin/python3 ( ) ca-certificates ( ) python(abi) ( =  3.12)"
RPROVIDES:python3-pip = "bundled(python3dist(cachecontrol)) ( =  0.13.1) bundled(python3dist(certifi)) ( =  2023.7.22) bundled(python3dist(chardet)) ( =  5.1) bundled(python3dist(colorama)) ( =  0.4.6) bundled(python3dist(distlib)) ( =  0.3.6) bundled(python3dist(distro)) ( =  1.8) bundled(python3dist(idna)) ( =  3.4) bundled(python3dist(msgpack)) ( =  1.0.5) bundled(python3dist(packaging)) ( =  21.3) bundled(python3dist(platformdirs)) ( =  3.8.1) bundled(python3dist(pygments)) ( =  2.15.1) bundled(python3dist(pyparsing)) ( =  3.1) bundled(python3dist(pyproject-hooks)) ( =  1) bundled(python3dist(requests)) ( =  2.31) bundled(python3dist(resolvelib)) ( =  1.0.1) bundled(python3dist(rich)) ( =  13.4.2) bundled(python3dist(setuptools)) ( =  68) bundled(python3dist(six)) ( =  1.16) bundled(python3dist(tenacity)) ( =  8.2.2) bundled(python3dist(tomli)) ( =  2.0.1) bundled(python3dist(truststore)) ( =  0.8) bundled(python3dist(typing-extensions)) ( =  4.7.1) bundled(python3dist(urllib3)) ( =  1.26.17) bundled(python3dist(webencodings)) ( =  0.5.1) pip ( =  23.3.2-7.el10) python-pip ( =  23.3.2-7.el10) python3-pip ( =  23.3.2-7.el10) python3.12-pip ( =  23.3.2-7.el10) python3.12dist(pip) ( =  23.3.2) python3dist(pip) ( =  23.3.2)"
