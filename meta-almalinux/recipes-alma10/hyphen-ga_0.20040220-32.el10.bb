
inherit dnf-bridge

PN = "hyphen-ga"
PE = "0"
PV = "0.20040220"
PR = "32.el10"
PACKAGES = "hyphen-ga"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-ga-0.20040220-32.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-ga = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-ga-0.20040220-32.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-ga}"
RDEPENDS:hyphen-ga = " \
 hyphen \
"
