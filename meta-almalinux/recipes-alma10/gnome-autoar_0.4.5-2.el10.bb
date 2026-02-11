
inherit dnf-bridge

PN = "gnome-autoar"
PE = "0"
PV = "0.4.5"
PR = "2.el10"
PACKAGES = "gnome-autoar gnome-autoar-devel"


URI_gnome-autoar = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-autoar-0.4.5-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-autoar = " \
 libarchive \
 libgcc \
 glib2 \
 gtk3 \
 glibc \
"

URI_gnome-autoar-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gnome-autoar-devel-0.4.5-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-autoar-devel = " \
 libarchive-devel \
 glib2-devel \
 pkgconf-pkg-config \
 gtk3-devel \
 gnome-autoar \
"
