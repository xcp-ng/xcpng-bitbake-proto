
inherit dnf-bridge

PN = "alsa-sof-firmware"
PE = "0"
PV = "2024.09.2"
PR = "2.el10"
PACKAGES = "alsa-sof-firmware alsa-sof-firmware-debug"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/alsa-sof-firmware-2024.09.2-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_alsa-sof-firmware = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/alsa-sof-firmware-2024.09.2-2.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_alsa-sof-firmware}"
RDEPENDS:alsa-sof-firmware = ""

URI_alsa-sof-firmware-debug = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/alsa-sof-firmware-debug-2024.09.2-2.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_alsa-sof-firmware-debug}"
RDEPENDS:alsa-sof-firmware-debug = " \
 alsa-sof-firmware \
"
