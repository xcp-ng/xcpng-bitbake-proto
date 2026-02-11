
inherit dnf-bridge

PN = "python-decorator"
PE = "0"
PV = "5.1.1"
PR = "12.el10"
PACKAGES = "python3-decorator"


URI_python3-decorator = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-decorator-5.1.1-12.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-decorator = " \
 python3 \
"
