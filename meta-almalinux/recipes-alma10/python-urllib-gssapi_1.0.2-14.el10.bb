
inherit dnf-bridge

PN = "python-urllib-gssapi"
PE = "0"
PV = "1.0.2"
PR = "14.el10"
PACKAGES = "python3-urllib-gssapi"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-urllib-gssapi-1.0.2-14.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-urllib-gssapi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-urllib-gssapi-1.0.2-14.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-urllib-gssapi}"
RDEPENDS:python3-urllib-gssapi = " \
 python3 \
 python3-gssapi \
"
