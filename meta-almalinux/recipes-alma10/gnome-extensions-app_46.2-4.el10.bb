
inherit dnf-bridge

PN = "gnome-extensions-app"
PE = "0"
PV = "46.2"
PR = "4.el10"
PACKAGES = "gnome-extensions-app"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/gnome-extensions-app-46.2-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_gnome-extensions-app = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-extensions-app-46.2-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gnome-extensions-app}"
RDEPENDS:gnome-extensions-app = " \
 gjs \
 libgcc \
 libX11 \
 bash \
 glib2 \
 glibc \
 gtk4 \
 libadwaita \
"
