
inherit dnf-bridge

PN = "gnome-initial-setup"
PE = "0"
PV = "46.alpha"
PR = "15.el10_0.alma.1"
PACKAGES = "gnome-initial-setup"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/gnome-initial-setup-46.alpha-15.el10_0.alma.1.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_gnome-initial-setup = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-initial-setup-46.alpha-15.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gnome-initial-setup}"
RDEPENDS:gnome-initial-setup = " \
 libpwquality \
 pango \
 fontconfig \
 krb5-libs \
 ibus-libs \
 NetworkManager-libnm \
 libnma-gtk4 \
 tecla \
 accountsservice-libs \
 gnome-desktop4 \
 cairo \
 libadwaita \
 shadow-utils \
 libgcc \
 gdk-pixbuf2 \
 libsecret \
 bash \
 gdm \
 geoclue2-libs \
 geocode-glib \
 libgweather \
 polkit \
 polkit-libs \
 glib2 \
 glibc \
 gtk4 \
"
