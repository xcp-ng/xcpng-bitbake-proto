
inherit dnf-bridge

PN = "python-jsonschema"
PE = "0"
PV = "4.19.1"
PR = "7.el10"
PACKAGES = "python3-jsonschema"


URI_python3-jsonschema = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-jsonschema-4.19.1-7.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-jsonschema = " \
 python3 \
 python3-referencing \
 python3-attrs \
 python3-rpds-py \
 python3-jsonschema-specifications \
"
