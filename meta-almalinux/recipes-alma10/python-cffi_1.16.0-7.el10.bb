
inherit dnf-bridge

PN = "python-cffi"
PE = "0"
PV = "1.16.0"
PR = "7.el10"
PACKAGES = "python3-cffi python-cffi-doc"


URI_python3-cffi = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-cffi-1.16.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-cffi = " \
 glibc \
 libffi \
 python3 \
 python3-pycparser \
"

URI_python-cffi-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python-cffi-doc-1.16.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:python-cffi-doc = ""
