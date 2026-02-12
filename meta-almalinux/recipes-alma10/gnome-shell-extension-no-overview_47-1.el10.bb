
inherit dnf-bridge

PN = "gnome-shell-extension-no-overview"
PE = "0"
PV = "47"
PR = "1.el10"
PACKAGES = "gnome-shell-extension-no-overview"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/gnome-shell-extension-no-overview-47-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_gnome-shell-extension-no-overview = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gnome-shell-extension-no-overview-47-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_gnome-shell-extension-no-overview}"
RDEPENDS:gnome-shell-extension-no-overview = ""
