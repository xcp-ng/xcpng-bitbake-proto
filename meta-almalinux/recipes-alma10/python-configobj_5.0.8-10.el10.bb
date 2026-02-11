
inherit dnf-bridge

PN = "python-configobj"
PE = "0"
PV = "5.0.8"
PR = "10.el10"
PACKAGES = "python3-configobj"


URI_python3-configobj = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-configobj-5.0.8-10.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-configobj = " \
 python3 \
 python3-six \
"
