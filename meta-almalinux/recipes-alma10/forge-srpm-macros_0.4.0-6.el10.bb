
inherit dnf-bridge

PN = "forge-srpm-macros"
PE = "0"
PV = "0.4.0"
PR = "6.el10"
PACKAGES = "forge-srpm-macros"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/forge-srpm-macros-0.4.0-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_forge-srpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/forge-srpm-macros-0.4.0-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_forge-srpm-macros}"
RDEPENDS:forge-srpm-macros = " \
 redhat-rpm-config \
"
