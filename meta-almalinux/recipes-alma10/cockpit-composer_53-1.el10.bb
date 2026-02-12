
inherit dnf-bridge

PN = "cockpit-composer"
PE = "0"
PV = "53"
PR = "1.el10"
PACKAGES = "cockpit-composer"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/cockpit-composer-53-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_cockpit-composer = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/cockpit-composer-53-1.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_cockpit-composer}"
RDEPENDS:cockpit-composer = " \
 cockpit \
 osbuild-composer \
"
