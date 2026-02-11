
PN = "gnome-settings-daemon"
PE = "0"
PV = "47.2"
PR = "5.el10.alma.1"
PACKAGES = "gnome-settings-daemon gnome-settings-daemon-server-defaults gnome-settings-daemon-devel"


URI_gnome-settings-daemon = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-settings-daemon-47.2-5.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-settings-daemon = "
 ModemManager-glib
 systemd-libs
 cups-libs
 pango
 fontconfig
 libX11
 libcanberra
 libcanberra-gtk3
 upower-libs
 NetworkManager-libnm
 libXext
 libnotify
 libXfixes
 libXi
 gnome-desktop3
 cairo
 gcr-libs
 alsa-lib
 iio-sensor-proxy
 libwacom
 libwayland-client
 pulseaudio-libs
 libgcc
 pulseaudio-libs-glib2
 p11-kit
 libgudev
 bash
 geoclue2
 geoclue2-libs
 geocode-glib
 libgweather
 gsettings-desktop-schemas
 polkit-libs
 colord
 glib2
 gtk3
 colord-libs
 glibc
"

URI_gnome-settings-daemon-server-defaults = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-settings-daemon-server-defaults-47.2-5.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-settings-daemon-server-defaults = "
 gnome-settings-daemon
"

URI_gnome-settings-daemon-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gnome-settings-daemon-devel-47.2-5.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-settings-daemon-devel = "
 pkgconf-pkg-config
 gnome-settings-daemon
"
