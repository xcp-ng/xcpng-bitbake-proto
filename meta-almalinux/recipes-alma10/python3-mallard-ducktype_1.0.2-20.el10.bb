
inherit dnf-bridge

PN = "python3-mallard-ducktype"
PE = "0"
PV = "1.0.2"
PR = "20.el10"
PACKAGES = "python3-mallard-ducktype"


URI_python3-mallard-ducktype = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-mallard-ducktype-1.0.2-20.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-mallard-ducktype = " \
 python3 \
"
