
inherit dnf-bridge

PN = "spice-protocol"
PE = "0"
PV = "0.14.4"
PR = "7.el10"
PACKAGES = "spice-protocol"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/spice-protocol-0.14.4-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_spice-protocol = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/spice-protocol-0.14.4-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_spice-protocol}"
RDEPENDS:spice-protocol = " \
 pkgconf-pkg-config \
"
