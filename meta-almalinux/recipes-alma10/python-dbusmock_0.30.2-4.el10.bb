
inherit dnf-bridge

PN = "python-dbusmock"
PE = "0"
PV = "0.30.2"
PR = "4.el10"
PACKAGES = "python3-dbusmock"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/python-dbusmock-0.30.2-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-dbusmock = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-dbusmock-0.30.2-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-dbusmock}"
RDEPENDS:python3-dbusmock = " \
 python3 \
 python3-gobject \
 python3-dbus \
 dbus-x11 \
"
