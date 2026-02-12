
inherit dnf-bridge

PN = "hyphen-de"
PE = "0"
PV = "0.20060120"
PR = "35.el10"
PACKAGES = "hyphen-de"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-de-0.20060120-35.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-de = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-de-0.20060120-35.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-de}"
RDEPENDS:hyphen-de = " \
 hyphen \
"
