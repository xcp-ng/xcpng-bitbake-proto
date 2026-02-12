
inherit dnf-bridge

PN = "dcraw"
PE = "0"
PV = "9.28.0"
PR = "25.el10"
PACKAGES = "dcraw"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/dcraw-9.28.0-25.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_dcraw = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dcraw-9.28.0-25.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dcraw}"
RDEPENDS:dcraw = " \
 glibc \
 lcms2 \
 libjpeg-turbo \
 jasper-libs \
"
