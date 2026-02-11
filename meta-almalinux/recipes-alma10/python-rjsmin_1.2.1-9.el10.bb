
inherit dnf-bridge

PN = "python-rjsmin"
PE = "0"
PV = "1.2.1"
PR = "9.el10"
PACKAGES = "python-rjsmin-docs python3-rjsmin"


URI_python-rjsmin-docs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python-rjsmin-docs-1.2.1-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python-rjsmin-docs = ""

URI_python3-rjsmin = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-rjsmin-1.2.1-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-rjsmin = " \
 glibc \
 python3 \
"
