
inherit dnf-bridge

PN = "python-cffsubr"
PE = "0"
PV = "0.2.9.post1"
PR = "12.el10"
PACKAGES = "python3-cffsubr"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/python-cffsubr-0.2.9.post1-12.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-cffsubr = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-cffsubr-0.2.9.post1-12.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-cffsubr}"
RDEPENDS:python3-cffsubr = " \
 python3 \
 adobe-afdko \
 python3-fonttools \
"
