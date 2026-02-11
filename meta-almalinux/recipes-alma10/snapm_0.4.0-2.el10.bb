
inherit dnf-bridge

PN = "snapm"
PE = "0"
PV = "0.4.0"
PR = "2.el10"
PACKAGES = "python3-snapm python3-snapm-doc snapm"


URI_python3-snapm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-snapm-0.4.0-2.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-snapm = " \
 python3 \
 python3-wcwidth \
 python3-boom \
 python3-dateutil \
 python3-dbus-client-gen \
 python3-dbus-python-client-gen \
 python3-justbytes \
 python3-packaging \
"

URI_python3-snapm-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-snapm-doc-0.4.0-2.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-snapm-doc = ""

URI_snapm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/snapm-0.4.0-2.el10.noarch.rpm;unpack=0"
RDEPENDS:snapm = " \
 python3 \
 python3-snapm \
"
