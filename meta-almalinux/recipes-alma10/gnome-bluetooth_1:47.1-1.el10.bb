
inherit dnf-bridge

PN = "gnome-bluetooth"
PE = "1"
PV = "47.1"
PR = "1.el10"
PACKAGES = "gnome-bluetooth gnome-bluetooth-libs gnome-bluetooth-libs-devel"


URI_gnome-bluetooth = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-bluetooth-47.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-bluetooth = " \
 gnome-bluetooth-libs \
 bluez \
 libgcc \
 bluez-obexd \
 pipewire-pulseaudio \
 glib2 \
 glibc \
 gtk4 \
 libadwaita \
"

URI_gnome-bluetooth-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-bluetooth-libs-47.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-bluetooth-libs = " \
 systemd-libs \
 gsound \
 libgcc \
 glib2 \
 upower-libs \
 glibc \
 gtk4 \
 libadwaita \
 libnotify \
"

URI_gnome-bluetooth-libs-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gnome-bluetooth-libs-devel-47.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-bluetooth-libs-devel = " \
 gnome-bluetooth-libs \
 glib2-devel \
 pkgconf-pkg-config \
 libadwaita-devel \
 gtk4-devel \
 gnome-bluetooth \
"
