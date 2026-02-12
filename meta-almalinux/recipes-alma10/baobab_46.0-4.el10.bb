
inherit dnf-bridge

PN = "baobab"
PE = "0"
PV = "46.0"
PR = "4.el10"
PACKAGES = "baobab"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/baobab-46.0-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_baobab = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/baobab-46.0-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_baobab}"
RDEPENDS:baobab = " \
 pango \
 cairo \
 glib2 \
 glibc \
 gtk4 \
 libadwaita \
"
