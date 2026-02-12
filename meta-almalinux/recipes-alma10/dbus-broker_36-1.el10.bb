
inherit dnf-bridge

PN = "dbus-broker"
PE = "0"
PV = "36"
PR = "1.el10"
PACKAGES = "dbus-broker"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/dbus-broker-36-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_dbus-broker = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dbus-broker-36-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dbus-broker}"
RDEPENDS:dbus-broker = " \
 shadow-utils \
 systemd-libs \
 audit-libs \
 libgcc \
 libcap-ng \
 bash \
 expat \
 glibc \
 libselinux \
 dbus-common \
"
