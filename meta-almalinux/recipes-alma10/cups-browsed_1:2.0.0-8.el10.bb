
inherit dnf-bridge

PN = "cups-browsed"
PE = "1"
PV = "2.0.0"
PR = "8.el10"
PACKAGES = "cups-browsed"


URI_cups-browsed = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cups-browsed-2.0.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cups-browsed = " \
 systemd \
 cups-filesystem \
 cups-libs \
 avahi-glib \
 avahi-libs \
 bash \
 glib2 \
 libcupsfilters \
 glibc \
 libppd \
"
