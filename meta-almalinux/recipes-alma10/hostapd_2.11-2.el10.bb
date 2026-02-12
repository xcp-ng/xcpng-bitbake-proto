
inherit dnf-bridge

PN = "hostapd"
PE = "0"
PV = "2.11"
PR = "2.el10"
PACKAGES = "hostapd hostapd-logwatch"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hostapd-2.11-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hostapd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hostapd-2.11-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_hostapd}"
RDEPENDS:hostapd = " \
 systemd \
 openssl-libs \
 libnl3 \
 bash \
 glibc \
"

URI_hostapd-logwatch = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/hostapd-logwatch-2.11-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_hostapd-logwatch}"
RDEPENDS:hostapd-logwatch = " \
 perl-interpreter \
 perl-libs \
 hostapd \
 logwatch \
"
