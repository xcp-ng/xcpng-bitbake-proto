
inherit dnf-bridge

PN = "python-jsonschema-specifications"
PE = "0"
PV = "2023.11.2"
PR = "6.el10"
PACKAGES = "python3-jsonschema-specifications python3-jsonschema-specifications-tests"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/python-jsonschema-specifications-2023.11.2-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-jsonschema-specifications = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-jsonschema-specifications-2023.11.2-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-jsonschema-specifications}"
RDEPENDS:python3-jsonschema-specifications = " \
 python3 \
 python3-referencing \
"

URI_python3-jsonschema-specifications-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-jsonschema-specifications-tests-2023.11.2-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-jsonschema-specifications-tests}"
RDEPENDS:python3-jsonschema-specifications-tests = " \
 python3 \
 python3-pytest \
 python3-jsonschema-specifications \
"
