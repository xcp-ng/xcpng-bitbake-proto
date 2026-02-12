
inherit dnf-bridge

PN = "hyphen-el"
PE = "0"
PV = "0.20051018"
PR = "33.el10"
PACKAGES = "hyphen-el"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-el-0.20051018-33.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-el = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-el-0.20051018-33.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-el}"
RDEPENDS:hyphen-el = " \
 hyphen \
"
