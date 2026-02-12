
inherit dnf-bridge

PN = "python-oauthlib"
PE = "0"
PV = "3.2.2"
PR = "6.el10"
PACKAGES = "python3-oauthlib"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-oauthlib-3.2.2-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-oauthlib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-oauthlib-3.2.2-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-oauthlib}"
RDEPENDS:python3-oauthlib = " \
 python3 \
"
