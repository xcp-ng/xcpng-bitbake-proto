
inherit dnf-bridge

PN = "hyphen-ro"
PE = "0"
PV = "3.3.6"
PR = "29.el10"
PACKAGES = "hyphen-ro"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-ro-3.3.6-29.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-ro = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-ro-3.3.6-29.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-ro}"
RDEPENDS:hyphen-ro = " \
 hyphen \
"
