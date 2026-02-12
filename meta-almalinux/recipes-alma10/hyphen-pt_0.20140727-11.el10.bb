
inherit dnf-bridge

PN = "hyphen-pt"
PE = "0"
PV = "0.20140727"
PR = "11.el10"
PACKAGES = "hyphen-pt hyphen-pt-BR"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-pt-0.20140727-11.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-pt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-pt-0.20140727-11.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-pt}"
RDEPENDS:hyphen-pt = " \
 hyphen \
"

URI_hyphen-pt-BR = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-pt-BR-0.20140727-11.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-pt-BR}"
RDEPENDS:hyphen-pt-BR = " \
 hyphen \
"
