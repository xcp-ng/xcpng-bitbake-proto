
inherit dnf-bridge

PN = "sed"
PE = "0"
PV = "4.9"
PR = "3.el10"
PACKAGES = "sed"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/sed-4.9-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_sed = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/sed-4.9-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_sed}"
RDEPENDS:sed = " \
 glibc \
 libselinux \
 libacl \
"
