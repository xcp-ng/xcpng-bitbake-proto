
inherit dnf-bridge

PN = "hyphen-id"
PE = "0"
PV = "0.20040812"
PR = "31.el10"
PACKAGES = "hyphen-id"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-id-0.20040812-31.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-id = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-id-0.20040812-31.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-id}"
RDEPENDS:hyphen-id = " \
 hyphen \
"
