
inherit dnf-bridge

PN = "memtest86+"
PE = "0"
PV = "7.00"
PR = "8.el10"
PACKAGES = "memtest86+"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/memtest86+-7.00-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_memtest86+ = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/memtest86+-7.00-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_memtest86+}"
RDEPENDS:memtest86+ = " \
 systemd-udev \
 bash \
"
