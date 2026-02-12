
inherit dnf-bridge

PN = "hyphen-ca"
PE = "1"
PV = "1.5"
PR = "5.el10"
PACKAGES = "hyphen-ca"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-ca-1.5-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-ca = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-ca-1.5-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-ca}"
RDEPENDS:hyphen-ca = " \
 hyphen \
"
