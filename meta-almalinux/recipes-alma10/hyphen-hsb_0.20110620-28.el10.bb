
inherit dnf-bridge

PN = "hyphen-hsb"
PE = "0"
PV = "0.20110620"
PR = "28.el10"
PACKAGES = "hyphen-hsb"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-hsb-0.20110620-28.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-hsb = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-hsb-0.20110620-28.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-hsb}"
RDEPENDS:hyphen-hsb = " \
 hyphen \
"
