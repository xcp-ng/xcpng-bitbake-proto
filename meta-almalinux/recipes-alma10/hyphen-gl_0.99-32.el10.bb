
inherit dnf-bridge

PN = "hyphen-gl"
PE = "0"
PV = "0.99"
PR = "32.el10"
PACKAGES = "hyphen-gl"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-gl-0.99-32.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-gl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-gl-0.99-32.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-gl}"
RDEPENDS:hyphen-gl = " \
 hyphen \
"
