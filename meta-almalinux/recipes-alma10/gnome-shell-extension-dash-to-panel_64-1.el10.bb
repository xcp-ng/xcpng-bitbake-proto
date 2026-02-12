
inherit dnf-bridge

PN = "gnome-shell-extension-dash-to-panel"
PE = "0"
PV = "64"
PR = "1.el10"
PACKAGES = "gnome-shell-extension-dash-to-panel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/gnome-shell-extension-dash-to-panel-64-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_gnome-shell-extension-dash-to-panel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-shell-extension-dash-to-panel-64-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_gnome-shell-extension-dash-to-panel}"
RDEPENDS:gnome-shell-extension-dash-to-panel = " \
 gnome-shell \
"
