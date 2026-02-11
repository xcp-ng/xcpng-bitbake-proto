
inherit dnf-bridge

PN = "python-charset-normalizer"
PE = "0"
PV = "3.3.2"
PR = "7.el10"
PACKAGES = "python3-charset-normalizer"


URI_python3-charset-normalizer = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-charset-normalizer-3.3.2-7.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-charset-normalizer = " \
 python3 \
"
