
inherit dnf-bridge

PN = "hyphen-hu"
PE = "0"
PV = "0.20090612"
PR = "35.el10"
PACKAGES = "hyphen-hu"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-hu-0.20090612-35.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-hu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-hu-0.20090612-35.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-hu}"
RDEPENDS:hyphen-hu = " \
 hyphen \
"
