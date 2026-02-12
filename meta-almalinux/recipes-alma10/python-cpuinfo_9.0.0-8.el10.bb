
inherit dnf-bridge

PN = "python-cpuinfo"
PE = "0"
PV = "9.0.0"
PR = "8.el10"
PACKAGES = "python3-cpuinfo"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/python-cpuinfo-9.0.0-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-cpuinfo = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-cpuinfo-9.0.0-8.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-cpuinfo}"
RDEPENDS:python3-cpuinfo = " \
 python3 \
"
