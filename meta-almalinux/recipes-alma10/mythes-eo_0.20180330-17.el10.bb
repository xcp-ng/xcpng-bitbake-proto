
inherit dnf-bridge

PN = "mythes-eo"
PE = "0"
PV = "0.20180330"
PR = "17.el10"
PACKAGES = "hyphen-eo"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/mythes-eo-0.20180330-17.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-eo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-eo-0.20180330-17.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-eo}"
RDEPENDS:hyphen-eo = " \
 hyphen \
"
