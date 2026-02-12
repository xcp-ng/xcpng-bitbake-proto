
inherit dnf-bridge

PN = "python-sphinx-theme-alabaster"
PE = "0"
PV = "0.7.16"
PR = "5.el10"
PACKAGES = "python3-sphinx-theme-alabaster"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/python-sphinx-theme-alabaster-0.7.16-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-sphinx-theme-alabaster = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-sphinx-theme-alabaster-0.7.16-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-sphinx-theme-alabaster}"
RDEPENDS:python3-sphinx-theme-alabaster = " \
 python3 \
"
