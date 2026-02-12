
inherit dnf-bridge

PN = "hyphen-fa"
PE = "0"
PV = "0.20130404"
PR = "25.el10"
PACKAGES = "hyphen-fa"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-fa-0.20130404-25.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-fa = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-fa-0.20130404-25.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-fa}"
RDEPENDS:hyphen-fa = " \
 hyphen \
"
