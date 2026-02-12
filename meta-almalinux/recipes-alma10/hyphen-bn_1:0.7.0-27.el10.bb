
inherit dnf-bridge

PN = "hyphen-bn"
PE = "1"
PV = "0.7.0"
PR = "27.el10"
PACKAGES = "hyphen-bn"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-bn-0.7.0-27.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-bn = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-bn-0.7.0-27.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-bn}"
RDEPENDS:hyphen-bn = " \
 hyphen \
"
