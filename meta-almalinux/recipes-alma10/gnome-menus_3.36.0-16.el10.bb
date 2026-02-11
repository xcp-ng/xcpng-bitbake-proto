
inherit dnf-bridge

PN = "gnome-menus"
PE = "0"
PV = "3.36.0"
PR = "16.el10"
PACKAGES = "gnome-menus gnome-menus-devel"


URI_gnome-menus = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-menus-3.36.0-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-menus = " \
 glibc \
 glib2 \
"

URI_gnome-menus-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gnome-menus-devel-3.36.0-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-menus-devel = " \
 glib2-devel \
 pkgconf-pkg-config \
 gnome-menus \
"
