
PN = "thermald"
PE = "0"
PV = "2.5.7"
PR = "5.el10"
PACKAGES = "thermald"


URI_thermald = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/thermald-2.5.7-5.el10.x86_64_v2.rpm;unpack=0"
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
