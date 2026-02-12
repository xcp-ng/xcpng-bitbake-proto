
inherit dnf-bridge

PN = "gnome-color-manager"
PE = "0"
PV = "3.36.0"
PR = "14.el10"
PACKAGES = "gnome-color-manager"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/gnome-color-manager-3.36.0-14.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_gnome-color-manager = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-color-manager-3.36.0-14.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gnome-color-manager}"
RDEPENDS:gnome-color-manager = " \
 lcms2 \
 shared-mime-info \
 libgcc \
 pango \
 gdk-pixbuf2 \
 cairo \
 glib2 \
 gtk3 \
 glibc \
 colord-libs \
"
