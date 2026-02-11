
PN = "bluez"
PE = "0"
PV = "5.77"
PR = "6.el10"
PACKAGES = "bluez bluez-libs bluez-cups bluez-obexd bluez-libs-devel bluez-hid2hci bluez-mesh"


URI_bluez = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/bluez-5.77-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bluez = "
 systemd
 systemd-libs
 readline
 bash
 glib2
 dbus
 glibc
 dbus-libs
"

URI_bluez-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/bluez-libs-5.77-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bluez-libs = "
 glibc
"

URI_bluez-cups = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bluez-cups-5.77-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bluez-cups = "
 cups
 glib2
 glibc
 bluez
 dbus-libs
"

URI_bluez-obexd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bluez-obexd-5.77-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bluez-obexd = "
 libical
 bash
 glib2
 glibc
 bluez
 bluez-libs
 dbus-libs
"

URI_bluez-libs-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/bluez-libs-devel-5.77-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bluez-libs-devel = "
 glibc
 bluez-libs
 pkgconf-pkg-config
"

URI_bluez-hid2hci = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/bluez-hid2hci-5.77-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bluez-hid2hci = "
 glibc
 bluez
 bash
 systemd-libs
"

URI_bluez-mesh = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/bluez-mesh-5.77-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bluez-mesh = "
 libell
 json-c
 readline
 bash
 glibc
 bluez
 bluez-libs
"
