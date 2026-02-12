
inherit dnf-bridge

PN = "python-rpmautospec-core"
PE = "0"
PV = "0.1.5"
PR = "2.el10"
PACKAGES = "python3-rpmautospec-core"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/python-rpmautospec-core-0.1.5-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-rpmautospec-core = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-rpmautospec-core-0.1.5-2.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-rpmautospec-core}"
RDEPENDS:python3-rpmautospec-core = " \
 python3 \
"
