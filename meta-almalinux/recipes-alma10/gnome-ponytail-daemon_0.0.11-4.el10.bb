
PN = "gnome-ponytail-daemon"
PE = "0"
PV = "0.0.11"
PR = "4.el10"
PACKAGES = "gnome-ponytail-daemon python3-gnome-ponytail-daemon"


URI_gnome-ponytail-daemon = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-ponytail-daemon-0.0.11-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-ponytail-daemon = "
 systemd
 libei
 libgcc
 bash
 glib2
 glibc
 libxkbcommon
"

URI_python3-gnome-ponytail-daemon = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-gnome-ponytail-daemon-0.0.11-4.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-gnome-ponytail-daemon = "
 python3
 python3-gobject
 python3-dbus
 gnome-ponytail-daemon
"
