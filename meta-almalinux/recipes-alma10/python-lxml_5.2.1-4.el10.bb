
inherit dnf-bridge

PN = "python-lxml"
PE = "0"
PV = "5.2.1"
PR = "4.el10"
PACKAGES = "python3-lxml"


URI_python3-lxml = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-lxml-5.2.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-lxml = " \
 glibc \
 python3 \
 libxslt \
 libxml2 \
"
