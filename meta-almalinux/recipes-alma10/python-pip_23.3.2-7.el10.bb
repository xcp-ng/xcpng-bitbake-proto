
inherit dnf-bridge

PN = "python-pip"
PE = "0"
PV = "23.3.2"
PR = "7.el10"
PACKAGES = "python3-pip-wheel python3-pip"


URI_python3-pip-wheel = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-pip-wheel-23.3.2-7.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-pip-wheel = " \
 ca-certificates \
"

URI_python3-pip = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-pip-23.3.2-7.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-pip = " \
 python3 \
 ca-certificates \
"
