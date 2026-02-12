
inherit dnf-bridge

PN = "hyphen-ru"
PE = "0"
PV = "0.20200325"
PR = "13.el10"
PACKAGES = "hyphen-ru"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-ru-0.20200325-13.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-ru = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-ru-0.20200325-13.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-ru}"
RDEPENDS:hyphen-ru = " \
 hyphen \
"
