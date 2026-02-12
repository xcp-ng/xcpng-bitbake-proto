
inherit dnf-bridge

PN = "python-requests-gssapi"
PE = "0"
PV = "1.2.3"
PR = "13.el10"
PACKAGES = "python3-requests-gssapi"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-requests-gssapi-1.2.3-13.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-requests-gssapi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-requests-gssapi-1.2.3-13.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-requests-gssapi}"
RDEPENDS:python3-requests-gssapi = " \
 python3 \
 python3-requests \
 python3-gssapi \
"
