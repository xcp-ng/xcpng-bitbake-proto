
PN = "gnome-session"
PE = "0"
PV = "46.0"
PR = "8.el10_0.alma.1"
PACKAGES = "gnome-session gnome-session-wayland-session"


URI_gnome-session = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-session-46.0-8.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-session = " \
 systemd-libs \
 libICE \
 libSM \
 libX11 \
 dbus \
 libXcomposite \
 gnome-control-center-filesystem \
 libepoxy \
 gnome-desktop3 \
 json-glib \
 dconf \
 almalinux-logos \
 libglvnd-egl \
 libglvnd-gles \
 libglvnd-glx \
 libgcc \
 bash \
 gsettings-desktop-schemas \
 glib2 \
 gtk3 \
 glibc \
"

URI_gnome-session-wayland-session = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-session-wayland-session-46.0-8.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-session-wayland-session = " \
 gnome-session \
 gnome-shell \
 xorg-x11-server-Xwayland \
"
