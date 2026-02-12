
inherit dnf-bridge

PN = "gnome-devel-docs"
PE = "0"
PV = "40.3"
PR = "12.el10"
PACKAGES = "gnome-devel-docs"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/gnome-devel-docs-40.3-12.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_gnome-devel-docs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-devel-docs-40.3-12.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_gnome-devel-docs}"
RDEPENDS:gnome-devel-docs = ""
