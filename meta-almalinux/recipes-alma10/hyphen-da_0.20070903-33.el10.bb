
inherit dnf-bridge

PN = "hyphen-da"
PE = "0"
PV = "0.20070903"
PR = "33.el10"
PACKAGES = "hyphen-da"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-da-0.20070903-33.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-da = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-da-0.20070903-33.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-da}"
RDEPENDS:hyphen-da = " \
 hyphen \
"
