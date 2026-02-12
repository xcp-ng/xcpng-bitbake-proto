
inherit dnf-bridge

PN = "alsa-tools"
PE = "0"
PV = "1.2.11"
PR = "5.el10"
PACKAGES = "alsa-tools-firmware"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/alsa-tools-1.2.11-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_alsa-tools-firmware = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/alsa-tools-firmware-1.2.11-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_alsa-tools-firmware}"
RDEPENDS:alsa-tools-firmware = " \
 alsa-lib \
 systemd-udev \
 bash \
 fxload \
 glibc \
 alsa-firmware \
"
