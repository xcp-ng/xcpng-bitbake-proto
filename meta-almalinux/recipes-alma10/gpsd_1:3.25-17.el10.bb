
inherit dnf-bridge

PN = "gpsd"
PE = "1"
PV = "3.25"
PR = "17.el10"
PACKAGES = "gpsd gpsd-clients python3-gpsd gpsd-xclients"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/gpsd-3.25-17.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_gpsd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gpsd-3.25-17.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gpsd}"
RDEPENDS:gpsd = " \
 systemd \
 systemd-udev \
 ncurses-libs \
 bash \
 glibc \
 bluez-libs \
 dbus-libs \
 libusb1 \
"

URI_gpsd-clients = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gpsd-clients-3.25-17.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gpsd-clients}"
RDEPENDS:gpsd-clients = " \
 python3 \
 python3-gpsd \
 ncurses-libs \
 bash \
 glibc \
 bluez-libs \
 dbus-libs \
 libusb1 \
"

URI_python3-gpsd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-gpsd-3.25-17.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_python3-gpsd}"
RDEPENDS:python3-gpsd = " \
 glibc \
 python3-pyserial \
 python3 \
"

URI_gpsd-xclients = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gpsd-xclients-3.25-17.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gpsd-xclients}"
RDEPENDS:gpsd-xclients = " \
 python3 \
 python3-gobject \
 python3-gpsd \
 python3-cairo \
 gtk3 \
"
