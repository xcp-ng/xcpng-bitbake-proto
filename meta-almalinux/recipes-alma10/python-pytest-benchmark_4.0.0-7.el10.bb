
inherit dnf-bridge

PN = "python-pytest-benchmark"
PE = "0"
PV = "4.0.0"
PR = "7.el10"
PACKAGES = "python3-pytest-benchmark"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/python-pytest-benchmark-4.0.0-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-pytest-benchmark = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-pytest-benchmark-4.0.0-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-pytest-benchmark}"
RDEPENDS:python3-pytest-benchmark = " \
 python3 \
 python3-cpuinfo \
 python3-pytest \
"
