
inherit dnf-bridge

PN = "python-smartypants"
PE = "0"
PV = "2.0.1"
PR = "20.el10"
PACKAGES = "python-smartypants-doc python3-smartypants"


URI_python-smartypants-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python-smartypants-doc-2.0.1-20.el10.noarch.rpm;unpack=0"
RDEPENDS:python-smartypants-doc = ""

URI_python3-smartypants = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-smartypants-2.0.1-20.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-smartypants = " \
 python3 \
 python3-setuptools \
"
