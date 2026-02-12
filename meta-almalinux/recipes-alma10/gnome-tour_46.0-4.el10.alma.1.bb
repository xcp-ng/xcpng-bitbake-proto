
inherit dnf-bridge

PN = "gnome-tour"
PE = "0"
PV = "46.0"
PR = "4.el10.alma.1"
PACKAGES = "gnome-tour"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/gnome-tour-46.0-4.el10.alma.1.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_gnome-tour = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-tour-46.0-4.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gnome-tour}"
RDEPENDS:gnome-tour = " \
 libgcc \
 pango \
 gdk-pixbuf2 \
 cairo \
 glib2 \
 glibc \
 gtk4 \
 libadwaita \
"
