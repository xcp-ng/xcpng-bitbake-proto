
inherit dnf-bridge

PN = "hyphen-mi"
PE = "0"
PV = "0.20080630"
PR = "32.el10"
PACKAGES = "hyphen-mi"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-mi-0.20080630-32.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-mi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-mi-0.20080630-32.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-mi}"
RDEPENDS:hyphen-mi = " \
 hyphen \
"
