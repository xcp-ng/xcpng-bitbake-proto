
inherit dnf-bridge

PN = "hyphen-it"
PE = "0"
PV = "5.1.1"
PR = "8.el10"
PACKAGES = "hyphen-it"


URI_hyphen-it = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-it-5.1.1-8.el10.noarch.rpm;unpack=0"
RDEPENDS:hyphen-it = " \
 hyphen \
"
