
inherit dnf-bridge

PN = "python-idna"
PE = "0"
PV = "3.7"
PR = "4.el10"
PACKAGES = "python3-idna"


URI_python3-idna = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-idna-3.7-4.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-idna = " \
 python3 \
"
