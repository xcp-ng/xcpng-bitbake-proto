
inherit dnf-bridge

PN = "python-setuptools_scm"
PE = "0"
PV = "8.0.4"
PR = "7.el10"
PACKAGES = "python3-setuptools_scm+toml python3-setuptools_scm"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/python-setuptools_scm-8.0.4-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-setuptools_scm+toml = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-setuptools_scm+toml-8.0.4-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-setuptools_scm+toml}"
RDEPENDS:python3-setuptools_scm+toml = " \
 python3 \
 python3-setuptools_scm \
"

URI_python3-setuptools_scm = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-setuptools_scm-8.0.4-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-setuptools_scm}"
RDEPENDS:python3-setuptools_scm = " \
 python3-setuptools \
 python3-packaging \
 python3 \
 python3-typing-extensions \
"
