
inherit dnf-bridge

PN = "python-pathspec"
PE = "0"
PV = "0.12.1"
PR = "5.el10"
PACKAGES = "python3-pathspec"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/python-pathspec-0.12.1-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-pathspec = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-pathspec-0.12.1-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-pathspec}"
RDEPENDS:python3-pathspec = " \
 python3 \
"
