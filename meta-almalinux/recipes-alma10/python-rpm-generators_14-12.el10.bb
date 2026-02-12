
inherit dnf-bridge

PN = "python-rpm-generators"
PE = "0"
PV = "14"
PR = "12.el10"
PACKAGES = "python3-rpm-generators"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-rpm-generators-14-12.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-rpm-generators = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-rpm-generators-14-12.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-rpm-generators}"
RDEPENDS:python3-rpm-generators = " \
 python3 \
 python3-packaging \
 python-srpm-macros \
 rpm \
"
