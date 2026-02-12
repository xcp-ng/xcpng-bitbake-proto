
inherit dnf-bridge

PN = "cups-pk-helper"
PE = "0"
PV = "0.2.7"
PR = "9.el10"
PACKAGES = "cups-pk-helper"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/cups-pk-helper-0.2.7-9.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_cups-pk-helper = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cups-pk-helper-0.2.7-9.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_cups-pk-helper}"
RDEPENDS:cups-pk-helper = " \
 glibc \
 polkit-libs \
 cups-libs \
 glib2 \
"
