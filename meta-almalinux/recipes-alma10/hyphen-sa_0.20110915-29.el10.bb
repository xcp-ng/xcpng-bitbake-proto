
inherit dnf-bridge

PN = "hyphen-sa"
PE = "0"
PV = "0.20110915"
PR = "29.el10"
PACKAGES = "hyphen-sa"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-sa-0.20110915-29.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-sa = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-sa-0.20110915-29.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-sa}"
RDEPENDS:hyphen-sa = " \
 hyphen \
"
