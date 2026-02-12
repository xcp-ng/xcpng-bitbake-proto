
inherit dnf-bridge

PN = "xdg-utils"
PE = "0"
PV = "1.2.0"
PR = "3.el10"
PACKAGES = "xdg-utils"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/xdg-utils-1.2.0-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_xdg-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xdg-utils-1.2.0-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_xdg-utils}"
RDEPENDS:xdg-utils = " \
 coreutils \
 desktop-file-utils \
 bash \
 which \
"
