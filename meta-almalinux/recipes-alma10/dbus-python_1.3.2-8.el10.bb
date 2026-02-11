
inherit dnf-bridge

PN = "dbus-python"
PE = "0"
PV = "1.3.2"
PR = "8.el10"
PACKAGES = "python3-dbus dbus-python-devel"


URI_python3-dbus = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-dbus-1.3.2-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-dbus = " \
 glibc \
 dbus-libs \
 python3 \
 glib2 \
"

URI_dbus-python-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/dbus-python-devel-1.3.2-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:dbus-python-devel = " \
 dbus-devel \
 pkgconf-pkg-config \
"
