
inherit dnf-bridge

PN = "hyphen-cy"
PE = "0"
PV = "0.20110620"
PR = "28.el10"
PACKAGES = "hyphen-cy"


URI_hyphen-cy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-cy-0.20110620-28.el10.noarch.rpm;unpack=0"
RDEPENDS:hyphen-cy = " \
 hyphen \
"
