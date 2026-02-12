
inherit dnf-bridge

PN = "hplip"
PE = "0"
PV = "3.23.12"
PR = "8.el10"
PACKAGES = "hplip hplip-common hplip-libs libsane-hpaio"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hplip-3.23.12-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hplip = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hplip-3.23.12-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_hplip}"
RDEPENDS:hplip = " \
 python3 \
 systemd \
 tar \
 cups-libs \
 curl \
 python3-dbus \
 cups \
 dbus-libs \
 hplip-libs \
 usbutils \
 libstdc++ \
 zlib-ng-compat \
 gnupg2 \
 libgcc \
 bash \
 gawk \
 glibc \
 coreutils \
 libjpeg-turbo \
"

URI_hplip-common = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hplip-common-3.23.12-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_hplip-common}"
RDEPENDS:hplip-common = ""

URI_hplip-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hplip-libs-3.23.12-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_hplip-libs}"
RDEPENDS:hplip-libs = " \
 python3 \
 sane-backends-libs \
 net-snmp-libs \
 openssl-libs \
 cups-libs \
 avahi \
 avahi-libs \
 hplip-common \
 glibc \
 dbus-libs \
 libusb1 \
"

URI_libsane-hpaio = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libsane-hpaio-3.23.12-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libsane-hpaio}"
RDEPENDS:libsane-hpaio = " \
 hplip-libs \
 net-snmp-libs \
 openssl-libs \
 cups-libs \
 avahi \
 avahi-libs \
 glibc \
 dbus-libs \
 sane-backends \
 libusb1 \
"
