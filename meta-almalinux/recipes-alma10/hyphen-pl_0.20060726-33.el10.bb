
inherit dnf-bridge

PN = "hyphen-pl"
PE = "0"
PV = "0.20060726"
PR = "33.el10"
PACKAGES = "hyphen-pl"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-pl-0.20060726-33.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-pl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-pl-0.20060726-33.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-pl}"
RDEPENDS:hyphen-pl = " \
 hyphen \
"
