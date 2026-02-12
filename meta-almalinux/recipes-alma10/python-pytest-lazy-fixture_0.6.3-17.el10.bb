
inherit dnf-bridge

PN = "python-pytest-lazy-fixture"
PE = "0"
PV = "0.6.3"
PR = "17.el10"
PACKAGES = "python3-pytest-lazy-fixture"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/python-pytest-lazy-fixture-0.6.3-17.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-pytest-lazy-fixture = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-pytest-lazy-fixture-0.6.3-17.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-pytest-lazy-fixture}"
RDEPENDS:python3-pytest-lazy-fixture = " \
 python3 \
 python3-pytest \
"
