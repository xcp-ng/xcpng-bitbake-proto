
inherit dnf-bridge

PN = "thermald"
PE = "0"
PV = "2.5.7"
PR = "5.el10"
PACKAGES = "thermald"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/thermald-2.5.7-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_thermald = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/thermald-2.5.7-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_thermald}"
RDEPENDS:thermald = " \
 glibc-common \
 shadow-utils \
 systemd \
 libgcc \
 libxml2 \
 libstdc++ \
 bash \
 glib2 \
 libevdev \
 upower-libs \
 glibc \
 dbus \
"
