
inherit dnf-bridge

PN = "marshalparser"
PE = "0"
PV = "0.3.4"
PR = "12.el10"
PACKAGES = "marshalparser"


URI_marshalparser = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/marshalparser-0.3.4-12.el10.noarch.rpm;unpack=0"
RDEPENDS:marshalparser = " \
 python3 \
"
