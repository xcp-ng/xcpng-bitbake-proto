
inherit dnf-bridge

PN = "gnome-characters"
PE = "0"
PV = "46.0"
PR = "3.el10"
PACKAGES = "gnome-characters"


URI_gnome-characters = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-characters-46.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-characters = " \
 gjs \
 gnome-desktop4 \
 glib2 \
 glibc \
 gtk4 \
 libadwaita \
"
