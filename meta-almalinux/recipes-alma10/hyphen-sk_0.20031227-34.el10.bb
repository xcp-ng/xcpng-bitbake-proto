
inherit dnf-bridge

PN = "hyphen-sk"
PE = "0"
PV = "0.20031227"
PR = "34.el10"
PACKAGES = "hyphen-sk"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-sk-0.20031227-34.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-sk = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-sk-0.20031227-34.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-sk}"
RDEPENDS:hyphen-sk = " \
 hyphen \
"
