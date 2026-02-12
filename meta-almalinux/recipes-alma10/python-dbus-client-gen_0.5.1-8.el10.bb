
inherit dnf-bridge

PN = "python-dbus-client-gen"
PE = "0"
PV = "0.5.1"
PR = "8.el10"
PACKAGES = "python3-dbus-client-gen"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-dbus-client-gen-0.5.1-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-dbus-client-gen = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-dbus-client-gen-0.5.1-8.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-dbus-client-gen}"
RDEPENDS:python3-dbus-client-gen = " \
 python3 \
"
