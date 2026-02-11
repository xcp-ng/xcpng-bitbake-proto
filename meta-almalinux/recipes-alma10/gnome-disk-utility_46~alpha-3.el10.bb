
inherit dnf-bridge

PN = "gnome-disk-utility"
PE = "0"
PV = "46~alpha"
PR = "3.el10"
PACKAGES = "gnome-disk-utility"


URI_gnome-disk-utility = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-disk-utility-46~alpha-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-disk-utility = " \
 libdvdread \
 atk \
 libhandy \
 systemd-libs \
 libpwquality \
 libgcc \
 pango \
 gdk-pixbuf2 \
 libudisks2 \
 libsecret \
 libcanberra-gtk3 \
 cairo \
 glib2 \
 gtk3 \
 glibc \
 udisks2 \
 xz-libs \
 libnotify \
"
