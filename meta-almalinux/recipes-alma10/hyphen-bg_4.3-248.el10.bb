
inherit dnf-bridge

PN = "hyphen-bg"
PE = "0"
PV = "4.3"
PR = "248.el10"
PACKAGES = "hyphen-bg"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-bg-4.3-248.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-bg = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-bg-4.3-248.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-bg}"
RDEPENDS:hyphen-bg = " \
 hyphen \
"
