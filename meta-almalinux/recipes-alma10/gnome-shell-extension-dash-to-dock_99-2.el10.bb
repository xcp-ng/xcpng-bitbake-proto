
inherit dnf-bridge

PN = "gnome-shell-extension-dash-to-dock"
PE = "0"
PV = "99"
PR = "2.el10"
PACKAGES = "gnome-shell-extension-dash-to-dock"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/gnome-shell-extension-dash-to-dock-99-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_gnome-shell-extension-dash-to-dock = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-shell-extension-dash-to-dock-99-2.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_gnome-shell-extension-dash-to-dock}"
RDEPENDS:gnome-shell-extension-dash-to-dock = " \
 gnome-shell-extension-common \
"
