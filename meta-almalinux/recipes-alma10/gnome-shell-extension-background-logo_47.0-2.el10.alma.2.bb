
inherit dnf-bridge

PN = "gnome-shell-extension-background-logo"
PE = "0"
PV = "47.0"
PR = "2.el10.alma.2"
PACKAGES = "gnome-shell-extension-background-logo"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/gnome-shell-extension-background-logo-47.0-2.el10.alma.2.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_gnome-shell-extension-background-logo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-shell-extension-background-logo-47.0-2.el10.alma.2.noarch.rpm;unpack=0"
SRC_URI += "${URI_gnome-shell-extension-background-logo}"
RDEPENDS:gnome-shell-extension-background-logo = " \
 almalinux-logos \
 gnome-shell \
"
