
inherit dnf-bridge

PN = "hyphen-gu"
PE = "1"
PV = "0.7.0"
PR = "27.el10"
PACKAGES = "hyphen-gu"


URI_hyphen-gu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-gu-0.7.0-27.el10.noarch.rpm;unpack=0"
RDEPENDS:hyphen-gu = " \
 hyphen \
"
