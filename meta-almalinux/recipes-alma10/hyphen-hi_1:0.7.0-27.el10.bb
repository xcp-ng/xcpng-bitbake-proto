
inherit dnf-bridge

PN = "hyphen-hi"
PE = "1"
PV = "0.7.0"
PR = "27.el10"
PACKAGES = "hyphen-hi"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-hi-0.7.0-27.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-hi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-hi-0.7.0-27.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-hi}"
RDEPENDS:hyphen-hi = " \
 hyphen \
"
