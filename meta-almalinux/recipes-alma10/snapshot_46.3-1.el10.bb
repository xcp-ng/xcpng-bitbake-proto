
inherit dnf-bridge

PN = "snapshot"
PE = "0"
PV = "46.3"
PR = "1.el10"
PACKAGES = "snapshot"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/snapshot-46.3-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_snapshot = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/snapshot-46.3-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_snapshot}"
RDEPENDS:snapshot = " \
 gstreamer1 \
 gstreamer1-plugins-bad-free \
 libgcc \
 gstreamer1-plugins-base \
 glib2 \
 graphene \
 glibc \
 gtk4 \
 hicolor-icon-theme \
 libadwaita \
"
