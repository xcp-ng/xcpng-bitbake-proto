
inherit dnf-bridge

PN = "hyphen-is"
PE = "0"
PV = "0.20030920"
PR = "35.el10"
PACKAGES = "hyphen-is"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-is-0.20030920-35.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-is = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-is-0.20030920-35.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-is}"
RDEPENDS:hyphen-is = " \
 hyphen \
"
