
inherit dnf-bridge

PN = "python-dbus-python-client-gen"
PE = "0"
PV = "0.8.3"
PR = "7.el10"
PACKAGES = "python3-dbus-python-client-gen"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-dbus-python-client-gen-0.8.3-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-dbus-python-client-gen = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-dbus-python-client-gen-0.8.3-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-dbus-python-client-gen}"
RDEPENDS:python3-dbus-python-client-gen = " \
 python3 \
 python3-into-dbus-python \
 python3-dbus \
"
