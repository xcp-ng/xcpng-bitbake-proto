
inherit dnf-bridge

PN = "python-setuptools-rust"
PE = "0"
PV = "1.10.2"
PR = "1.el10"
PACKAGES = "python3-setuptools-rust"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/python-setuptools-rust-1.10.2-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-setuptools-rust = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-setuptools-rust-1.10.2-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-setuptools-rust}"
RDEPENDS:python3-setuptools-rust = " \
 python3 \
 cargo \
 python3-semantic_version \
 python3-setuptools \
"
