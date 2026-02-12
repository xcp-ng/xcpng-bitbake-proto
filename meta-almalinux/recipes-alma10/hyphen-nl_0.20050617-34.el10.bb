
inherit dnf-bridge

PN = "hyphen-nl"
PE = "0"
PV = "0.20050617"
PR = "34.el10"
PACKAGES = "hyphen-nl"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-nl-0.20050617-34.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-nl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-nl-0.20050617-34.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-nl}"
RDEPENDS:hyphen-nl = " \
 hyphen \
"
