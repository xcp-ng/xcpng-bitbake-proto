
inherit dnf-bridge

PN = "spice-html5"
PE = "0"
PV = "0.3.0"
PR = "8.el10"
PACKAGES = "spice-html5"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/spice-html5-0.3.0-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_spice-html5 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/spice-html5-0.3.0-8.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_spice-html5}"
RDEPENDS:spice-html5 = ""
