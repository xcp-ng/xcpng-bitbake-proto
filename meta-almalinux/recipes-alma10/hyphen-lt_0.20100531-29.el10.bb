
inherit dnf-bridge

PN = "hyphen-lt"
PE = "0"
PV = "0.20100531"
PR = "29.el10"
PACKAGES = "hyphen-lt"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-lt-0.20100531-29.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-lt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-lt-0.20100531-29.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-lt}"
RDEPENDS:hyphen-lt = " \
 hyphen \
"
