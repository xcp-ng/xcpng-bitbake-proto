
PN = "gnome-control-center"
PE = "0"
PV = "47.3"
PR = "4.el10"
PACKAGES = "gnome-control-center gnome-control-center-filesystem"


URI_gnome-control-center = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-control-center-47.3-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-control-center = " \
 ModemManager-glib \
 libpwquality \
 cups-libs \
 pango \
 fontconfig \
 libX11 \
 krb5-libs \
 libudisks2 \
 dbus \
 upower-libs \
 ibus-libs \
 upower \
 NetworkManager-libnm \
 libnma-gtk4 \
 gnome-bluetooth-libs \
 libsmbclient \
 cups-pk-helper \
 libXi \
 accountsservice \
 accountsservice-libs \
 tecla \
 libepoxy \
 gnome-desktop4 \
 gnome-control-center-filesystem \
 json-glib \
 cairo \
 gnome-online-accounts \
 libadwaita \
 gcr-libs \
 alsa-lib \
 gnome-settings-daemon \
 libwacom \
 gnutls \
 pulseaudio-libs \
 libgcc \
 pulseaudio-libs-glib2 \
 libxml2 \
 gdk-pixbuf2 \
 libgudev \
 libsecret \
 libgtop2 \
 graphene \
 libsoup3 \
 gsound \
 gsettings-desktop-schemas \
 pkgconf-pkg-config \
 polkit-libs \
 colord \
 glib2 \
 colord-libs \
 colord-gtk4 \
 glibc \
 gtk4 \
 iso-codes \
"

URI_gnome-control-center-filesystem = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-control-center-filesystem-47.3-4.el10.noarch.rpm;unpack=0"
RDEPENDS:gnome-control-center-filesystem = ""
