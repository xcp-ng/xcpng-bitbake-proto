
inherit dnf-bridge

PN = "hyphen-sv"
PE = "0"
PV = "1.00.1"
PR = "36.el10"
PACKAGES = "hyphen-sv"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-sv-1.00.1-36.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-sv = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-sv-1.00.1-36.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-sv}"
RDEPENDS:hyphen-sv = " \
 hyphen \
"
