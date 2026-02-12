
inherit dnf-bridge

PN = "gnome-clocks"
PE = "0"
PV = "46.0"
PR = "1.el10"
PACKAGES = "gnome-clocks"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/gnome-clocks-46.0-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_gnome-clocks = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-clocks-46.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gnome-clocks}"
RDEPENDS:gnome-clocks = " \
 gnome-desktop4 \
 geocode-glib \
 glib2 \
 geoclue2-libs \
 glibc \
 gtk4 \
 libadwaita \
 libgweather \
"
