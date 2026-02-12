
inherit dnf-bridge

PN = "hyphen-sl"
PE = "0"
PV = "0.20070127"
PR = "32.el10"
PACKAGES = "hyphen-sl"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-sl-0.20070127-32.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-sl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-sl-0.20070127-32.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-sl}"
RDEPENDS:hyphen-sl = " \
 hyphen \
"
