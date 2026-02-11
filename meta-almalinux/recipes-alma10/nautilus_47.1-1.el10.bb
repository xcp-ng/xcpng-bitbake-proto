
inherit dnf-bridge

PN = "nautilus"
PE = "0"
PV = "47.1"
PR = "1.el10"
PACKAGES = "nautilus nautilus-extensions nautilus-devel"


URI_nautilus = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nautilus-47.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:nautilus = " \
 gvfs \
 libtracker-sparql \
 pango \
 libX11 \
 libselinux \
 gnome-autoar \
 nautilus-extensions \
 gnome-desktop4 \
 cairo \
 libportal \
 libportal-gtk4 \
 libadwaita \
 libgexiv2 \
 libwayland-client \
 libgcc \
 gdk-pixbuf2 \
 graphene \
 tracker-miners \
 gstreamer1 \
 gsettings-desktop-schemas \
 gstreamer1-plugins-base \
 glib2 \
 glibc \
 gtk4 \
"

URI_nautilus-extensions = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nautilus-extensions-47.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:nautilus-extensions = " \
 glibc \
 libgcc \
 glib2 \
"

URI_nautilus-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/nautilus-devel-47.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:nautilus-devel = " \
 glib2-devel \
 pkgconf-pkg-config \
 nautilus \
 nautilus-extensions \
"
