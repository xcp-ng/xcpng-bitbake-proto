
inherit dnf-bridge

PN = "python-pyasn1"
PE = "0"
PV = "0.6.1"
PR = "1.el10"
PACKAGES = "python3-pyasn1 python3-pyasn1-modules python-pyasn1-doc"


URI_python3-pyasn1 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-pyasn1-0.6.1-1.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-pyasn1 = " \
 python3 \
"

URI_python3-pyasn1-modules = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-pyasn1-modules-0.6.1-1.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-pyasn1-modules = " \
 python3 \
 python3-pyasn1 \
"

URI_python-pyasn1-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python-pyasn1-doc-0.6.1-1.el10.noarch.rpm;unpack=0"
RDEPENDS:python-pyasn1-doc = ""
