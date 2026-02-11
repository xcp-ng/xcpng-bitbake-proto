
PN = "alsa-firmware"
PE = "0"
PV = "1.2.4"
PR = "17.el10"
PACKAGES = "alsa-firmware"


URI_alsa-firmware = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/alsa-firmware-1.2.4-17.el10.noarch.rpm;unpack=0"
RDEPENDS:alsa-firmware = " \
 systemd \
 alsa-tools-firmware \
"
