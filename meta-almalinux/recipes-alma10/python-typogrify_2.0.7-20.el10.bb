
inherit dnf-bridge

PN = "python-typogrify"
PE = "0"
PV = "2.0.7"
PR = "20.el10"
PACKAGES = "python3-typogrify"


URI_python3-typogrify = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-typogrify-2.0.7-20.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-typogrify = " \
 python3 \
 python3-smartypants \
"
