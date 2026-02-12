
inherit dnf-bridge

PN = "hyphen-ia"
PE = "0"
PV = "0.20050628"
PR = "30.el10"
PACKAGES = "hyphen-ia"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-ia-0.20050628-30.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-ia = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-ia-0.20050628-30.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-ia}"
RDEPENDS:hyphen-ia = " \
 hyphen \
"
