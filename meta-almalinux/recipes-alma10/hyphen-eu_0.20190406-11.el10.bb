
inherit dnf-bridge

PN = "hyphen-eu"
PE = "0"
PV = "0.20190406"
PR = "11.el10"
PACKAGES = "hyphen-eu"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-eu-0.20190406-11.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-eu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-eu-0.20190406-11.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-eu}"
RDEPENDS:hyphen-eu = " \
 hyphen \
"
