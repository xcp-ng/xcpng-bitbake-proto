
PN = "system-config-printer"
PE = "0"
PV = "1.5.18"
PR = "11.el10"
PACKAGES = "system-config-printer-libs system-config-printer-udev"


URI_system-config-printer-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/system-config-printer-libs-1.5.18-11.el10.noarch.rpm;unpack=0"
RDEPENDS:system-config-printer-libs = " \
 python3 \
 python3-gobject \
 gobject-introspection \
 python3-dbus \
 python3-cups \
 bash \
 gtk3 \
 libnotify \
"

URI_system-config-printer-udev = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/system-config-printer-udev-1.5.18-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:system-config-printer-udev = " \
 python3 \
 systemd-libs \
 system-config-printer-libs \
 cups-libs \
 glib2 \
 glibc \
 libusb1 \
"
