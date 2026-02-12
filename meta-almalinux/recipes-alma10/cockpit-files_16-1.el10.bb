
inherit dnf-bridge

PN = "cockpit-files"
PE = "0"
PV = "16"
PR = "1.el10"
PACKAGES = "cockpit-files"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/cockpit-files-16-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_cockpit-files = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cockpit-files-16-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_cockpit-files}"
RDEPENDS:cockpit-files = " \
 cockpit-bridge \
"
