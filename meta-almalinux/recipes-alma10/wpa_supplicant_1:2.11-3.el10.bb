
inherit dnf-bridge

PN = "wpa_supplicant"
PE = "1"
PV = "2.11"
PR = "3.el10"
PACKAGES = "wpa_supplicant"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/wpa_supplicant-2.11-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_wpa_supplicant = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/wpa_supplicant-2.11-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_wpa_supplicant}"
RDEPENDS:wpa_supplicant = " \
 systemd \
 openssl-libs \
 libnl3 \
 bash \
 glibc \
 dbus-libs \
"
