
inherit dnf-bridge

PN = "udica"
PE = "0"
PV = "0.2.8"
PR = "6.el10"
PACKAGES = "udica"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/udica-0.2.8-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_udica = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/udica-0.2.8-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_udica}"
RDEPENDS:udica = " \
 python3 \
 container-selinux \
 python3-libselinux \
 python3-libsemanage \
"
