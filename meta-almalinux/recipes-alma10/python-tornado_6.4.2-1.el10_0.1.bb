
PN = "python-tornado"
PE = "0"
PV = "6.4.2"
PR = "1.el10_0.1"
PACKAGES = "python3-tornado python-tornado-doc"


URI_python3-tornado = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-tornado-6.4.2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-tornado = " \
 glibc \
 python3 \
"

URI_python-tornado-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python-tornado-doc-6.4.2-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:python-tornado-doc = ""
