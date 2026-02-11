
PN = "gnome-kiosk"
PE = "0"
PV = "47.0"
PR = "9.el10_0"
PACKAGES = "gnome-kiosk gnome-kiosk-script-session gnome-kiosk-search-appliance"


URI_gnome-kiosk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-kiosk-47.0-9.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-kiosk = " \
 systemd-libs \
 libglvnd-gles \
 gsettings-desktop-schemas \
 libgcc \
 gnome-desktop4 \
 gdk-pixbuf2 \
 libX11 \
 mutter \
 glib2 \
 cairo \
 ibus-libs \
 glibc \
 gnome-settings-daemon \
"

URI_gnome-kiosk-script-session = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-kiosk-script-session-47.0-9.el10_0.noarch.rpm;unpack=0"
RDEPENDS:gnome-kiosk-script-session = " \
 gnome-kiosk \
 gnome-session \
 bash \
"

URI_gnome-kiosk-search-appliance = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-kiosk-search-appliance-47.0-9.el10_0.noarch.rpm;unpack=0"
RDEPENDS:gnome-kiosk-search-appliance = " \
 gnome-kiosk \
 gnome-session \
 flatpak \
"
