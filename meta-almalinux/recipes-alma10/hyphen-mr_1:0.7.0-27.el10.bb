
inherit dnf-bridge

PN = "hyphen-mr"
PE = "1"
PV = "0.7.0"
PR = "27.el10"
PACKAGES = "hyphen-mr"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-mr-0.7.0-27.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-mr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-mr-0.7.0-27.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-mr}"
RDEPENDS:hyphen-mr = " \
 hyphen \
"
