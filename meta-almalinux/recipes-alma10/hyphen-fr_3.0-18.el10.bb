
inherit dnf-bridge

PN = "hyphen-fr"
PE = "0"
PV = "3.0"
PR = "18.el10"
PACKAGES = "hyphen-fr"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-fr-3.0-18.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-fr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-fr-3.0-18.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-fr}"
RDEPENDS:hyphen-fr = " \
 hyphen \
"
