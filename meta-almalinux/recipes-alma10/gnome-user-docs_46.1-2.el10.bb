
inherit dnf-bridge

PN = "gnome-user-docs"
PE = "0"
PV = "46.1"
PR = "2.el10"
PACKAGES = "gnome-user-docs"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/gnome-user-docs-46.1-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_gnome-user-docs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-user-docs-46.1-2.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_gnome-user-docs}"
RDEPENDS:gnome-user-docs = ""
