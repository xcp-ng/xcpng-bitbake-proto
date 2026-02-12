
inherit dnf-bridge

PN = "desktop-file-utils"
PE = "0"
PV = "0.26"
PR = "14.el10"
PACKAGES = "desktop-file-utils"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/desktop-file-utils-0.26-14.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_desktop-file-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/desktop-file-utils-0.26-14.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_desktop-file-utils}"
RDEPENDS:desktop-file-utils = " \
 glibc \
 emacs-filesystem \
 bash \
 glib2 \
"
