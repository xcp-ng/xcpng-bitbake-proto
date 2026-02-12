
inherit dnf-bridge

PN = "synce4l"
PE = "0"
PV = "1.1.0"
PR = "5.el10"
PACKAGES = "synce4l"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/synce4l-1.1.0-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_synce4l = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/synce4l-1.1.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_synce4l}"
RDEPENDS:synce4l = " \
 glibc \
 systemd \
 bash \
 libnl3 \
"
