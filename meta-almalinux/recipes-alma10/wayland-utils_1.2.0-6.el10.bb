
inherit dnf-bridge

PN = "wayland-utils"
PE = "0"
PV = "1.2.0"
PR = "6.el10"
PACKAGES = "wayland-utils"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/wayland-utils-1.2.0-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_wayland-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/wayland-utils-1.2.0-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_wayland-utils}"
RDEPENDS:wayland-utils = " \
 glibc \
 libdrm \
 libwayland-client \
"
