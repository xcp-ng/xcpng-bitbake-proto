
PN = "pykickstart"
PE = "0"
PV = "3.52.8"
PR = "1.el10"
PACKAGES = "pykickstart python3-kickstart"


URI_pykickstart = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pykickstart-3.52.8-1.el10.noarch.rpm;unpack=0"
RDEPENDS:pykickstart = " \
 python3 \
 python3-kickstart \
"

URI_python3-kickstart = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-kickstart-3.52.8-1.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-kickstart = " \
 python3 \
 python3-requests \
"
