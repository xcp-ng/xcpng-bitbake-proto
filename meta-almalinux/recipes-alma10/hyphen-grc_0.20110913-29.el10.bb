
inherit dnf-bridge

PN = "hyphen-grc"
PE = "0"
PV = "0.20110913"
PR = "29.el10"
PACKAGES = "hyphen-grc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-grc-0.20110913-29.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-grc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-grc-0.20110913-29.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-grc}"
RDEPENDS:hyphen-grc = " \
 hyphen \
"
