
inherit dnf-bridge

PN = "hyphen-or"
PE = "1"
PV = "0.7.0"
PR = "28.el10"
PACKAGES = "hyphen-or"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-or-0.7.0-28.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-or = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-or-0.7.0-28.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-or}"
RDEPENDS:hyphen-or = " \
 hyphen \
"
