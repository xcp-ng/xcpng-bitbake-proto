
inherit dnf-bridge

PN = "python-parameterized"
PE = "0"
PV = "0.9.0"
PR = "8.el10"
PACKAGES = "python3-parameterized"


URI_python3-parameterized = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-parameterized-0.9.0-8.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-parameterized = " \
 python3 \
"
