
inherit dnf-bridge

PN = "cups"
PE = "1"
PV = "2.4.10"
PR = "11.el10_0.1"
PACKAGES = "cups-filesystem cups-libs cups cups-client cups-devel cups-ipptool cups-lpd cups-printerapp"


URI_cups-filesystem = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cups-filesystem-2.4.10-11.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:cups-filesystem = ""

URI_cups-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cups-libs-2.4.10-11.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:cups-libs = " \
 zlib-ng-compat \
 gnutls \
 cups-filesystem \
 krb5-libs \
 avahi-libs \
 glibc \
"

URI_cups = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cups-2.4.10-11.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:cups = " \
 python3 \
 systemd \
 systemd-libs \
 cups-filesystem \
 cups-libs \
 krb5-libs \
 dbus \
 dbus-libs \
 libselinux \
 cups-client \
 cups-filters \
 libacl \
 acl \
 libstdc++ \
 sed \
 libusb1 \
 audit-libs \
 libgcc \
 grep \
 pam-libs \
 avahi-libs \
 bash \
 glibc \
"

URI_cups-client = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cups-client-2.4.10-11.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:cups-client = " \
 glibc \
 cups-libs \
 bash \
 alternatives \
"

URI_cups-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cups-devel-2.4.10-11.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:cups-devel = " \
 gnutls-devel \
 zlib-ng-compat-devel \
 avahi-devel \
 cups-libs \
 pkgconf-pkg-config \
 bash \
 krb5-devel \
"

URI_cups-ipptool = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cups-ipptool-2.4.10-11.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:cups-ipptool = " \
 glibc \
 avahi-libs \
 avahi \
 cups-libs \
"

URI_cups-lpd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cups-lpd-2.4.10-11.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:cups-lpd = " \
 glibc \
 cups-libs \
 bash \
 cups \
"

URI_cups-printerapp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cups-printerapp-2.4.10-11.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:cups-printerapp = " \
 cups-libs \
 avahi \
 pam-libs \
 avahi-libs \
 glibc \
"
